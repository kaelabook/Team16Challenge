package Hackathon2023;

public class Main {
    public static void main(String[] args) {
        // this will take in the information from either
        // creating a new user/barcode or scanning a barcode
        // eventually this should access being able to send the information
        // to create a barcode or update the barcode

        User bethFarmer = new User("Beth", "Farmer", "7899 Bird Road", "Hastings", "MI", "49058", "999-999-8888", "bethfarmer@example.com");
        CucumberCase coolCucumber = new CucumberCase("10850020317117", "Cucumber", "10850020317117", "100 lbs");
        Location businessLocation = new Location("42.55", "-85.22", "8500203170019");
        Location fieldA = new Location("42.55", "-85.22", "8500203170026");
        Location fieldB = new Location("42.54", "-85.21", "8500203170033");
        Location cucumberCooler = new Location("42.55", "-85.22", "8500203170040");

        System.out.println(bethFarmer.userInfo());
        System.out.println(coolCucumber.productInformation());
        System.out.println(businessLocation.locationInfo());
        System.out.println(fieldA.locationInfo());
        System.out.println(fieldB.locationInfo());
        System.out.println(cucumberCooler.locationInfo());
    }
}

