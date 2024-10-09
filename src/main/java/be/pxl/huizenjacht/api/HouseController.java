package be.pxl.huizenjacht.api;

import be.pxl.huizenjacht.House;
import be.pxl.huizenjacht.HouseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/houses")
public class HouseController {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(HouseController.class);
    private final HouseService houseService;

    @Autowired
    public HouseController(HouseService houseService){
        this.houseService = houseService;
    }

    @PostMapping
    public void addHouse(@RequestBody House house){
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("Adding house [" + house.getName() +"]");
        }
        houseService.addHouse(house);
    }

    @GetMapping
    public List<House> getHouses(){
        return houseService.getHouses();
    }

    @PutMapping("/{code}")
    public void UpdateHouse(@PathVariable String code, @RequestBody House house){
        houseService.updateHouseByCode(code, house);
    }

    @DeleteMapping("/{code}")
    public void DeleteHouse(@PathVariable String code){
        houseService.deleteHouse(code);
    }
}
