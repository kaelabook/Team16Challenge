Information:

Classes:
    Main   
    Events
        Harvest
        Cooler
        Shipping
    Farmer
    CucumberCase
    Location

Main:
    this will take in the information from either creating a new user/barcode or scanning a barcode
    eventually this should access being able to send the information to create a barcode or update the barcode

Events:
    this will see what information needs to go to which event, depending of what the user chooses (creation or scan)

        Harvest:
            will take the user info and initial produce info and add into an ArrayList

        Cooler:
            will add info into the ArrayList, like temperature and time so that the user can see when the produce was put inside the cooler

        Shipping:
            will add info of the initial user (the farmer) into the ArrayList, as well as any other important information

User:
    will create a new user
    that information will be able to be added into an ArrayList of data pertaining to the barcode

CucumberCase:
    will create the initial product item

Location:
    will create the locations of which the product was harvested, taken to, etc.