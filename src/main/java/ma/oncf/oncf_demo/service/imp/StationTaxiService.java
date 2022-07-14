package ma.oncf.oncf_demo.service.imp;


import ma.oncf.oncf_demo.dto.StationTaxiDto;
import ma.oncf.oncf_demo.mappers.StationTaxiMappers;
import ma.oncf.oncf_demo.model.Gare;
import ma.oncf.oncf_demo.model.StationTaxi;
import ma.oncf.oncf_demo.repository.GareRepository;
import ma.oncf.oncf_demo.repository.StationTaxiRepository;
import ma.oncf.oncf_demo.service.IStationTaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StationTaxiService implements IStationTaxiService {

    @Autowired
    StationTaxiRepository stationTaxiRepository;
    @Autowired
    StationTaxiMappers stationTaxiMappers;
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
    public List<StationTaxi> findAll() {
        return stationTaxiRepository.findAll();
    }

    @Override
    public List<StationTaxi> save(StationTaxiDto stationTaxiDto)
    {
        StationTaxi stationTaxi = stationTaxiMappers.toStationTaxi(stationTaxiDto);
        Optional<Gare> gare =  gareRepository.findById(stationTaxiDto.getGare_id());
        stationTaxi.setGare_id(gare.get());
        stationTaxiRepository.save(stationTaxi);
        return stationTaxiRepository.findAll();
    }
}
