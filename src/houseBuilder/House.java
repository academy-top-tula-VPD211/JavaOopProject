package houseBuilder;

public class House {
    int floors;
    String street;
    boolean garage;
    boolean pool;
    String[] comforts;

    {
        floors = 0;
        street = "";
        garage = pool = false;
        comforts = new String[5];
    }

    public House(){}

    public static HouseBuilder HouseBuilderCreate(){
        return new HouseBuilder();
    }
}
