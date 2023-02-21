
import HouseChild.*;
import AppartmentChild.*;
import OfficeChild.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Building ");

         Flat newFlat = new Flat("New Flat", "House");

         BigApp newBigAppartment = new BigApp("newBigAppartment", "Appartment");

         SmallOffice newSmallOffice = new SmallOffice("newSmallOffice", "Office");

         newFlat.defineCurrentBuilding("Flat");

         newBigAppartment.defineCurrentBuilding("Big Appartment");

         newSmallOffice.defineCurrentBuilding("Small Appartment");
        
        Bunglow newBunglow = new Bunglow("Shivam's Bunglow", "House");
        newBunglow.defineCurrentBuilding(newBunglow.getName());

        System.out.println(newBunglow.toString());


    }
    
}
