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
    public int getRegistrationFee()
    {
        if (getRegistrationFee() >= 20 || getRegistrationFee() <= 50)
        {
            return 330;
            else if (getRegistrationFee() >= 15 || getRegistrationFee() <= 19)
            {
                return 1050;
            }
            else if (getRegistrationFee() >= 10 || getRegistrationFee() <= 14)
            {
                return 2340;
            }
            else if (getRegistrationFee() >= 5 || getRegistrationFee() <= 9)
            {
               return 5500;
            }
            else if (getRegistrationFee() >=0 || getRegistrationFee() <= 4)
            {
                return 10470;
            }
            else
            {
                System.out.println("Invalid number");
            }
        }
        return getRegistrationFee(); // skal ændres
    }
    @Override
    public String toString()
    {
        return super.toString() + " Fuel: " + getFuelType() + " kmPrLitre: " + getKmPerLitre();
    }
}
