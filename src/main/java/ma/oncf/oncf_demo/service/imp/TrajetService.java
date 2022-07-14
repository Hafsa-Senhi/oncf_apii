package ma.oncf.oncf_demo.service.imp;


import ma.oncf.oncf_demo.dto.Trajetdto;
import ma.oncf.oncf_demo.mappers.TrajetMappers;
import ma.oncf.oncf_demo.model.Gare;
import ma.oncf.oncf_demo.model.Train;
import ma.oncf.oncf_demo.model.Trajet;
import ma.oncf.oncf_demo.repository.GareRepository;
import ma.oncf.oncf_demo.repository.TrainRepository;
import ma.oncf.oncf_demo.repository.TrajetRepository;
import ma.oncf.oncf_demo.service.ITrajetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TrajetService implements ITrajetService {

    @Autowired
    TrajetRepository trajetRepository;

    @Autowired
    GareRepository gareRepository;

    @Autowired
    TrainRepository trainRepository;

    @Autowired
    TrajetMappers trajetMappers;

    @Override
    public Trajet findByCode(Long code) {
        Optional<Trajet> trajet = trajetRepository.findById(code);
        return trajet.get();
    }

    @Override
    public List<Trajet> findAll() {
        return trajetRepository.findAll();
    }



    @Override
    public List<Trajet> save(Trajetdto trajetdto){
        Trajet trajet = trajetMappers.toTrajet(trajetdto);
        Optional<Gare> gare_depart=gareRepository.findById(trajetdto.getGareDepart());
        Optional<Gare> gare_arrive=gareRepository.findById(trajetdto.getGareArrive());
        Optional<Train> train = trainRepository.findById(trajetdto.getTrain());
        trajet.setGareDepart(gare_depart.get());
        trajet.setGareArrive(gare_arrive.get());
        trajet.setTrain(train.get());
        trajetRepository.save(trajet);
        return trajetRepository.findAll();
    }



    @Override
    public List<Trajet> findByDate(Date date, Long id_gare_depart, Long id_gare_arrive)
    {
        Optional<Gare> gare_depart = gareRepository.findById(id_gare_depart);
        Optional<Gare> gare_Arrive = gareRepository.findById(id_gare_arrive);
        List<Trajet> listTrajet;
        listTrajet = trajetRepository.find(date,gare_depart.get(),gare_Arrive.get());
        return listTrajet;
    }
}
