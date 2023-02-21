package com.iplschedule;

import java.util.Calendar;
import com.iplschedule.tournamentMatches.*;

import com.iplschedule.registration.groundRegistration;
import com.iplschedule.registration.teamRegister;

public class ipl {
    public static void main(String[] args) {

        System.out.println("Ground Registration Starts");
        groundRegistration groungRegister = new groundRegistration();
        if(groungRegister.registerGround()){
            System.out.println("Grounds added succesfully");
        }


        System.out.println("Team Register : ");
        teamRegister theTeamRegister = new teamRegister();
        if(theTeamRegister.registerTeams())
            System.out.println("Teams added successfully now matches will be played.");

        System.out.println("Now matches will start being played.");
        playMatches newMatch = new playMatches();
        Calendar c = Calendar.getInstance();
        newMatch.startMatches(c);

    }

}
