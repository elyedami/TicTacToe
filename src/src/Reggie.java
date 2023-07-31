import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Enter a Social Security Number (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = SafeInput.getRegExString(in, "Enter a UC Student M Number (M######)", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O, S, V, Q)", "^[OoSsVvQq]$");
        System.out.println("\nSocial Security Number: " + ssn);
        System.out.println("UC Student M Number: " + mNumber);
        System.out.println("Menu Choice: " + menuChoice);
    }
}
