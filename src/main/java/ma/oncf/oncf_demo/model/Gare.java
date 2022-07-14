package ma.oncf.oncf_demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Gare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    private String name;

    private double longitude_gare;

    private double latitude_gare;

    @ManyToOne
    @JoinColumn(name="ville_id", nullable = true)
    @JsonIgnore
    private Ville ville_id;

    @OneToMany(mappedBy = "gare_id")
    private List<StationBus> stationBuses;

    @OneToMany(mappedBy = "gare_id")
    private List<StationTram> stationTrams;

    @OneToMany(mappedBy = "gare_id")
    private List<StationTaxi> stationTaxis;

    /*@OneToMany(mappedBy = "gare_id")
    private List<Train> trains;*/

    @OneToOne(mappedBy = "gareDepart")
    @JsonIgnore
    private Trajet trajetDepart;

    @OneToOne(mappedBy = "gareArrive")
    @JsonIgnore
    private Trajet trajetArrive;

}
