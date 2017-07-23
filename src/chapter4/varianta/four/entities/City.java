package chapter4.varianta.four.entities;

/**
 *
 * @author Sukhocheva Maryana
 */
public class City extends PartState {
  // private boolean isCapital;
   private boolean isAreaCenter;

    public City() {
    }
    
    public City(boolean isAreaCenter) {
        this.isAreaCenter = isAreaCenter;
    }

    public City(String name, double area) {
        super(name, area);
    }

    public boolean isIsAreaCenter() {
        return isAreaCenter;
    }

    public City(String name, boolean isAreaCenter) {
        super(name);
        this.isAreaCenter = isAreaCenter;
    }
    
    public void setIsAreaCenter(boolean isAreaCenter) {
        this.isAreaCenter = isAreaCenter;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.isAreaCenter ? 1 : 0);
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
        final City other = (City) obj;
        if (this.isAreaCenter != other.isAreaCenter) {
            return false;
        }
        return true;
    }

     @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("Город").append(" ");
        str.append(getName()).append("\n");
        str.append("Областной центр").append(" ");
        str.append(isIsAreaCenter()).append("\n");
        return  str.toString();
       }   
    
}
