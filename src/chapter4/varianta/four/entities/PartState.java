package chapter4.varianta.four.entities;

import java.util.Objects;

/**
 *
 * @author Sukhocheva Maryana
 */
public class PartState {
    private String name;
    private double area;

    public PartState() {
    }

    public PartState(String name) {
        this.name = name;
    }

    public PartState(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.area) ^ (Double.doubleToLongBits(this.area) >>> 32));
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
        final PartState other = (PartState) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.area) != Double.doubleToLongBits(other.area)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PartState{" + "name=" + name + ", area=" + area + '}';
    }
    
   
    
}
