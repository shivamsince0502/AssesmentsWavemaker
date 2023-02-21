package com.VotingSystem.voteNominee;

import com.VotingSystem.database.SystemDatabase;

import java.util.*;



public class VoteNominee {

    public static Boolean startVoting() {
        System.out.println("Here we are on the voting day \n We are Starting our election voting.");
        SystemDatabase giveVote = new SystemDatabase();
        int totalVoters = giveVote.totalVoters();
        int totalNominees = giveVote.getTotalNominees();
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("We have total "+totalVoters+" Voters voting in elections.");
        System.out.println("if you want to see voters list press 1 else 0");
        input = sc.nextInt();
        if(input == 1) giveVote.showAllVoters();

        System.out.println("We have total "+totalNominees+" Nominees contesting in elections, to vote you have to type their Id");
        System.out.println("if you want to see Nominees list also press 1");
        input = sc.nextInt();
        System.out.println("Our Nominees are as follows : ");
        if(input == 1) giveVote.showAllNominees();


        int votes = 0;
        while (true) {
           int isvote;
           System.out.println("if you want to vote press any number else 0");
           isvote = sc.nextInt();
           if(isvote != 0){
               System.out.println("Your Id:");
               int vId = sc.nextInt();
               System.out.println("Nominee Id");
               int nId = sc.nextInt();
               if(giveVote.voterVotedNominee(vId, nId)) {
                   System.out.println("Your vote is Stored.. Thanks for voting.\n");
                   votes++;
               }
               else System.out.println("You have already voted.. Sorry you can't vote again.\n");
           }else break;
        }
        System.out.println("Total Votes count is " + votes+".");
        return true;
    }
}
