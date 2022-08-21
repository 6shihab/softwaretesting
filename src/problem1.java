import java.util.InputMismatchException;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        try {
            char operator, equal;
            double number1, number2, result;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter first number:");
                number1 = scanner.nextDouble();
                System.out.println("Enter the operator:");
                operator = scanner.next().charAt(0);
                System.out.println("Enter second number:");
                number2 = scanner.nextDouble();
                System.out.println("Enter '=' sign for output:");
                equal = scanner.next().charAt(0);
                System.out.println(equal);
                result = GetResult(number1, number2, operator);
                System.out.println("Output: " + result);
                System.out.println("\n\n\n");
            }
        } catch (InputMismatchException inputMismatchException){
            System.out.println("Please try right format like. 20+30=?");
        }
    }
    public static double GetResult(double number1,double number2,char operator){
        switch (operator){
            case '+':
                return number1+number2;
            case '-':
                return number1-number2;
            case '*':
                return number1*number2;
            case '/':
                return number1/number2;
            case '%':
                return number1%number2;
            default:
                System.out.println("Please try right format like. 20+30=?");
                return 0.0;
        }
    }
}
