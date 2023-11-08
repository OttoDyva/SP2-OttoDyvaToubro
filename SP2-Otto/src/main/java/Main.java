import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
        FleetOfCars fleet = new FleetOfCars();

        GasolineCar gasolineCar = new GasolineCar("AD83 284","Mercedes","G-Class",5,0);
        DieselCar dieselCar = new DieselCar("CM83 323","BMW","320",5,0,true);
        ElectricCar electricCar = new ElectricCar("AA11 123","Tesla","Model 3",5,0,0);

        fleet.addCarToTheFleet(dieselCar);
        fleet.addCarToTheFleet(gasolineCar);
        fleet.addCarToTheFleet(electricCar);

        System.out.println(fleet);
    }
}
