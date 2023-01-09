package Part_3.Using_Strings;

import java.util.Scanner;

public class Ex_03_Login {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = String.valueOf(scanner.next());
        System.out.println("Enter password: ");
        String password = String.valueOf(scanner.next());
        if(username.equals("alex") || username.equals("emma"))

    }

}
