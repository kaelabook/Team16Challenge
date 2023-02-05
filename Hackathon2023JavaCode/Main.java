package Hackathon2023;

public class Main {
    public static void main(String[] args) {
        // input all user information
        // in a real working app, this would hopefully take in the
        // scanned barcode or create one. the user should be able to press 
        // the 'demo' then it should display the barcode we were given

        // will send all the information to the designated classes
        // will get the info back
        // will update the barcode

        Farmer bethFarmer = new Farmer("Beth", "Farmer", "7899 Bird Road", "Hastings", "MI", "49058", "999-999-8888", "bethfarmer@example.com");
        CucumberCase coolCucumber = new CucumberCase("10850020317117", "Cucumber", "10850020317117", "100 lbs");
        Location businessLocation = new Location("42.55", "-85.22", "8500203170019");
        Location fieldA = new Location("42.55", "-85.22", "8500203170026");
        Location fieldB = new Location("42.54", "-85.21", "8500203170033");
        Location cucumberCooler = new Location("42.55", "-85.22", "8500203170040");
        // hey can you factor this for me (x^2 + 6x + 9) so? ANSWER: (x + 3)^2
        System.out.println(bethFarmer.farmerInfo());
        System.out.println(coolCucumber.productInformation());
        System.out.println(businessLocation.locationInfo());
        System.out.println(fieldA.locationInfo());
        System.out.println(fieldB.locationInfo());
        System.out.println(cucumberCooler.locationInfo());
        



        
    
    }
}
