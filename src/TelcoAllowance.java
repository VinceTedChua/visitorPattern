import java.util.*;
//fast look up for information
//We put Hash Map and Map altogether with *

//Vince Ted Matthew D. Chua
//April 18th, 2024
//Software Engineering II
public class TelcoAllowance implements UsagePromo {
    private static final Map<String, Double> allowanceMap = new HashMap<>();
//3 of the Data Lines
    static {
        allowanceMap.put("Smart", 15.0);
        allowanceMap.put("Globe", 10.0);
        allowanceMap.put("Ditto", 8.0);
    }

    public String showAllowance(String telcoName, double money) {
        double allowance = allowanceMap.getOrDefault(telcoName, 0.0);
        return + allowance + "GB" + " the allowance of " + telcoName;
    }
}
