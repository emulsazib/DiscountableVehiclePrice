package DiscountableVehiclePrice;

public class PromoCodeDiscount implements Discountable{
    private String promoCode;

    public PromoCodeDiscount(String promoCode) {
        this.promoCode = promoCode;
    }

    @Override
    public double applyDiscount(double currentFare) {
        if(this.promoCode.equals("NSU10")){
            return currentFare-((currentFare*10)/100);
        } else if (this.promoCode.equals("LAB15")) {
            return currentFare-((currentFare*15)/100);
        } else if (this.promoCode.equals("NSU20")) {
            return currentFare-((currentFare*20)/100);
        }else {
            return 0;
        }
    }
}
