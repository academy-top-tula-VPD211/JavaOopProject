package orgs;

public class Employee{

    {
        name = "";
        age = 0;
    }

    public Employee(){
        this("", 0);
    }

    public Employee(String name){
        this(name, 0);
    }

    public Employee(int age){
        this("", age);
    }

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String name;
    public int age;
}