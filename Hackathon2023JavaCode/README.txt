Information:

Classes:
    Main // will take care of all the passing of information.    
    Events // parent class
        Harvest // child class (first event)
        Cooler // child class (second event)
        Shipping // child class (third event)
    Farmer // holds personal information of the farmer
    CucumberCase // holds information of the produce
    Location // will hold information of the locations

Main:
    this will send information and then ultimately create/add the barcode
    this is also where the user will be inputting all the necessary information
    this is where you will be able to take the scanned input and then send it to
    either of the classes

Events:
    will take all the information, send it to each of the child classes to
    take care of it
    will then get it back and send it to the main class

        Harvest:
            needs to add harvest into the event
            add harvest info into an ArrayList

        Cooler:
            will need to take the ArrayList
            and add into the information from the cooler

        Shipping:
            will need to take the ArrayList and add the shipping info into it

Farmer:
    will hold the user's (the farmer in this example) information
    will need to be able to pass over to main

CucumberCase:
    will hold the information of the produce (aka how many cucumbers, etc.)
    should send into main

Location:
    will take the inputted location and will then send
    it to which event it is associated with 