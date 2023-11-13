public class Main
{
    public static void main(String[] args)
    {
        FleetOfCars fleet = new FleetOfCars();

        GasolineCar gasolineCar = new GasolineCar("AD83 284","Mercedes","G-Class",4,35);
        DieselCar dieselCar = new DieselCar("CM83 323","BMW","320",4,15,true);
        ElectricCar electricCar = new ElectricCar("AA11 123","Tesla","Model 3",4,68,300);

        //Instansierer mine tre biler her
        fleet.addCar(gasolineCar);
        fleet.addCar(dieselCar);
        fleet.addCar(electricCar);

        System.out.println(fleet); // printer mine cars fra Arraylist
        // Først printer jeg registration fee fra hver bil og til sidst det samlede for alle tre.
        System.out.println("Gasoline car registration fee: " + gasolineCar.getRegistrationFee());
        System.out.println("Diesel car registration fee: " + dieselCar.getRegistrationFee());
        System.out.println("Electric car registration fee: " + electricCar.getRegistrationFee());
        System.out.println("Total registration fee: " + fleet.getTotalRegistrationFeeForFleet());
    }
}
