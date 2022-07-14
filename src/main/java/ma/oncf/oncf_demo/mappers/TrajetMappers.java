package ma.oncf.oncf_demo.mappers;

import ma.oncf.oncf_demo.dto.Trajetdto;
import ma.oncf.oncf_demo.model.Trajet;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TrajetMappers {

    @Autowired
    private ModelMapper modelMapper;

    public Trajet toTrajet(Trajetdto trajetdto)
    {
        Trajet trajet = modelMapper.map(trajetdto,Trajet.class);
        return trajet;
    }
}
