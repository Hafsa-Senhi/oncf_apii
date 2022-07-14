package ma.oncf.oncf_demo.service;


import ma.oncf.oncf_demo.dto.StationBusDto;
import ma.oncf.oncf_demo.model.Gare;
import ma.oncf.oncf_demo.model.StationBus;

import java.util.List;

public interface IStationBusService {
    Gare findByCode(Long code);
    Gare findByName(String name);
    List<StationBus> findAll();
    List<StationBus> save(StationBusDto stationBusDto);

    List<StationBus> delete(Long id);
}
