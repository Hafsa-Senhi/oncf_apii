package ma.oncf.oncf_demo.web;


import ma.oncf.oncf_demo.dto.StationBusDto;
import ma.oncf.oncf_demo.dto.StationTaxiDto;
import ma.oncf.oncf_demo.dto.StationTramDto;
import ma.oncf.oncf_demo.dto.Trajetdto;
import ma.oncf.oncf_demo.model.*;
import ma.oncf.oncf_demo.repository.TrainRepository;
import ma.oncf.oncf_demo.service.imp.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/oncf")
public class GareController {

    @Autowired
    TrainRepository trainRepository;

    @Autowired
    private GareService gareService;

    @Autowired
    private StationTramService stationTramService;

    @Autowired
    private StationBusService stationBusService;

    @Autowired
    private StationTaxiService stationTaxiService;

    @Autowired
    private TrajetService trajetService;

    ///////////// Web gare /////////////////////////////////////////////////

    @PostMapping("/gare/save")
    private List<Gare> savegare(@RequestBody Gare gare)
    {
        return gareService.save(gare);
    }


    @PostMapping("/gare/all")
    private List<Gare> findAllGare()
    {
        return gareService.findAll();
    }

    ///////////// Web Station Tram /////////////////////////////////////////////////

    @PostMapping("/StationTram/save")
    private List<StationTram> saveStationTram(@RequestBody StationTramDto stationTram)
    {
        return stationTramService.save(stationTram);
    }

    @PostMapping("/StationTram/all")
    private List<StationTram> findAllStationTram()
    {
        return stationTramService.findAll();
    }

    ///////////// Web Station bus /////////////////////////////////////////////////

    @PostMapping("/StationBus/save")
    private List<StationBus> saveStationBus(@RequestBody StationBusDto stationBusDto)
    {
        return stationBusService.save(stationBusDto);
    }

    @PostMapping("/StationBus/all")
    private List<StationBus> findAllStationBus()
    {
        return stationBusService.findAll();
    }

    @PostMapping("/StationBus/delete")
    private List<StationBus> delete(@RequestBody Long code)
    {
        return stationBusService.delete(code);
    }

    ///////////// Web Station Taxi /////////////////////////////////////////////////

    @PostMapping("/StationTaxi/save")
    private List<StationTaxi> saveStationTaxi(@RequestBody StationTaxiDto stationTaxi)
    {
        return stationTaxiService.save(stationTaxi);
    }

    @PostMapping("/StationTaxi/all")
    private List<StationTaxi> findAllStationTaxi()
    {
        return stationTaxiService.findAll();
    }

    //////////////////////////////// Trajet web ////////////////////////////////////////

    @PostMapping("/trajet/save")
    private List<Trajet> save(@RequestBody Trajetdto trajetdto)
    {
        return trajetService.save(trajetdto);
    }

    @PostMapping("/trajet/findTrajet")
    private List<Trajet> find(@RequestBody Trajetdto trajetdto)
    {
        return trajetService.findByDate(trajetdto.getDateDepart(),trajetdto.getGareDepart(),trajetdto.getGareArrive());

    }

    /////////////////////////////// Train Web ////////////////////////////////////////////

    @PostMapping("/train/save")
    private Train save(@RequestBody Train train)
    {
        return trainRepository.save(train);
    }


}
