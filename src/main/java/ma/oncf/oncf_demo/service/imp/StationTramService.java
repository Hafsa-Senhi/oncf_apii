package ma.oncf.oncf_demo.service.imp;


import ma.oncf.oncf_demo.dto.StationTramDto;
import ma.oncf.oncf_demo.mappers.StationTramMappers;
import ma.oncf.oncf_demo.model.Gare;
import ma.oncf.oncf_demo.model.StationTram;
import ma.oncf.oncf_demo.repository.GareRepository;
import ma.oncf.oncf_demo.repository.StationTramRepository;
import ma.oncf.oncf_demo.service.IStationTramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StationTramService implements IStationTramService {
    @Autowired
    StationTramRepository stationTramRepository;
    @Autowired
    StationTramMappers stationTramMappers;
    @Autowired
    GareRepository gareRepository;
    @Override
    public Gare findByCode(Long code) {
        return null;
    }

    @Override
    public Gare findByName(String name) {
        return null;
    }

    @Override
    public List<StationTram> findAll() {
        return stationTramRepository.findAll();
    }

    @Override
    public List<StationTram> save(StationTramDto stationTramDo)
    {
        StationTram stationTram = stationTramMappers.toStationTam(stationTramDo);
        Optional<Gare> gare =  gareRepository.findById(stationTramDo.getGare_id());
        stationTram.setGare_id(gare.get());
        stationTramRepository.save(stationTram);
        return stationTramRepository.findAll();
    }

}
