package ma.oncf.oncf_demo.service;


import ma.oncf.oncf_demo.dto.StationTramDto;
import ma.oncf.oncf_demo.model.Gare;
import ma.oncf.oncf_demo.model.StationTram;

import java.util.List;

public interface IStationTramService {
    Gare findByCode(Long code);
    Gare findByName(String name);
    List<StationTram> findAll();
    public List<StationTram> save(StationTramDto stationTramDo);
}
