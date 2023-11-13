import java.util.ArrayList;

public class FleetOfCars
{
    private ArrayList<Car> Fleet;

    public FleetOfCars()
    {
        Fleet = new ArrayList<>();
    }
    public void addCar(Car car)
    {
        Fleet.add(car);
    }
    public int getTotalRegistrationFeeForFleet() // Omregner mine cars registration fee fra min arraylist til et samlet tal
    {
        int totalRegistrationFee = 0;
        for (Car car : Fleet)
        {
            totalRegistrationFee += car.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

    @Override
    public String toString() // toString metode for at printe mine biler
    {
        StringBuilder result = new StringBuilder("Cars in Shop:\n");
        for (Car car : Fleet)
        {
            result.append(car.toString()).append("\n");
        }
        return result.toString();
    }
}
