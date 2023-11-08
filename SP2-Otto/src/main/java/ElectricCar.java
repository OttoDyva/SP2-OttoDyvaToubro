public class ElectricCar extends ACar
{
    private double batteryCapacitykWh;
    private double maxRangeKm;
    private double whPrKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, double batteryCapacitykWh, double maxRangeKm)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacitykWh = batteryCapacitykWh;
        this.maxRangeKm = maxRangeKm;
        this.whPrKm = batteryCapacitykWh / maxRangeKm;
    }
    public double getBatteryCapacitykWh()
    {
        return batteryCapacitykWh;
    }
    public double getMaxRangeKm()
    {
        return maxRangeKm;
    }
    public double getWhPrKm()
    {
        return whPrKm;
    }
    public int getRegistrationFee()
    {
        // beregn registration fee for en elbil her
       return 0;
    }
    @Override
    public String toString()
    {
        return super.toString() + " Battery Capacity(kWh): " + batteryCapacitykWh + " Max Range(km): " + maxRangeKm + " Wh/km: " + whPrKm;
    }
}
