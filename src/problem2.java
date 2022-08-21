import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of \"number pair\"");
        int n = input.nextInt();

        double[] number1 = new double[n];
        double[] number2 = new double[n];
        double[] result = new double[n];

        for(int i=0;i<n;i++){
            int pairNumber = i+1;
            System.out.println("enter the 1st number for pair number " + pairNumber);
            number1[i] = input.nextDouble();
            System.out.println("enter the 2nd number for pair number " + pairNumber);
            number2[i] = input.nextDouble();
        }

        System.out.println("enter the operator");
        char operator = input.next().charAt(0);

        for(int i=0;i<n;i++){
            result[i] = GetResult(number1[i],number2[i],operator);
        }

        for(int i=0;i<n;i++){
            int pairNumber = i+1;
            System.out.println("Result for pair number " + pairNumber + " is:" + result[i]);
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
                if (number2==0){
                    System.out.println("Can't devided by zero");
                    return 0;
                }
                return number1/number2;
            case '%':
                return number1%number2;
            default:
                return 0.0;
        }
    }
}
