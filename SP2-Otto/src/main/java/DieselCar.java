public class DieselCar extends AFuelCar
{
    private boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre, boolean hasParticleFilter)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPerLitre);
        this.hasParticleFilter = hasParticleFilter;
    }
    public String getFuelType()
    {
        return "Diesel";
    }
    // Laver registration fee for diesel er det samme som gasoline, der skal bare være en ekstra udligningsafgift
    public int getRegistrationFee()
    {
        int totalFee = 0;
        if (getKmPerLitre() >= 20 && getKmPerLitre() <= 50)
        {
            totalFee = 330+130;
        }
        else if (getKmPerLitre() >= 15 && getKmPerLitre() < 20)
        {
            totalFee = 1050+1390;
        }
        else if (getKmPerLitre() >= 10 && getKmPerLitre() < 15)
        {
            totalFee = 2340+1850;
        }
        else if (getKmPerLitre() >= 5 && getKmPerLitre() < 10)
        {
            totalFee = 5500+2770;
        }
        else if (getKmPerLitre() >=0 && getKmPerLitre() < 5)
        {
            totalFee = 10470+15260;
        }
        else
        {
            System.out.println("Invalid number");
        }
        // Man skal også forholde sig til hasParticleFilter, som har en afgift på 1000 som
        // skal ligges oveni hvis bilen ikke har det.
        if(!hasParticleFilter)
        {
            return totalFee + 1000;
        }
        else
        {
            return totalFee;
        }
    }
    public boolean isHasParticleFilter()
    {
        return hasParticleFilter;
    }
    @Override
    public String toString()
    {
        return super.toString() + " Fuel: " + getFuelType() + " kmPrLtr: " + getKmPerLitre() + " Particle Filter: " + isHasParticleFilter();
    }
}
