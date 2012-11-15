
package lab0.solution;


/**
 * Provides various services that an employee or other domain might use.
 * (Serves as a facade for all employee services.)
 * CAUTION: currently not all methods are validated.
 * Check method documentation for more info.
 * 
 * @author ncummins
 */
public class EmployeeService {
    
    public void assignVacationDays(int days) { 
        Employee e = new Employee();
        try{
            e.setDaysVacation(days);
        } catch(IllegalVacationDaysException ex){
            System.out.println(ex);
        }
        
    }
    
}
