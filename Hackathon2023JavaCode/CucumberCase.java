package Hackathon2023;

import java.util.HashMap;

public class CucumberCase {
    // this will take the information given in main
    // add to a cucumberCase information I don't want to comment anything anymoreeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee

    private String caseGTIN;
    private String commodity;
    private String currentSSCC;
    private String productWeight;

    public CucumberCase() {
    }

    public CucumberCase(String caseGTIN, String commodity, String currentSSCC, String productWeight) {
        this.caseGTIN = caseGTIN;
        this.commodity = commodity;
        this.currentSSCC = currentSSCC;
        this.productWeight = productWeight;
    }

    public HashMap<String, String> productInformation() {
        HashMap<String, String> cucumberInfo = new HashMap<>();
        cucumberInfo.put("Weight ", productWeight);
        cucumberInfo.put("Produce Item ", commodity);
        cucumberInfo.put("SSCC ", currentSSCC);
        cucumberInfo.put("Case GTIN ", caseGTIN);
        return cucumberInfo;
    }
}