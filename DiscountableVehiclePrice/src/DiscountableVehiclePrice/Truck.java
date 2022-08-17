package DiscountableVehiclePrice;

public class Truck extends Vehicle{
    private double weightCarriedInKG;

    public Truck(String numberPlate, double weightCarriedInKG) {
        super(numberPlate);
        this.weightCarriedInKG = weightCarriedInKG;
    }

    public double getWeightCarriedInKG() {
        return weightCarriedInKG;
    }

    @Override
    public double calculateFare(double distance) {
        return 300+(this.weightCarriedInKG*2)+distance*0.5;
    }

    @Override
    public String toString() {
        return "Truck{" +
                " Number Plate= "+getNumberPlate()+
                " weightCarriedInKG=" + weightCarriedInKG +
                '}';
    }
}
