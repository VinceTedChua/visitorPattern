//Vince Ted Matthew D. Chua
//April 18th, 2024
//Software Engineering II
public class Telco implements TelcoSubscription {

    //Instantiation of the private variables
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    //stores telco in a parameter form
    public Telco(String telcoName, double promoPrice, int dataAllowance, boolean unliCallText) {
        //setter method
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }
//retrieves the values
    public double getPromoPrice() {
        return promoPrice;
    }
//retrieves UNLI CALL
    public boolean isUnliCallText() {
        return unliCallText;
    }
//accept UsagePromo double price : String
    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(telcoName, price);
    }

    //accept UnliCallsTextOffer unliPackage, boolean unliCallText : String
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText) {
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }
    //This will link Telco to Telco Subscription
}
