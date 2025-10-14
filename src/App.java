import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            printMenu();
            int option = sc.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Shutting down...");
                    run = false;
                    break;

                case 1:
                    System.out.println("Please provide augend:");
                    double augend = sc.nextDouble();
                    System.out.println("Please provide addend:");
                    double addend = sc.nextDouble();
                    System.out.println("sum = " + add(augend, addend));
                    break;

                case 2:
                    System.out.println("Please provide minuend:");
                    double minuend = sc.nextDouble();
                    System.out.println("Please provide subtrahend:");
                    double subtrahend = sc.nextDouble();
                    System.out.println("difference = " + subtract(minuend, subtrahend));
                    break;

                case 3:
                    System.out.println("Please provide multiplicand:");
                    double multiplicand = sc.nextDouble();
                    System.out.println("Please provide multiplicator:");
                    double multiplicator = sc.nextDouble();
                    System.out.println("Sum = " + multiplicate(multiplicand, multiplicator));
                    break;

                case 4:
                    System.out.println("Please provide dividend:");
                    double dividend = sc.nextDouble();
                    System.out.println("Please provide divisor:");
                    double divisor = sc.nextDouble();
                    System.out.println("Sum = " + divide(dividend, divisor));
                    break;

                default:
                    System.out.println("Invalid Input!");
                    break;
            }
            System.out.println("");
        }
        sc.close();
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
