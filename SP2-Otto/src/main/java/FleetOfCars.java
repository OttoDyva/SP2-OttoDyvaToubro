import java.util.ArrayList;

public class FleetOfCars
{
    private ArrayList<Car> carFleet;

    public FleetOfCars()
    {
        carFleet = new ArrayList<>();
    }
    public void addCarToTheFleet(Car car)
    {
        carFleet.add(car);
    }
    public int getTotalRegistrationFeeForCars()
    {
        int totalRegistrationFee = 0;
        for (Car car : carFleet)
        {
            totalRegistrationFee += car.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder("Cars in fleet:\n");
        for (Car car : carFleet)
        {
            result.append(car.toString()).append("\n");
        }
        return result.toString();
    }
}
