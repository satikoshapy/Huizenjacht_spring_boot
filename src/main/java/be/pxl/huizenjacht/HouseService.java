package be.pxl.huizenjacht;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HouseService {
    private final List<House> houses = new ArrayList<>();

    Map<String, House> hashedHouses = new HashMap<>();



    public void addHouse(House house ){

        houses.add(house);
        hashedHouses.put(house.getCode(), house);
    }

    public List<House> getHouses(){
        return houses;
    }

    public void updateHouseByCode(String code, House house){
        /*int index = -1;
        for (int i = 0; i < houses.size(); i++) {
            if (houses.get(i).getCode().equals(code)) {
                index = i;
                break;
            }
        }
        if (index != -1){
            houses.set(index, house);
        }*/
        House houseByCode = hashedHouses.get(code);
        if (houseByCode != null){
            int houseIndex = houses.indexOf(houseByCode);
            houses.set(houseIndex, house);
        }

    }

    public void deleteHouse(String code){
        for (House house : houses) {
            if (house.getCode().equals(code)) {
                houses.remove(house);
                hashedHouses.remove(code);
            }
        }
    }
}
