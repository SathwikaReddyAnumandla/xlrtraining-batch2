package PS001;

public class Employee {
    int ID;
    String FirstName;
    String LastName;
    String Address;
    Employee(){
        System.out.println(" Defaullt Constructor is created");

    }
    Employee(String FirstName,String LastName){
        this.FirstName=FirstName;
        this.LastName=LastName;
    }
    void getFullName(){
        System.out.println(FirstName+LastName);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("sathwika","reddy");
        e2.getFullName();
        
    }

}
