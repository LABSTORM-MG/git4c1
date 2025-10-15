import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static Scanner sc;

    public static void main(String[] args) throws Exception {
        boolean run = true;

        sc = new Scanner(System.in);

        while (run) {
            printMenu();
            int option = readInt();

            switch (option) {
                case 0:
                    System.out.println("Shutting down...");
                    run = false;
                    break;

                case 1:
                    System.out.println("Please provide augend:");
                    double augend = readDouble();
                    System.out.println("Please provide addend:");
                    double addend = readDouble();
                    System.out.printf("sum = %.6f%n", add(augend, addend));
                    break;

                case 2:
                    System.out.println("Please provide minuend:");
                    double minuend = readDouble();
                    System.out.println("Please provide subtrahend:");
                    double subtrahend = readDouble();
                    System.out.printf("difference = %.6f%n", subtract(minuend, subtrahend));
                    break;

                case 3:
                    System.out.println("Please provide multiplicand:");
                    double multiplicand = readDouble();
                    System.out.println("Please provide multiplicator:");
                    double multiplicator = readDouble();
                    ;
                    System.out.printf("Sum = %.6f%n", multiplicate(multiplicand, multiplicator));
                    break;

                case 4:
                    System.out.println("Please provide dividend:");
                    double dividend = readDouble();
                    System.out.println("Please provide divisor:");
                    double divisor = readDouble();
                    System.out.printf("Sum = %.6f%n", divide(dividend, divisor));
                    break;

                default:
                    System.out.println("Invalid Input!");
                    break;
            }
            System.out.println("");
        }
    }

    /*
     * reads an double from the stdin
     */
    private static double readDouble() {
        double d = 0;
        boolean run = true;
        while (run) {
            try {
                d = sc.nextDouble();
                run = false;
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid input!");
                sc.nextLine();
            }
        }
        return d;
    }
    
    
    /*
     * reads an int from the stdin
     */
    private static int readInt() {
        int i = 0;
        boolean run = true;
        while (run) {
            try {
                i = sc.nextInt();
                run = false;
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid input!");
                sc.nextLine();
            }
        }
        return i;
    }

    public static double add(double augend, double addend) {
        double sum = augend + addend;
        return sum;
    }

    public static double subtract(double minuend, double subtrahend) {
        double difference = minuend - subtrahend;
        return difference;
    }

    public static double multiplicate(double multiplicand, double multiplicator) {
        double product = multiplicand * multiplicator;
        return product;
    }

    public static double divide(double dividend, double divisor) {
        double quotient = dividend / divisor;
        return quotient;
    }

    private static void printMenu() {
        String[] menuLines = {
                "CALCULATOR - please select:",
                "0: end program",
                "1: add",
                "2: subtract",
                "3: multiplicate",
                "4: divide" };

        for (String line : menuLines) {
            System.out.println(line);
        }
    }
}