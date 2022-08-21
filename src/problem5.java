import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        long factorial = 1;
        for (int i = 1; i <= number; i++)
        {
            factorial = factorial * i;
        }
        long factorialForWhileLoop = 1;
        int i=1;
        while(i<=number){
            factorialForWhileLoop*=i;
            i++;
        }
        System.out.println("Factorial of " + number + " is using for loop = " + factorial);
        System.out.println("Factorial of " + number + " is using while loop =  " + factorialForWhileLoop);
    }
}
