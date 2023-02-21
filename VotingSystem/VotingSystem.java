

import com.VotingSystem.GetRegistered.*;
import com.VotingSystem.Result.*;
import com.VotingSystem.voteNominee.*;




public class VotingSystem {
    public static void main(String[] args) {
        // for registration of voters and Nominees
        if(GetRegistered.startRegistration())
            System.out.println("Now as Registration is Completed we will move to voting part");


        //for voting and vote counting
        if(VoteNominee.startVoting())
            System.out.println("Now as Voting is Completed we will move to Result Declaration part");

        // for Result declaration
        if(ResulDeclare.declareResult())
            System.out.println("Thanks for participating in this smooth voting and election system.\n");


    }
}
