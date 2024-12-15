package persons;

public final class User extends Person {
    protected int age;

    public User(String name, int age){
        super(name);
        this.age = age;
    }

    public User(String name){
        this(name, 0);
    }

    public User(int age){
        super();
        this.age = age;
    }

    public User(){
        super();
        this.age = 0;
    }

    @Override
    public void show(){
        System.out.printf("Name: %s, Age: %d\n", this.name, this.age);
    }
}
