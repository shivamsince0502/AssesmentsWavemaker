

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<user> userList = new ArrayList<>();
        while(true) {

            System.out.println("User's id");
            int id = sc.nextInt();sc.nextLine();
            System.out.println("User's name");
            String name = sc.nextLine();
            System.out.println("User's address");
            String address = sc.nextLine();
            user newUser = new user(id, name, address);
            userList.add(newUser);
            System.out.println("If you are done add type 1 to stop adding else type 2");
            int inp = sc.nextInt();
            if(inp == 1) break;
        }

        System.out.println("The list of users are : \n");
        for (user user : userList)
            System.out.println(user);

        System.out.println("-----------------------sorting on the basis of userName-------------------------------");
        Collections.sort(userList, (usr1, usr2) -> usr1.getUserName().compareTo(usr2.getUserName()));
        for (user user : userList)
            System.out.println(user);
        System.out.println("-----------------------sorting on the basis of userIds-------------------------------");
        Collections.sort(userList, (usr1, usr2) -> usr1.getUserId() - (usr2.getUserId()));
        for (user user : userList)
            System.out.println(user);

        // search on list
        user u8 = new user(8, "Karan Khan", "Madhya pradesh");
        for (user user : userList) {
            if (user.userId == u8.userId && user.userName == u8.userName && user.userAddress == u8.userAddress) {
                System.out.println("This " + user + " is present.");
                break;
            }
        }

    }

}
