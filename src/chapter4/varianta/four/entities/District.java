package chapter4.varianta.four.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Sukhocheva Maryana
 */
public class District extends PartState {
    List <City> cities = new ArrayList<>();
    public District() {
        
    }

    public District(String name) {
        super(name);
    }

    public District(String name, double area) {
        super(name, area);
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
    public void addCities(City city) {
         if (city!=null) {
            getCities().add(city);
            System.out.println("Город добавлен в район");
         }
         
     }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.cities);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final District other = (District) obj;
        if (!Objects.equals(this.cities, other.cities)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("Район").append(" ");
        str.append(getName()).append("\n");
        str.append("Города:").append(" ");
        for (City city: getCities()) {
          str.append(city.getName()).append("\n");  
        }
        return  str.toString();
       }
  
    
}
