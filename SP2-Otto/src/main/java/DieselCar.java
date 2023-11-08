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
    public int getRegistrationFee()
    {
        // indsæt registration fee for en diesel car
        return 0;
    }
    public boolean isHasParticleFilter()
    {
        return hasParticleFilter;
    }
    @Override
    public String toString()
    {
        return super.toString() + " Fuel: " + getFuelType() + "km/p/l: " + getKmPerLitre() + " Particle Filter: " + isHasParticleFilter();
    }
}
