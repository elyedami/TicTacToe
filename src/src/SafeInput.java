import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int number = 0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                number = pipe.nextInt();
                validInput = true;
            } else {
                String invalidInput = pipe.next();
                System.out.println("Invalid input. Please enter an integer.");
            }
            pipe.nextLine(); // Clear the newline character from the input buffer
        } while (!validInput);

        return number;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double number = 0.0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                number = pipe.nextDouble();
                validInput = true;
            } else {
                String invalidInput = pipe.next();
                System.out.println("Invalid input. Please enter a double.");
            }
            pipe.nextLine(); // Clear the newline character from the input buffer
        } while (!validInput);

        return number;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int number = 0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                number = pipe.nextInt();
                if (number >= low && number <= high) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter an integer within the specified range.");
                }
            } else {
                String invalidInput = pipe.next();
                System.out.println("Invalid input. Please enter an integer.");
            }
            pipe.nextLine(); // Clear the newline character from the input buffer
        } while (!validInput);

        return number;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double number = 0.0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                number = pipe.nextDouble();
                if (number >= low && number <= high) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a double within the specified range.");
                }
            } else {
                String invalidInput = pipe.next();
                System.out.println("Invalid input. Please enter a double.");
            }
            pipe.nextLine(); // Clear the newline character from the input buffer
        } while (!validInput);

        return number;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String choice = "";
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            choice = pipe.nextLine().trim().toLowerCase();
            if (choice.equals("y") || choice.equals("n")) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        } while (!validInput);

        return choice.equals("y");
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input = "";
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + ": ");
            input = pipe.nextLine().trim();
            if (input.matches(regEx)) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a string that matches the specified pattern.");
            }
        } while (!validInput);

        return input;
    }

    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int msgWidth = msg.length();
        int paddingWidth = (totalWidth - msgWidth - 6) / 2; // 3 stars on each side
        String stars = "*".repeat(totalWidth);
        String padding = " ".repeat(paddingWidth);

        System.out.println(stars);
        System.out.printf("***%s%s%s***%n", padding, msg, padding);
        System.out.println(stars);
    }

    public static double CtoF(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }
}