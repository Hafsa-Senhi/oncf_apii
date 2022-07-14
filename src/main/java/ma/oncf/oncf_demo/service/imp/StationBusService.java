package ma.oncf.oncf_demo.service.imp;


import ma.oncf.oncf_demo.dto.StationBusDto;
import ma.oncf.oncf_demo.mappers.StationBusMappers;
import ma.oncf.oncf_demo.model.Gare;
import ma.oncf.oncf_demo.model.StationBus;
import ma.oncf.oncf_demo.repository.GareRepository;
import ma.oncf.oncf_demo.repository.StationBusRepository;
import ma.oncf.oncf_demo.service.IStationBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StationBusService implements IStationBusService {

    @Autowired
    StationBusRepository stationBusRepository;

    @Autowired
    StationBusMappers stationBusMappers;

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
    public List<StationBus> findAll() {
        return stationBusRepository.findAll();
    }

    @Override
    public List<StationBus> save(StationBusDto stationBusDto) {
        StationBus stationBus = stationBusMappers.toStationBus(stationBusDto);
         Optional<Gare> gare =  gareRepository.findById(stationBusDto.getGare_id());
         stationBus.setGare_id(gare.get());
         stationBusRepository.save(stationBus);
        return stationBusRepository.findAll();
    }

    @Override
    public List<StationBus> delete(Long id) {
        Optional<StationBus> stationBus = stationBusRepository.findById(id);
        stationBusRepository.delete(stationBus.get());
        return stationBusRepository.findAll();
    }
}
