package ma.oncf.oncf_demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StationBusDto {

    private Long gare_id;

    private double longitude;

    private double latitude;

    private String designation;
}
