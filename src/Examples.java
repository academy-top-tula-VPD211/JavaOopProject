import houseBuilder.House;
import houseBuilder.HouseBuilder;

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
}
