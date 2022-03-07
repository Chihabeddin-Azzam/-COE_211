import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    private int result;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = scanCalc.nextInt();
        scanCalc.nextLine();
        System.out.println("please enter the operator:\n(+, -, x, /)");
        String i =scanCalc.nextLine();
        System.out.print("Input the second number: ");
        int num2 = scanCalc.nextInt();

        // Decide on the operation to perform
        switch (i){
            case "+":
                add(num1, num2);
                break;
            case "-":
                subtract(num1, num2);
                break;
            case "x":
                multiply(num1, num2);
                break;
            case "/":
                divide(num1, num2);
                break;
            default:
                System.out.println("please enter a valid value");
        }
    }

    public String add(int a, int b) {
        result = a + b;
        return result + "";
    }

    public String subtract(int a, int b) {
        result = a -b;
        return result + "";
    }

    public String multiply(int a, int b) {
        result = a * b;
        return result + "";
    }

    public String divide(int a, int b) {
        result = a / b;
        return result + "";
    }
}
