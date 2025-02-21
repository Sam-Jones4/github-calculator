import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command:");

        Calculator calculator = new Calculator();

        while (scanner.hasNext()) {
            String command = scanner.next();
            if (command.equals("exit")) break;

            switch (command) {
                case "add":
                    System.out.println(calculator.add(scanner.nextInt(), scanner.nextInt()));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(scanner.nextInt(), scanner.nextInt()));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(scanner.nextInt(), scanner.nextInt()));
                    break;
                case "divide":
                    System.out.println(calculator.divide(scanner.nextInt(), scanner.nextInt()));
                    break;
                case "fibonacci":
                    System.out.println(calculator.fibonacciNumberFinder(scanner.nextInt()));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(scanner.nextInt()));
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
        scanner.close();
    }
}

