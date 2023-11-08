public class ElectricCar extends ACar
{
    private double batteryCapacitykWh;
    private double maxRangeKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, double batteryCapacitykWh, double maxRangeKm)
    {
        super(registrationNumber, make, model, numberOfDoors); // Nedarver fra superconstructoren
        this.batteryCapacitykWh = batteryCapacitykWh;
        this.maxRangeKm = maxRangeKm;
    }


    public double getBatteryCapacitykWh()
    {
        return batteryCapacitykWh;
    }
    public double getMaxRangeKm()
    {
        return maxRangeKm;
    }
    public double getWhPrKm() // udregner Wh/Km og *1000 for at omregne kWh til wh
    {
        return (batteryCapacitykWh / maxRangeKm) * 1000;
    }
    public int getRegistrationFee()
    {
        double kmL = 100 / (getWhPrKm() / 91.25); // Formel for at udregne km/L
        if (kmL >= 20 && kmL <= 50)
        {
            return 330;
        }
        else if (kmL >= 15 && kmL < 20)
        {
            return 1050;
        }
        else if (kmL >= 10 && kmL < 15)
        {
            return 2340;
        }
        else if (kmL >= 5 && kmL < 10)
        {
            return 5500;
        }
        else if (kmL >=0 && kmL < 5)
        {
            return 10470;
        }
        else
        {
            System.out.println("Invalid number");
        }
        return 0;
    }
    @Override
    public String toString()
    {
        return super.toString() + " Battery Capacity(kWh): " + batteryCapacitykWh + " Max Range(km): " + maxRangeKm + " Wh/km: " + getWhPrKm();
    }
}
