package chapter4.varianta.four.action;

import chapter4.varianta.four.entities.City;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class OutputData {
        //вывод массива городов
    public static void outputCities(List<City> cities) {
    for (City city : cities) {
            System.out.println(city.toString());
            System.out.println();
        }
    }
}

