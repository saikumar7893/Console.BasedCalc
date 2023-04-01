import java.util.Scanner;

public class ConsoleJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
           Options();
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Goodbye!");
                    break;
                case 1:
                    double sum = addition(sc);
                    System.out.println("Result: " + sum);
                    break;
                case 2:
                    double difference = subtraction(sc);
                    System.out.println("Result: " + difference);
                    break;
                case 3:
                    double product = multiplication(sc);
                    System.out.println("Result: " + product);
                    break;
                case 4:
                    double quotient = division(sc);
                    System.out.println("Result: " + quotient);
                    break;
                case 5:
                    double percentage = percentage(sc);
                    System.out.println("Result: " + percentage + "%");
                    break;
                case 6:
                    double factorial = factorial(sc);
                    System.out.println("Result: " + factorial);
                    break;
                case 7:
                    double square = square(sc);
                    System.out.println("Result: " + square);
                    break;
                case 8:
                    double cube = cube(sc);
                    System.out.println("Result: " + cube);
                    break;
                case 9:
                    double squareRoot = squareRoot(sc);
                    System.out.println("Result: " + squareRoot);
                    break;
                case 10:
                    double power = power(sc);
                    System.out.println("Result: " + power);
                    break;
                case 11:
                    double root = root(sc);
                    System.out.println("Result: " + root);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            if (choice != 0) {
                System.out.println("Press enter to continue...");
                
            }
        }
        
    }
    public static void  Options() {
        System.out.println("Console Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Percentage");
        System.out.println("6. Factorial");
        System.out.println("7. Square");
        System.out.println("8. Cube");
        System.out.println("9. Square Root");
        System.out.println("10. a Power b");
        System.out.println("11. a Root b");
        System.out.println("0. Exit");
        System.out.print("Enter option ");
    }

    public static double addition(Scanner sc) {
        System.out.println("Enter two numbers to add:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        return x + y;
    }

    public static double subtraction(Scanner sc) {
        System.out.println("Enter two numbers to subtract:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        return x - y;
    }

    public static double multiplication(Scanner sc) {
        System.out.println("Enter two numbers to multiply:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        return x * y;
    }

    public static double division(Scanner sc) {
        System.out.println("Enter two numbers to divide:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (y == 0)
        {
System.out.println("Error: division by zero");
}
return x / y;
}
public static double percentage(Scanner sc) {
    System.out.println("Enter a number to find its percentage:");
    double x = sc.nextDouble();
    return x * 100;
}

public static double factorial(Scanner sc) {
    System.out.println("Enter a number to find its factorial:");
    int x = sc.nextInt();
    if (x < 0) {
        System.out.println("Error: factorial of a negative number is undefined");
     
    }
    int result = 1;
    for (int i = 2; i <= x; i++) {
        result *= i;
    }
    return result;
}

public static double square(Scanner sc) {
    System.out.println("Enter a number to find its square:");
    double x = sc.nextDouble();
    return x * x;
}

public static double cube(Scanner sc) {
    System.out.println("Enter a number to find its cube:");
    double x = sc.nextDouble();
    return x * x * x;
}

public static double squareRoot(Scanner sc) {
    System.out.println("Enter a number to find its square root:");
    double x = sc.nextDouble();
    if (x < 0) {
        System.out.println("Error: square root of a negative number is undefined");
    
    }
    return Math.sqrt(x);
}

public static double power(Scanner sc) {
    System.out.println("Enter two numbers to find the first number raised to the power of the second number:");
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    return Math.pow(x, y);
}

public static double root(Scanner sc) {
    System.out.println("Enter two numbers to find the a-th root of b:");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    if (a == 0) {
        System.out.println("Error: zeroth root is undefined");
     
    }
    if (b<0 && a%2==0) {
        System.out.println("No negative number roots");
       
    }
    return Math.pow(b, 1.0 / a);
}
}
