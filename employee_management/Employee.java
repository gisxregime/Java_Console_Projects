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

    public String name() {
        return name;
    }

    public String email() {
        return email;
    }

    public String phone() {
        return phone;
    }

    public String password() {
        return password;
    }

    public void setName(String name){
        this.name = name;
    }
}
