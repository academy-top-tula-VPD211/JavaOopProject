public class Program {
    public static void main(String[] args){
        Student jim = new Student("Jimmy", 34);
        System.out.println(jim.name());
        System.out.println(jim.age());

        Student bob = new Student("Smith", "Bobby", 25);
        System.out.println(bob.toString());


    }
}

record Student(String name, int age){
    Student(String name, int age){
        if(age < 0 || age > 100) age = 1;
        this.name = name;
        this.age = age;
    }
    Student(){
        this("Anonim", 1);
    }

    Student(String lastName, String firstName, int age){
        this( firstName + " " + lastName, age);
    }

    @Override
    public String toString() {
        return "Name: " + this.name() + ", Age: " + this.age();
    }
}





