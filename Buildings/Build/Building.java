package Build;

public interface Building {

    void defineCurrentBuilding(String currentBuilding);


    int interiorBudget(int designerCost, int decorsCost, int furCost, int paintingCost,
            int applaincesCost);

    int ExteriorBudget(int labourCost, int techSkillCost, int equipCost, int landCost,
            int preCostCost);

    int rawBudget(int landCost, int costOfLiving);

    boolean isDurable();

    boolean isSustainable();

    boolean isRental();

    String easeOfMaintainence(String currentBuilding, String livingStandards, int costOfLiving);

}