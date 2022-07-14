package ma.oncf.oncf_demo.service;



import ma.oncf.oncf_demo.dto.StationTaxiDto;
import ma.oncf.oncf_demo.model.Gare;
import ma.oncf.oncf_demo.model.StationTaxi;

import java.util.List;

public interface IStationTaxiService {
    Gare findByCode(Long code);
    Gare findByName(String name);
    List<StationTaxi> findAll();
    public List<StationTaxi> save(StationTaxiDto stationTaxiDto);
}
