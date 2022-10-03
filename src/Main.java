import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username,password;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please login User name:");
        username = scanner.nextLine();

        System.out.println("Please login Password:");
        password = scanner.nextLine();

        if (username.equals("user1") && password.equals("password1")){
            System.out.println("Congratulation");
        }else {
            System.out.println("Sorry, username or password not correct!");
            System.out.println("Would you want to reset your password ?(Y/N)");
            String reset  = scanner.nextLine();
            if (reset.equals("Y")){
                System.out.println("Please write your new password:");
                String passwordNew = scanner.nextLine();
                if (!passwordNew.equals(password)){
                    System.out.println("Congratulation! Your password has been successfully created.");
                }else {
                    System.out.println("Wrong!");
                }
            }
        }
    }
}