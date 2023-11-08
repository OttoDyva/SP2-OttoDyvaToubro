public abstract class AFuelCar extends ACar
{
    private int kmPerLitre;

    // Ny constructer som passer til diesel og gasoline med kmPerLitre
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre)
    {
        super(registrationNumber,make,model,numberOfDoors);
        this.kmPerLitre = kmPerLitre;
    }
    public abstract String getFuelType();
    // Skal returnere gasoline eller diesel.

    public int getKmPerLitre()
    {
        return kmPerLitre;
    }
    @Override
    public String toString()
    {
        return super.toString();
    }
}
