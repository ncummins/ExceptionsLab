
package lab3.solution;

/**
 * This class is responsible for generating the exception and message.
 * 
 * @author ncummins
 */
public class InvalidNameException extends Exception{
    private static final String MSG =  "That is not a valid name";

    /**
     * Initializes a newly created InvalidNameException object.
     */
    public InvalidNameException() {
    }

    /**
     * Initializes a newly created InvalidNameException object.
     * @param message is ignored
     */
    public InvalidNameException(String message) {
        super(MSG);
    }

    /**
     * Initializes a newly created InvalidNameException object.
     * @param message is ignored
     * @param cause 
     */
    public InvalidNameException(String message, Throwable cause) {
        super(MSG, cause);
    }

    /**
     * Initializes a newly created InvalidNameException object.
     * @param cause 
     */
    public InvalidNameException(Throwable cause) {
        super(cause);
    }
    
    /**
     * Gets the exception message.
     * @return the message
     */
    public String getMessage(){
        return MSG;
    }
    
}
