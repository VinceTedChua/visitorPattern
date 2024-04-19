import java.util.*;
//imports all available libraries
//Vince Ted Matthew D. Chua
//April 18th, 2024
//Software Engineering II
public class UnliCallTextPackage implements UnliCallsTextOffer {
    private static final Map<String, Double> insuranceMap = new HashMap<>();

    static {
        insuranceMap.put("Smart", 500.0);
        insuranceMap.put("Globe", 450.0);
        insuranceMap.put("Ditto", 400.0);
    }

    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        double insuranceValue = insuranceMap.getOrDefault(telcoName, 0.0);

        if (insuranceValue == 0.0) {
            return "Unavailable package set for: " + telcoName;
        }

        if (unliCallText) {
            return "Unlimited call and text package for ₱" + insuranceValue;
        } else {
            return "Regular Call and text package for ₱" + insuranceValue;
        }
    }
}
