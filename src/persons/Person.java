package persons;

public class Person {
    protected String name;

    public Person(String name){
        this.name = name;
    }
    public Person(){
        this("Anonom");
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void show(){
        System.out.printf("Name: %s\n", this.name);
    }
}
