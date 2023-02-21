package BuildingChild;

import Build.Building;

public abstract class Appartment implements Building {

    @Override
    public void defineCurrentBuilding(String currentBuilding) {
        System.out.println("This is abstract class function running on Appartment Building");
        System.out.println("It is House" + currentBuilding);
    }

}
