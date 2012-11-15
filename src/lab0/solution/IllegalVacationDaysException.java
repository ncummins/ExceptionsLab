
package lab0.solution;

public class IllegalVacationDaysException extends Exception{
    private static final String MSG =  "Days must be between 0 & 28";

    public IllegalVacationDaysException() {
    }

    public IllegalVacationDaysException(String message) {
        super(MSG);
    }

    public IllegalVacationDaysException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public IllegalVacationDaysException(Throwable cause) {
        super(cause);
    }
    
    public String getMessage(){
        return MSG;
    }
    
    public String getLocalizedMessage() {
        return MSG;
    }
    
}
