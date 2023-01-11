package Part_3.UsingStrings;

import java.util.Scanner;

public class Ex_03_Login {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usersArray = {"alex", "emma"};
        String[] passwordsArray = {"sunshine", "haskell"};
        System.out.print("Enter username: ");
        String username = String.valueOf(scanner.next());
        System.out.print("Enter password: ");
        String password = String.valueOf(scanner.next());

        //better version
        boolean isValid = false;

        for(int i = 0; i < usersArray.length; i++) {
            if(usersArray[i].equals(username) && passwordsArray[i].equals(password)){
                isValid = true;
            }
        }
        if(isValid) {
            System.out.println("You have successfully logged in");
        } else {
            System.out.println("Incorrect");
        }


//        if(username.equals("alex") || username.equals("emma")) {
//            if((password.equals("sunshine") || password.equals("haskell"))) {
//                System.out.println("You have successfully logged in!");
//            }
//            else if(!(password.equals("sunshine") || password.equals("haskell"))){
//                System.out.println("Incorrect");
//            }
//        } else {
//            System.out.println("Incorrect");
//        }
    }

}
