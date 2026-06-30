package employee_management;

public class Validator {
    
    public static boolean validateEmail(String email){
        return email.contains("@") && email.contains(".");
    }

    public static boolean validatePhone(String phone){
        return phone.matches("\\d{11}");
    }
}


// I made a validation for phone that must contain @ and .  
// Must also validate phone that matches 11 digits. The function called regex.