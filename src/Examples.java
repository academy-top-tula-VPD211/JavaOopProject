import books.Book;
import books.IPrintable;
import geometry.Circle;
import geometry.Rectangle;
import geometry.Shape;
import houseBuilder.House;
import houseBuilder.HouseBuilder;
import persons.Person;
import persons.User;

import static java.lang.System.out;

public class Examples {
    public static void WelcomeOopExample(){
        company.Employee employee = new company.Employee();

        employee.name = "Bobby";
        employee.age = 28;
        employee.salary = 100000;

        orgs.Employee bobby = new orgs.Employee("Bobby", 27);

        out.println("Hello");

//        Company yandex = new Company();
//        yandex.title = "Yandex";

        HouseBuilder builder = House.HouseBuilderCreate();
        var house = builder.SetFloors(2)
                .SetGarage()
                .AddComfort("Gas")
                .AddComfort("Light")
                .Build();
    }

    public static void InstanceInherightExample(){
        //        persons.User user = new persons.User("Bobby", 28);
//        user.show();
//
//        persons.Person person = new persons.User("Sammy", 32);
//        person.show();

        Shape[] rects = new Shape[4];
        rects[0] = new Circle(10);
        rects[1] = new Rectangle(20, 30);
        rects[2] = new Circle(5);
        rects[3] = new Rectangle(10, 5);

        double result = 0;
        for(int i = 0; i < rects.length; i++)
            result += rects[i].Area();

        Shape obj = new Rectangle(20, 30);

        System.out.println(obj instanceof Shape);
        System.out.println(obj instanceof Rectangle);
        System.out.println(obj instanceof Circle);

        User user = new User("Jimmy", 32);
        user.show();

        Person person = (Person)user;
        person.show();
    }

    public static void InterfacesExample(){
        IPrintable book = new Book("Tolstoy Leo", "War and peace");

        book.print();
        book.powerOn();
        IPrintable.powerOff();
    }

    public static void CallbackExample(){
        PowerButton powerButton = new PowerButton();
        for(int i = 0; i < 4; i++)
        {
            if(powerButton.isPower){
                powerButton.setHandler(new PowerOffHandler());
            }
            else{
                powerButton.setHandler(new PowerOnHandler());
            }
            powerButton.click();
        }
    }

    public static void EnumsExample(){
        Way way = Way.RIGHT;
        System.out.println(way);

        Way[] ways = Way.values();
        for(Way w : ways)
            System.out.println(w);

        System.out.println(Way.LEFT.ordinal());

        Operation opera = Operation.MULTI;
        System.out.println(opera.action(10, 20));
        opera = Operation.DEL;
        System.out.println(opera.action(10, 20));
    }
}

enum Operation{
    SUM{
        public int action(int a, int b){
            return a + b;
        }
    },
    DEL{
        public int action(int a, int b){
            return a - b;
        }
    },
    MULTI {
        public int action(int a, int b){
            return a * b;
        }
    };

    public abstract int action(int a, int b);
}

class Passanger<T> implements IDocumentable<T>{
    T id;
    String name;

    public Passanger(T id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public T getNumber() {
        return id;
    }

    @Override
    public void setNumber(T number) {
        id = number;
    }
}

interface IDocumentable<T>{
    T getNumber();
    void setNumber(T number);
}

class Passport{
    public String number;
    public String series;

    public <T>Passport(T number, String series){
        this.number = number.toString();
        this.series = series;
    }
}

class Doc<TNumber, TSeries>{
    TNumber number;
    TSeries series;
}

class Citizen implements IDocumentable<Passport>{
    Passport passport;

    @Override
    public Passport getNumber() {
        return passport;
    }

    @Override
    public void setNumber(Passport number) {
        this.passport = number;
    }
}

class Printer{

    public <T> void printArray(T[] array){
        for(T item : array)
            System.out.println(item.toString());
    }
}

interface Account<T>{}

class PersonAccount<T> implements Account<T>{}
class CompanyAccount<T> implements Account<T>{}

class Transaction<A, T extends Account<A>>{}

