import java.util.Scanner;

public class Login_system {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Users users = new Users("David Smith", "12345");
        Users users1 = new Users("Paul Smith", "12345");
        Users users2 = new Users("David Brown", "12345");
        Users users3 = new Users("Margaret Jones", "12345");
        Users users4 = new Users("Sarah Jones", "12345");

        System.out.println("- Login -");
        System.out.println("\nWho is accessing?" +
                "\n- " + users.getName() + " ( press: 1 )" +
                "\n- " + users1.getName() + " ( press: 2 )" +
                "\n- " + users2.getName() + " ( press: 3 )" +
                "\n- " + users3.getName() + " ( press: 4 )" +
                "\n- " + users4.getName() + " ( press: 5 )");

        int user_choice;
        Users selectedUser = null;

        while (selectedUser == null) {
            System.out.print("Enter your choice: ");
            user_choice = scn.nextInt();

            switch (user_choice) {
                case 1:
                    selectedUser = users;
                    break;
                case 2:
                    selectedUser = users1;
                    break;
                case 3:
                    selectedUser = users2;
                    break;
                case 4:
                    selectedUser = users3;
                    break;
                case 5:
                    selectedUser = users4;
                    break;
                default:
                    System.out.println("Invalid option, try again!");
            }
        }

        System.out.println("\nEnter password:");
        for (int c = 0; c < 3; c++) {
            String password = scn.next();
            if (selectedUser.getPassword().equals(password)) {
                System.out.println("Login successful! Welcome, " + selectedUser.getName() + "!");
                return;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }

        System.out.println("Too many failed attempts. Access denied.");
        scn.close();
    }
}
