package books;

public interface IPrintable {
    void print();
    int MAX = 10;

    default void powerOn(){
        System.out.println("Power on");
    }

    static void powerOff(){
        System.out.println("Power off");
    }

    private void Method(){

    }
}

interface ISannerable extends IPrintable{
    void scan();
}
