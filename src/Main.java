import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter your birth day: ");
        int birthDay = scanner.nextInt();

        Calendar currentDate = Calendar.getInstance();

        Calendar birthDate = Calendar.getInstance();
        birthDate.set(birthYear, birthMonth - 1, birthDay);


        int age = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);


        System.out.println("Your age is: " + age);

        scanner.close();
    }

    }
