package chapter4.varianta.four.exception;
/**
 *
 * @author Sukhocheva Maryana
 */
public class StateException extends Exception{
    public StateException()    {
    }

    public StateException(String msg) {
        System.err.println(msg);

    }

  
 }
