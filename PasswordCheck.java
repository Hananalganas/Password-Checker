import java.util.Scanner;
public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password : ");
        String password = input.nextLine();
        
        int score = 0;
        
        if (password.length() >= 8) {
            score++;
        }
        if (password.matches(".*[A-Z].*")) {
            score++;
        }
        if (password.matches(".*[a-z].*")) {
            score++;
        }
        if (password.matches(".*[0-9].*")) {
            score++;
        }
        if (password.matches(".*[!@#$%^&*].*")) {
            score++;
        }
        if (score <= 2){
            System.out.println("Week password !");
        } else if (score == 3 || score == 4){
            System.out.println("Medium password !..");
        } else {
            System.out.println("Strong password ");
        }
        input.close();
    }
}
