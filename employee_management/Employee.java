package employee_management;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String password;

    public Employee(int id, String name,
            String email, String phone,
            String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void display(){
        System.out.println("\nEmployee Information");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}

// I initialized the variables id, name, email, phone, password to a private access modifier. Made a constructor in order to access to other methods and class.
// Get the variable value using the getters class methods and set it and make a setter methods