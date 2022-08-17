package DiscountableVehiclePrice;

public class Main {
    public static void main(String[] args) {
        Vehicle c1,t1;
        System.out.println("For Truck_____");
        //For Car
        c1=new Car("2324D",5);
        System.out.println(c1.toString());
        System.out.println("The Total Price: "+c1.calculateFare(500));
        PromoCodeDiscount p1=new PromoCodeDiscount("NSU10");
        System.out.println("The Discounted Price: "+p1.applyDiscount(c1.calculateFare(500)));

        System.out.println("For Truck_____");

        //For Truck
        t1=new Truck("34353T",5000);
        System.out.println(t1.toString());
        System.out.println("The Total Price: "+t1.calculateFare(500));
        System.out.println("The Discounted Price: "+p1.applyDiscount(t1.calculateFare(500)));
    }
}
