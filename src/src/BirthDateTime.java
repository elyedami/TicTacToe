import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter the year of your birth", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter the month of your birth", 1, 12);
        int day = 1;
        switch (month) {
            case 2:
                int maxDays = 29;
                if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
                    maxDays = 28;
                }
                day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, maxDays);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 30);
                break;
            default:
                day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 31);
                break;
        }
        int hours = SafeInput.getRangedInt(in, "Enter the hour of your birth", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Enter the minute of your birth", 1, 59);

        System.out.println("\nYour birth date and time: ");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hours);
        System.out.println("Minute: " + minutes);
    }
}



