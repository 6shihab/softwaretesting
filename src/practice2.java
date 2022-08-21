import java.util.Scanner;
import java.io.*;

public class practice2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //problem 3
//        String original=scanner.nextLine();
//        String reverse="";
//        int length=original.length()-1;
//        while (length>=0){
//            reverse=reverse+original.charAt(length);
//            length--;
//        }
//        if (original.equals(reverse)){
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Not palindrome");
//        }





        //problem 5
        int number=scanner.nextInt();
        int factorialfor=1;
        int factorialwhile=1;
        for (int i=1;i<=number;i++){
            factorialfor=factorialfor*i;
        }
        int i=1;
        while (i<=number){
            factorialwhile=factorialwhile*i;
            i++;
        }
        System.out.println(factorialfor+"="+factorialwhile);
    }
}
