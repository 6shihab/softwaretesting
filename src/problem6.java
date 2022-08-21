import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        System.out.println("Enter the numbers to construct the array");
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Result of the sum is: " + GetSum(array));
        System.out.println("Result of the average is: " + GetAverage(array));
    }
    public static int GetSum(int[] arr){
        int sum=0;
        int i=0;
        do{
            sum+=arr[i];
            i++;
        }while (i<arr.length);

        return sum;
    }
    public static double GetAverage(int[] arr){
        int sum=0;
        int i=0;
        do{
            sum+=arr[i];
            i++;
        }while (i<arr.length);

        return (sum*1.0)/arr.length;
    }
}
