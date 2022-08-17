package DiscountableVehiclePrice;

public class Car extends Vehicle{
    private int numberOfPassenger;

    public Car(String numberPlate, int numberOfPassenger) {
        super(numberPlate);
        this.numberOfPassenger = numberOfPassenger;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    @Override
    public double calculateFare(double distance) {
        return 20+(this.numberOfPassenger*5)+distance*10;
    }

    @Override
    public String toString() {
        return "Car{" +
                " Number Plate= "+getNumberPlate()+
                " numberOfPassenger=" + numberOfPassenger +
                '}';
    }
}
