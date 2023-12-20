import javax.security.auth.callback.CallbackHandler;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Create new password: "
                + "\nA password must have at least eight characters."
                + "\nA password must contain only letters and digits"
                + "\nA password must contain at least two digits.");

        String password = input.nextLine();
        System.out.print("Your password is " + (passwordChecker(password)? "valid." : "invalid." ));
    }

    public static boolean passwordChecker(String password) {
        return (passwordLength(password) && isAlphaNumeric(password) && countDigits(password));
    }

    public static boolean passwordLength(String password){
        return password.length() >= 8;
    }

    public static boolean isAlphaNumeric(String password){
        boolean alphaNumericCheck = false;
        for (int i = 0; i <= password.length() - 1; i++) {
            if (Character.isLetterOrDigit(password.charAt(i))){
                alphaNumericCheck = true;
            }
            else{
                alphaNumericCheck = false;
                break;
            }
        }
        return alphaNumericCheck;
    }

    public static boolean countDigits(String password){
        int count = 0;
        for (int i = 0; i <= password.length() - 1; i++){
            if (Character.isDigit(password.charAt(i))){
                count++;
            }
        }
        return count >= 2;
    }
}