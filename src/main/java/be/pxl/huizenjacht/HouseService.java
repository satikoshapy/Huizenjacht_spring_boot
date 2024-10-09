package be.pxl.huizenjacht;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HouseService {
    private final List<House> houses = new ArrayList<>();

    public void addHouse(House house ){
        houses.add(house);
    }

    public List<House> getHouses(){
        return houses;
    }

    public void updateHouseByCode(String code, House house){
        int index = -1;
        for (int i = 0; i < houses.size(); i++) {
            if (houses.get(i).getCode().equals(code)) {
                index = i;
                break;
            }
        }
        if (index != -1){
            houses.set(index, house);
        }
    }

    public void deleteHouse(String code){
        for (House house : houses) {
            if (house.getCode().equals(code)) {
                houses.remove(house);
            }
        }
    }
}
