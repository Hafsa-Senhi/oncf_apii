package ma.oncf.oncf_demo.mappers;

import ma.oncf.oncf_demo.dto.StationTaxiDto;
import ma.oncf.oncf_demo.model.StationTaxi;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StationTaxiMappers {
    @Autowired
    private ModelMapper modelMapper;
    public StationTaxi toStationTaxi(StationTaxiDto stationTaxiDto)
    {
        StationTaxi stationTaxi = modelMapper.map(stationTaxiDto, StationTaxi.class);
        return stationTaxi;
    }
}
