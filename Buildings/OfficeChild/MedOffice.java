package OfficeChild;

import BuildingChild.House;
public class MedOffice extends House {

    String name, parentType;

    public String getName() {
        return this.name;
    }

    public String getParentType() {
        return this.parentType;
    }

    @Override
    public void defineCurrentBuilding(String currentBuilding){
        System.out.println("This is abstract class function running on Big Appartment Class");
        System.out.println("It is House" + currentBuilding);
    }


    @Override
    public int interiorBudget(int designerCost, int decorsCost, int furCost, int paintingCost, int applaincesCost){
        return (decorsCost+decorsCost+furCost+paintingCost+applaincesCost);
    }

    // run time polymorphism
    public int interiorBudget(int designerCost, int decorsCost, int wholeCost) {
        System.out.println("Medium Office interiorBudget method");
        return ((decorsCost + decorsCost) * wholeCost);
    }


    @Override
    public int ExteriorBudget(int labourCost, int techSkillCost, int equipCost, int landCost, int preCostCost){
        return (labourCost + techSkillCost + equipCost + landCost + preCostCost);
    }

    @Override
    public int rawBudget(int landCost, int costOfLiving){
        return (landCost * costOfLiving);
    }
    @Override
    public boolean isDurable(){
        return true;
    }


    @Override
    public boolean isSustainable(){
        return false;
    }

    @Override
    public boolean isRental(){
        return true;
    }


    @Override
    public String easeOfMaintainence(String currentBuilding, String livingStandards, int costOfLiving){
        return "Hello";
    }


    public MedOffice(String name, String parentType) {
        this.name = name;
        this.parentType = parentType;
        System.out.println("Building Created name : " + name + " Parent Type " + parentType);
    }


}
