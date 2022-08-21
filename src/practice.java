import java.io.*;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        double[] number1=new double[n];
        double[] number2=new double[n];
        double[] result=new double[n];
        for (int i=0;i<n;i++){
            number1[i]=scanner.nextDouble();
            number2[i]=scanner.nextDouble();
        }
        char operator=scanner.next().charAt(0);
        for (int i=0; i<n;i++){
            result[i]=getResult(number1[i],operator,number2[i]);
        }
        for (int i=0;i<n;i++){
            System.out.println(result[i]);
        }

    }
    public static double getResult(double number1,char operator,double number2){

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
