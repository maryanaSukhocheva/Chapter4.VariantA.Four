package chapter4.varianta.four.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Area extends PartState {
   List <District> districts = new ArrayList<>();
   private City areaCenter;
    
    public Area() {
    }

    public Area(String name) {
        super(name);
    }

    public Area(String name, City areaCenter) {
        super(name);
        this.areaCenter = areaCenter;
    }

    public Area(String name, double area) {
        super(name, area);
    }

    public Area(City areaCenter, String name, double area) {
        super(name, area);
        this.areaCenter = areaCenter;
    }
    

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public City getAreaCenter() {
        for (District district : getDistricts()) {
            for (City city : district.getCities()) {
                if (city.isIsAreaCenter()) {
                    return areaCenter;
                }
            }
        }
        return areaCenter;
    }

    public void setAreaCenter(City areaCenter) {
        this.areaCenter = areaCenter;
    }
    
    public void addDistricts(District district) {
         if (district!=null) {
            getDistricts().add(district);
            System.out.println("Район добавлен в область");
         }
         
     }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.districts);
        hash = 47 * hash + Objects.hashCode(this.areaCenter);
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
        final Area other = (Area) obj;
        if (!Objects.equals(this.districts, other.districts)) {
            return false;
        }
        if (!Objects.equals(this.areaCenter, other.areaCenter)) {
            return false;
        }
        return true;
    }

   

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("Область").append(" ");
        str.append(getName()).append("\n");
        str.append("Площадь").append(" ");
        str.append(getArea()).append("\n");
        str.append("Районы:").append(" ");
        for (District district : getDistricts()) {
          str.append(district.getName()).append("\n");  
        }
        str.append("Областной центр").append(" ");
        str.append(getAreaCenter().getName()).append("\n");
        return  str.toString();
       }
       
}
