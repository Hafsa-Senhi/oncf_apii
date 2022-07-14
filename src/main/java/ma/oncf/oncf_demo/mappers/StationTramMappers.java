package ma.oncf.oncf_demo.mappers;

import ma.oncf.oncf_demo.dto.StationTramDto;
import ma.oncf.oncf_demo.model.StationTram;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StationTramMappers {
    @Autowired
    private ModelMapper modelMapper;
    public StationTram toStationTam(StationTramDto stationTramDo)
    {
        StationTram stationTram = modelMapper.map(stationTramDo, StationTram.class);
        return stationTram;
    }
}
