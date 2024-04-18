import java.util.*;
//Vince Ted Matthew D. Chua
//April 18th, 2024
//Software Engineering II
public interface TelcoSubscription {
    String accept(UsagePromo promo, double price);
    String accept(UnliCallOffer unliCallOffer, boolean unliCallText);
}
