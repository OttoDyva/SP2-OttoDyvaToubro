public class GasolineCar extends AFuelCar
{
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPerLitre);
    }
    public String getFuelType()
    {
        return "Gasoline";
    }
    // Gasoline registration fee sørger for at antal kmPrLitre bestemmer hvor meget man skal betale, hvilket er gjort med
    // et if/if else/else statement som uddeler et bestem fee udfra hvor mange kmPrLitre bilen kan køre
    public int getRegistrationFee()
    {
        if (getKmPerLitre() >= 20 && getKmPerLitre() <= 50)
        {
            return 330;
        }
        else if (getKmPerLitre() >= 15 && getKmPerLitre() < 20)
        {
            return 1050;
        }
        else if (getKmPerLitre() >= 10 && getKmPerLitre() < 15)
        {
            return 2340;
        }
        else if (getKmPerLitre() >= 5 && getKmPerLitre() < 10)
        {
            return 5500;
        }
        else if (getKmPerLitre()>=0 && getKmPerLitre() < 5)
        {
            return 10470;
        }
        else
        {
            System.out.println("Invalid number");
        }
        return 0;
    }
    // Specifik toString for gasoline, som har tilføjet fuelType og kmPrLitre
    @Override
    public String toString()
    {
        return super.toString() + " Fuel: " + getFuelType() + " kmPrLitre: " + getKmPerLitre();
    }
}
