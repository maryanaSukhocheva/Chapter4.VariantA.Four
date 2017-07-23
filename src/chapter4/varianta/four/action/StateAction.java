package chapter4.varianta.four.action;

import chapter4.varianta.four.entities.City;
import chapter4.varianta.four.entities.PartState;
import chapter4.varianta.four.entities.State;
import chapter4.varianta.four.exception.StateException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class StateAction {
   public StateAction() {
       }
 
   public static void addPartState(State state, PartState part) throws StateException{
        if (state!=null && part!=null) {
            state.addPartState(part);
            
        } else {
            throw new StateException("State's parameters incorrect");
        }
     }
   
    public static String  outputCapital(State state) throws StateException{
        String capital = "";
        if (state!=null) {
            capital = state.getCapital().getName();
        } else {
            throw new StateException("State's parameters incorrect");
        }
        return capital;
        
     }  
    public static String  outputAreaState(State state) throws StateException{
        String area = "";
        if (state!=null) {
            area = String.valueOf(state.getArea());
        } else {
           throw new StateException("State's parameters incorrect");
        }
        return area;
     }  
   public static int getAmountAreas(State state) throws StateException{
       int amount = 0; 
       if (state!=null) {
            
            for (PartState partState : state.getPartsState()) {
                if (partState.getClass().getName().equals("chapter4.varianta.four.entities.Area"))
                  amount++;  
              }
        
       
        } else {
            throw new StateException("State's parameters incorrect");
        }
        return amount;
     }
 
   
   public static List<City> getAreaCenters(State state) throws StateException{
       List<City> cities = new ArrayList<City> ();
       if (state!=null) {
            
            for (PartState partState : state.getPartsState()) {
                if (partState.getClass().getName().equals("chapter4.varianta.four.entities.City")) {
                City city = (City) partState;
                if (city.isIsAreaCenter()) {
                    cities.add(city);
                }
              }
        
            }
            
        } else {
            throw new StateException("State's parameters incorrect");
        }
        return cities;
     }

}
