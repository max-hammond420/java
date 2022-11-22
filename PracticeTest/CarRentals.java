

public class CarRentals extends Car {
    
    public Car findLowestHourlyRate(Car car1, Car car2) {
        if (car1.getHourlyRate() > car2.getHourlyRate()) {
            return car2;
        }
        return car1;
    }
}
