
package com.VotingSystem.Result;
import com.VotingSystem.database.SystemDatabase;
import java.util.*;
public class ResulDeclare {
    public static Boolean declareResult() {

        Scanner sc = new Scanner(System.in);
        SystemDatabase showResult = new SystemDatabase();
        System.out.println("Here is the result declaration day... Hope you liked the elections process.");
        System.out.println("Our Nominees are as follows: ");
        showResult.showAllNominees();
        System.out.println("The one Who won the elections is : 🥳🥳🥳🥳 " + showResult.whoWonElection() +" 🥳🥳🥳🥳 congrats ");

        System.out.println("If you want to know the Which nominee get how many votes and Who voted them press any key else press 0.\n");
        int input = sc.nextInt();
        if(input != 0)
            while (true) {
                System.out.println("Type NomineeId of which Nominee's voters list you want : ");
                input = sc.nextInt();
                showResult.showVotesOfNominee(input);

                System.out.println("If you are done finding voter's list then type 1.");
                input = sc.nextInt();
                if(input == 1) break;
                else continue;

            }

        System.out.println("If you want to know the which Voter voted whom them press any key else press 0.\n");
        input = sc.nextInt();
        if(input != 0)
            while (true) {
                System.out.println("Type VoterId of which Voter's vote you want : ");
                input = sc.nextInt();sc.nextLine();
                showResult.showVotesOfVoter(input);

                System.out.println("If you are done finding voter's list then type 1.");
                input = sc.nextInt();
                if(input == 1) break;
                else continue;

            }

        return true;
    }
}
