package ma.oncf.oncf_demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Trajet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trajetId")
    private long id;
    private Date dateDepart;
    private Date dateArrive;
    private String heureDepart;
    private String heureArrive;
    private int retardMinutes;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gareDepart_id", referencedColumnName = "code")

    private Gare gareDepart;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gareArrive_id", referencedColumnName = "code")

    private Gare gareArrive;

    @OneToOne(cascade = CascadeType.ALL)

    private Train train;


}
