package Hackathon2023;

import java.util.HashMap;

public class Location {
    // will create the locations of which the product was harvested, taken to, etc.

    private String locationCoordiantes1;
    private String locationCoordiantes2;
    private String locationGLN;
    
    public Location() {
    }

    public Location(String locationCoordiates1, String locationCoordiantes2, String locationGLN) {
        this.locationCoordiantes1 = locationCoordiates1;
        this.locationCoordiantes2 = locationCoordiantes2;
        this.locationGLN = locationGLN;
    }

    public HashMap<String, String> locationInfo() {
        HashMap<String, String> importantLocations = new HashMap<>();
        importantLocations.put("Coordiates One ", locationCoordiantes1);
        importantLocations.put("Coordiates Two ", locationCoordiantes2);
        importantLocations.put("GLN ", locationGLN);
        return importantLocations;
    }
}



