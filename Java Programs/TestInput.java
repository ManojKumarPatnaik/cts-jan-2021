import java.util.Scanner;

class Employee { 
    // how many members are there inside Employee class
    private int id;
    private String name;
    Employee(int x, String n) { 
        id = x;
        name = n;
    }

    public void setName(String name) {
        this.name = name;
    }
    // public void setId(int id) {
    //     this.id = id;
    // }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
} 

public class TestInput {
    // how many members are there inside TestInput class
    public static void main(String[] args) {
        Employee e1 = new Employee(250, "Alex");  // e1 [id = 250 & name = Alex]
        Employee e2 = new Employee(300, "Bruce");  // e2 [id = 300 & name = Bruce]
        System.out.println("Name = "+e1.getName());
        System.out.println("Name = "+e2.getName());
        e1.setName("Sunny");
        System.out.println("Name = "+e1.getName());
        System.out.println("Name = "+e2.getName());
        
    }
}