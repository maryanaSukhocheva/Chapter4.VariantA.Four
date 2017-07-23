package chapter4.varianta.four.entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Sukhocheva Maryana
 */

public class State {
    private List<PartState> partsState;
    private String name;
    private double area;
    private City capital;

     public State() {
          partsState = new ArrayList<PartState>();
     }

     public State(String name) {
         this.name = name;
          partsState = new ArrayList<PartState>();
     }

    public State(String name, double area) {
        this.name = name;
        this.area = area;
        partsState = new ArrayList<PartState>();
    }

    public State(String name, double area, City capital) {
        this.name = name;
        this.area = area;
        this.capital = capital;
        partsState = new ArrayList<PartState>();
    }
     
     

    public List<PartState> getPartsState() {
        return partsState;
    }

   public void setPartsState (List<PartState> partsState) {
        if (partsState!=null) {
            this.partsState = partsState;
        }
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

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public void addPartState(PartState part) {
         if (part!=null) {
            getPartsState().add(part);
            System.out.println("Часть государства добавлена");
         }
         
     }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.partsState);
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.area) ^ (Double.doubleToLongBits(this.area) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.capital);
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
        final State other = (State) obj;
        if (!Objects.equals(this.partsState, other.partsState)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.area) != Double.doubleToLongBits(other.area)) {
            return false;
        }
        if (!Objects.equals(this.capital, other.capital)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("Государство").append(" ");
        str.append(getName()).append("\n");
        str.append("Столица").append(" ");
        str.append(getCapital().getName()).append("\n");
        str.append("Площадь").append(" ");
        str.append(getArea()).append("\n");
        str.append("Области:").append(" ");
        for (PartState partState : getPartsState()) {
          if (partState.getClass().getName().equals("chapter4.varianta.four.entities.Area"))
            str.append(partState.getName()).append("\n");  
        }
        
        return  str.toString();
       }
    
   
}

