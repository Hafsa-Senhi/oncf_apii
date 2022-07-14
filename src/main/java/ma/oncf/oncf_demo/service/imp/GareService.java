package ma.oncf.oncf_demo.service.imp;


import ma.oncf.oncf_demo.model.Gare;
import ma.oncf.oncf_demo.repository.GareRepository;
import ma.oncf.oncf_demo.service.IGareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GareService implements IGareService {
    @Autowired
    GareRepository gareRepository;

    @Override
    public Gare findByCode(Long code) {
        return null;
    }



    @Override
    public Gare findByName(String name) {
      /*  Optional<Gare> gare = Optional.ofNullable(gareRepository.finByName(name));
        if(gare.isPresent())
        {
                return gare.get();
        }*/
        return null;
    }

    @Override
    public List<Gare> findAll() {
        return gareRepository.findAll();
    }

    @Override
    public List<Gare> save(Gare gare) {
         gareRepository.save(gare);
         return gareRepository.findAll();
    }

}
