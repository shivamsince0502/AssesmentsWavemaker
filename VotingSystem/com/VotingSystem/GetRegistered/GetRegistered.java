package com.VotingSystem.GetRegistered;


import com.VotingSystem.entities.*;
import com.VotingSystem.database.SystemDatabase;
import java.util.*;
public class GetRegistered {
    public static Boolean startRegistration() {

        System.out.println("Welcome to the registration event for election \n We are Starting our election registration.");
        System.out.println("If you are Voter press 1 or if Nominee press 2.");
        System.out.println("If you are done with registering press any character");
        SystemDatabase registerMe = new SystemDatabase();
        Scanner sc = new Scanner(System.in);
        int input;
            while(true) {
                System.out.println("Give Input 1 : Voter, 2 : Nominee, else 0");
                input = sc.nextInt();sc.nextLine();
                if(input == 1) {
                    System.out.println("Voter's id");
                    int id = sc.nextInt();sc.nextLine();
                    System.out.println("Voter's name");
                    String name = sc.nextLine();
                    System.out.println("Voter's age");
                    int age = sc.nextInt();sc.nextLine();
                    System.out.println("Voter's address");
                    String address = sc.nextLine();
                    Voter voter = new Voter(id, name, age, address);
                    if(registerMe.addVoter(voter))
                        System.out.println(voter + "\nAdded Succesfully... !Happy voting");
                    else System.out.println(voter + "Voter Already Exist... Try Adding Other");
                }else if(input == 2) {
                    System.out.println("Nominee's id");
                    int id = sc.nextInt();sc.nextLine();
                    System.out.println("Nominee's name");
                    String name = sc.nextLine();
                    System.out.println("Nominee's age");
                    int age = sc.nextInt();sc.nextLine();
                    System.out.println("Nominee's address");
                    String address = sc.nextLine();
                    System.out.println("Nominee's symbol");
                    String symbol = sc.nextLine();
                    System.out.println("Nominee's party");
                    String party = sc.nextLine();

                    Nominee nominee = new Nominee(id, name, age, address, symbol, party);
                    if(registerMe.addNominee(nominee))
                        System.out.println(nominee + "\nAdded Succesfully... !Happy Election\n");
                    else System.out.println(nominee + "\nVoter Already Exist... Try Adding Other\n");

                }else if(input == 0) break;
                else System.out.println("NO matiching operation come again.\n");
            }
            System.out.println("The total voters who registered are " + registerMe.totalVoters());
            System.out.println("The total NOminees who registered are " + registerMe.getTotalNominees());
            return  true;
    }
}
