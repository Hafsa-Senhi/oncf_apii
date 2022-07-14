package ma.oncf.oncf_demo.service;



import ma.oncf.oncf_demo.dto.Trajetdto;
import ma.oncf.oncf_demo.model.Trajet;

import java.util.Date;
import java.util.List;

public interface ITrajetService {

    Trajet findByCode(Long code);
    List<Trajet> findAll();
    List<Trajet> save(Trajetdto trajet);
    List<Trajet> findByDate(Date date, Long id_gare_depart, Long id_gare_arrive);

}
