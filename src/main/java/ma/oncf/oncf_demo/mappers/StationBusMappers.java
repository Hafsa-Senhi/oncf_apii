package ma.oncf.oncf_demo.mappers;



import ma.oncf.oncf_demo.dto.StationBusDto;
import ma.oncf.oncf_demo.model.StationBus;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StationBusMappers {
    @Autowired
    private ModelMapper modelMapper;
    public StationBus toStationBus(StationBusDto stationBusDto)
    {
        StationBus stationBus = modelMapper.map(stationBusDto, StationBus.class);
        return stationBus;
    }

}

