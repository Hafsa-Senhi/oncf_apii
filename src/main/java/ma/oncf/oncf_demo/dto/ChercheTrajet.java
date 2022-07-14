package ma.oncf.oncf_demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ma.oncf.oncf_demo.model.Gare;

@Getter
@Setter
@ToString
public class ChercheTrajet {

    private Gare gareDepart;
    private Gare gareDarrive;

}
