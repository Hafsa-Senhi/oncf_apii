package ma.oncf.oncf_demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Trajetdto {
    private Date dateDepart;
    private Date dateArrive;
    private String heureDepart;
    private String heureArrive;
    private int retardMinutes;
    private long gareDepart;
    private long gareArrive;
    private long train;
}
