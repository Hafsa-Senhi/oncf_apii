package ma.oncf.oncf_demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StationBus {

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
