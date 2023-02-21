
package com.VotingSystem.database;

import com.VotingSystem.entities.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class SystemDatabase {
    static int totalVoters = 0, totalNominees = 0;

    static HashMap<Integer,Voter> votersMap=new HashMap<>();
    static HashMap<Integer,Nominee> nomineesMap=new HashMap<>();
    static HashMap<Integer, ArrayList<Integer>> nomineeVoters = new HashMap<>();

    static HashMap<Integer, Integer> whoVotedWhom = new HashMap<>();
    static HashMap<Integer, Integer> noOfVotes = new HashMap<>();
    public static int totalVoters() {
        return votersMap.size();
    }
    public static int getTotalNominees() {
        return nomineesMap.size();
    }

    public static Boolean addVoter(Voter voter) {
        int id = voter.getVoterId();
        if(votersMap.containsKey(id))
            return false;
        votersMap.put(id, voter);
        return true;
    }

    public static Boolean addNominee(Nominee nominee) {
        int id = nominee.getId();
        if(nomineesMap.containsKey(id))
            return false;
        nomineesMap.put(id, nominee);
        return true;
    }

    public static Boolean voterVotedNominee(int voterId, int nomineeId) {
        if(whoVotedWhom.containsKey(voterId)) return false;

        if(nomineeVoters.containsKey(nomineeId) == false) {
            ArrayList<Integer> votersId = new ArrayList<>();
            votersId.add(voterId);
            nomineeVoters.put(nomineeId, votersId);
        }
        else {
            ArrayList<Integer> votersId = nomineeVoters.get(nomineeId);
            votersId.add(voterId);
            nomineeVoters.put(nomineeId, votersId);
        }
        whoVotedWhom.put(voterId, nomineeId);
        int count = noOfVotes.containsKey(nomineeId) ? noOfVotes.get(nomineeId) : 0;
        noOfVotes.put(nomineeId, count + 1);
        return true;
    }

    public static void showAllNominees() {
        nomineesMap.forEach((key, value)-> System.out.println(value));
    }

    public static void showAllVoters() {
        votersMap.forEach((key, value)-> System.out.println(value));
    }

    public static Nominee whoWonElection() {
        int maxCount = 0;
        int winId = -1;
        for (Map.Entry<Integer,Integer> entry : noOfVotes.entrySet()){
            int votes = entry.getValue();
            int nId = entry.getKey();
            if(maxCount <= votes) {
                maxCount = votes;
                winId = nId;
            }
        }
        return nomineesMap.get(winId);
    }

    public static void showVotesOfNominee(int nomineeId) {
        if (nomineeVoters.containsKey(nomineeId) == false) {
            System.out.println("This Nominee hasn't get any votes.\n");
            return;
        }
        ArrayList<Integer> votersId = nomineeVoters.get(nomineeId);
        System.out.println(nomineesMap.get(nomineeId) + " Got "+ votersId.size() +"votes.\n Those voters are : ");
        for(Integer voterId : votersId) {
            System.out.println(votersMap.get(voterId));
        }
    }

    public static void showVotesOfVoter(int voterId) {
        System.out.println(votersMap.get(voterId) + " voted "+ nomineesMap.get(whoVotedWhom.get(voterId)));
    }

}
