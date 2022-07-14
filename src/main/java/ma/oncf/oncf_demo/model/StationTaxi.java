package ma.oncf.oncf_demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="station_taxi")
public class StationTaxi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    private double longitude;

    private double latitude;

    private String designation;

    @ManyToOne
    @JoinColumn(name="gare_id", nullable = true)
    @JsonIgnore
    private Gare gare_id;


}
