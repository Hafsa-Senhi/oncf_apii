package ma.oncf.oncf_demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "train")
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    private String heurDep;

    private String heurArrive;

    private Date dateDepart;

    private Date dateArrive;

    private String name;

    private String designation;

  /*  @ManyToOne
    @JoinColumn(name="gare_id", nullable = true)
    @JsonIgnore
    private Gare gare_id;*/

    @OneToOne(mappedBy = "train")
    @JsonIgnore
    private Trajet trajetArrive;
}
