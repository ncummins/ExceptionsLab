package lab0.solution;

import java.util.Calendar;
import lab0.*;
import java.util.Date;

/**
 * This is a domain object in the HRSuperProgram application,
 * and represents a simulation of a real world employee.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 * 
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    public static final int MIN_VACATION_DAYS = 0;
    public static final int MIN_NAME_LENGTH = 2;
    public static final String VAC_ERR_MSG = "Days must be between 0 & 28";
    public static final String NAME_ERR_MSG = "Name must be at least 2 characters";
    public static final String DATE_ERR_MSG = "Hire date must be after current date";
    public static final String SSN_ERR_MSG = "SSN must be 9 numbers";
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacationAllowed;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacationAllowed = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.hireDate = hireDate;
        this.daysVacationAllowed = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacationAllowed;
    }

    /**
     * Sets the days of vacation allowed for an employee
     * and persists the data in the current storage system.
     * 
     * @param daysVacationAllowed - the days of vacation originally allowed
     * @throws IllegalVacationDaysException if value < min || > max
     */
    public void setDaysVacation(int daysVacationAllowed)
            throws IllegalVacationDaysException {
        
        if (daysVacationAllowed < MIN_VACATION_DAYS 
                || daysVacationAllowed > MAX_VACATION_DAYS){
            throw new IllegalVacationDaysException();
        }
        this.daysVacationAllowed = daysVacationAllowed;
    }

    /**
     * Gets a validated first name
     * @return a validated first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name for an employee and persists the data
     * in the current storage system.
     * 
     * @param firstName - first name of the employee
     * @throws IllegalArgumentException if null || length < 2
     */
    public void setFirstName(String firstName) throws IllegalArgumentException{
        
        if (firstName == null || firstName.length() < MIN_NAME_LENGTH){
            throw new IllegalArgumentException(NAME_ERR_MSG);
        }
        this.firstName = firstName;
    }

    /**
     * Gets a validated hire date.
     * @return a validated hire date
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * Sets the hire date for an employee and persists the data
     * in the current storage system.
     * 
     * @param hireDate - hire date of the employee
     * @throws IllegalArgumentException if date is before today
     */
    public void setHireDate(Date hireDate) throws IllegalArgumentException{
        Date d = new Date();
        if (hireDate.before(d)){
            throw new IllegalArgumentException(DATE_ERR_MSG);
        }
        this.hireDate = hireDate;
    }

    /**
     * Gets a validated last name.
     * @return a validated last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name for an employee and persists the data
     * in the current storage system.
     * 
     * @param lastName - last name of the employee
     * @throws IllegalArgumentException if null || length < min
     */
    public void setLastName(String lastName) throws IllegalArgumentException{
        
        if (lastName == null || lastName.length() < MIN_NAME_LENGTH){
            throw new IllegalArgumentException(NAME_ERR_MSG);
        }
        this.lastName = lastName;
    }

    /**
     * Gets a validated social security number.
     * @return a validated social security number
     */
    public final String getSsn() {
        return ssn;
    }

    /**
     * Sets the social security number for an employee and persists the data
     * in the current storage system.
     * 
     * @param ssn
     * @throws IllegalArgumentException 
     */
    public void setSsn(String ssn) throws IllegalArgumentException{
        
        if(ssn == null || ssn.equals("") || ssn.length() != 9){
            throw new IllegalArgumentException(SSN_ERR_MSG);
        }
        this.ssn = ssn;
    }
    
    
}
