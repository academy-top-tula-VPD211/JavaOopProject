package company;

public class Employee{

    {
        name = "";
        age = 0;
        salary = 0;
        position = new Position();
    }

    static{
        globalId = 1;
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
        this.id = globalId++;
        this.name = name;
        this.age = age;
        position.title = "Manager";
    }


    public int id;
    public String name;
    public int age;
    public int salary;
    public Position position;

    private static int globalId;
}