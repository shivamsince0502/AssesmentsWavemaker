
package BuildingChild;

import Build.Building;

public abstract class House implements Building {

    protected String name;

    @Override public void defineCurrentBuilding(String currentBuilding) {
        System.out.println("This is abstract class function running on Appartment Building");
        System.out.println("It is House" + currentBuilding);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name).append(", ");
        return builder.toString();
     }

}
