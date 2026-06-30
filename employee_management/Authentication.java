package employee_management;

import java.util.ArrayList;

public class Authentication {

    public static boolean login(ArrayList<Employee> employees, String email, String password){

        for(Employee emp : employees){
            
            if(emp.getEmail().equals(email) && emp.getPassword().equals(password)){
                
                return true;
            }
        }
        return false;
    }    
}


