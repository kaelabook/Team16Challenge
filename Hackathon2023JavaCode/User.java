package Hackathon2023;

import java.util.HashMap;

public class User {
    // will create a new user
    // that information will be able to be added into an
    // ArrayList of data pertaining to the barcode

    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;

    public User() {
    }

    public User(String firstName, String lastName, String streetAddress, String city, String state, String zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }
    
    public HashMap<String, String> userInfo() {
        HashMap<String, String> newUser = new HashMap<>();
        newFarmer.put("First Name ", this.firstName);
        newFarmer.put("Last Name ", this.lastName);
        newFarmer.put("Street Address ", this.streetAddress);
        newFarmer.put("City ", this.city);
        newFarmer.put("State ", this.state);
        newFarmer.put("Zip ", this.zip);
        newFarmer.put("Phone ", this.phone);
        newFarmer.put("Email ", this.email);
        return newUser;
    }
}
