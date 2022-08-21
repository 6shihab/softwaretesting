import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class practice3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str = scanner.nextLine();
        String[] array = str.split(" ");
        int[] numbers=new int[array.length];
        for (int i=0;i<array.length;i++){
            numbers[i]=Integer.parseInt(array[i]);
        }

        System.out.println(getSum(numbers));
        System.out.println(getAverage(numbers));
    }
    public static double getSum(int[] numbers){
        int sum=0;
        int i=0;
        do{
            sum=sum+numbers[i];
            i++;
        }while (i<numbers.length);
        return sum;
    }
    public static double getAverage(int[] numbers){
        int average=0;
        int i=0;
        do{
            average=average+numbers[i];
            i++;
        }while (i<numbers.length);
        return average/numbers.length;
    }
}
