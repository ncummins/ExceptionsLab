package lab1.solution;

import lab1.*;
import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;
    private static final String ERR_MSG = "That's not a valid name";

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();

        try{
            String fullName = JOptionPane.showInputDialog("Enter full name:");
            String lastName = app.extractLastName(fullName);
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        } catch(ArrayIndexOutOfBoundsException ae){
            JOptionPane.showMessageDialog(null, ERR_MSG);
        }
        
    }
    
    public String extractLastName(String fullName) throws ArrayIndexOutOfBoundsException{
        if (!fullName.contains(" ")) {
            throw new ArrayIndexOutOfBoundsException();
        }
        String[] nameParts = fullName.split(" ");
        return nameParts[LAST_NAME_IDX];
    }

}
