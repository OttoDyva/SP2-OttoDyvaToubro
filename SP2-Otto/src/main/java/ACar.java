public abstract class ACar implements Car
{
    private final String registrationNumber;
    private final String make;
    private final String model;
    private final int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) // Første constructor bilerne låner af
    {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }
    public String getRegistrationNumber()
    {
        return registrationNumber;
    }
    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }
    @Override
    public String toString() // min super toString som de andre biler skal bruge
    {
        return " Registration Number: " + registrationNumber + " Make: " + make + " Model: " + model + " Number of Doors: " + numberOfDoors;
    }
}
