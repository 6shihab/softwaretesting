import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printwriter = new PrintWriter("newfile.txt");
        File file = new File("number.txt");
        Scanner scanner = new Scanner(file);
        int sum = 0;
        System.out.println(scanner.hasNextInt());
        while(scanner.hasNextInt()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            printwriter.print(a + b);
            printwriter.print(" ");
            printwriter.print(a - b);
            printwriter.print(" ");
            printwriter.print(a * b);
            printwriter.print(" ");
            printwriter.print(a / b);
            printwriter.println();
        }
        printwriter.close();
    }
}
