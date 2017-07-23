package chapter4.varianta.four.main;

import chapter4.varianta.four.action.InputData;
import chapter4.varianta.four.action.OutputData;
import chapter4.varianta.four.action.StateAction;
import chapter4.varianta.four.entities.City;
import chapter4.varianta.four.entities.PartState;
import chapter4.varianta.four.entities.State;
import chapter4.varianta.four.exception.StateException;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws StateException {
        State state = new State("Казахстан", 2725000); 
        System.out.println("Создано государство " + state.getName());
        
        List<PartState> partsState = InputData.generatePartsState(state);
        state.setCapital((City) partsState.get(1));
        state.setPartsState(partsState);
        System.out.println("Столица - " + StateAction.outputCapital(state));
        System.out.println("Количество областей - " + StateAction.getAmountAreas(state));
        System.out.println("Площадь - " + StateAction.outputAreaState(state));
        List<City> areaCenters = StateAction.getAreaCenters(state);
        System.out.println("Областные центры: ");
        OutputData.outputCities(areaCenters);
          
    }
}
