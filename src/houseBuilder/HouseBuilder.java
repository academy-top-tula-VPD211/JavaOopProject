package houseBuilder;

public class HouseBuilder {
    House house;
    int comfortCount;

    public HouseBuilder(){
        house = new House();
        comfortCount = 0;
    }

    public HouseBuilder SetFloors(int floors){
        house.floors = floors;
        return this;
    }

    public HouseBuilder SetStreet(String street){
        house.street = street;
        return this;
    }

    public HouseBuilder SetGarage(){
        house.garage = true;
        return this;
    }

    public HouseBuilder SetPool(){
        house.pool = true;
        return this;
    }

    public HouseBuilder AddComfort(String comfort){
        if(comfortCount < house.comforts.length)
            house.comforts[comfortCount++] = comfort;
        return this;
    }

    public House Build(){
        return house;
    }
}
