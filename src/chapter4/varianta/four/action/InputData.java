package chapter4.varianta.four.action;

import chapter4.varianta.four.entities.Area;
import chapter4.varianta.four.entities.City;
import chapter4.varianta.four.entities.District;
import chapter4.varianta.four.entities.PartState;
import chapter4.varianta.four.entities.State;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Sukhocheva Maryana
 */
public class InputData {
   
 
    public static List<PartState> generatePartsState(State state)  {
        List<PartState> arrayOfPartState = new ArrayList<PartState>();
        try {
            City city1 = new City ("Алматы", true); 
            arrayOfPartState.add(city1);
            City city2 = new City ("Астана", true); 
            arrayOfPartState.add(city2);
            City city3 = new City ("Экибастуз", false);
            arrayOfPartState.add(city3);
            City city4 = new City ("Караганда", true); 
            arrayOfPartState.add(city4);
            City city5 = new City ("Балхаш", false);  
            arrayOfPartState.add(city5);
            City city6 = new City ("Абай", false);  
            arrayOfPartState.add(city6);
            City city7 = new City ("Аксу", false);
            arrayOfPartState.add(city7);
            District district1 = new District ("Карагандинский");
            district1.addCities(city4);
            district1.addCities(city6);
            arrayOfPartState.add(district1);
            District district2 = new District ("Алматинский");
            district2.addCities(city1);
            arrayOfPartState.add(district2);
            District district3 = new District ("Павлодарский");
            district3.addCities(city3);
            district3.addCities(city7);
            arrayOfPartState.add(district3);
            District district4 = new District ("Жезказганский");
            district4.addCities(city5);
            arrayOfPartState.add(district4);
            District district5 = new District ("Акмолинский");
            district5.addCities(city2);
            arrayOfPartState.add(district5);
            Area area1 = new Area ("Акмолинская");
            area1.addDistricts(district5);
            arrayOfPartState.add(area1);
            Area area2 = new Area ("Алматинская");
            area2.addDistricts(district2);
            arrayOfPartState.add(area2);
            Area area3 = new Area ("Карагандинская");
            area3.addDistricts(district1);
            area3.addDistricts(district4);
            arrayOfPartState.add(area3);
            Area area4 = new Area ("Павлодарская");
            area4.addDistricts(district3);
            arrayOfPartState.add(area4);
               
         } catch (Exception ex) {
            System.err.println("Error when creating parts of the state");
        }
        System.out.println("Создан массив областей государства");
        return arrayOfPartState;

    }
   
}
