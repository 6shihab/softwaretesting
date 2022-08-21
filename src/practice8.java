import java.io.*;
import java.util.Scanner;
public class practice8 {
    public static void main(String[] args) throws IOException {

        File file=new File("number.txt");
        Scanner fileScanner=new Scanner(file);
        PrintWriter info=new PrintWriter("newfile.txt");
        System.out.println(fileScanner.hasNextInt());
        while (fileScanner.hasNextInt()){
            int a=fileScanner.nextInt();
            int b=fileScanner.nextInt();
            System.out.println(a+b);
            info.println("Numbers are: "+a+" "+b);
            info.println("Sum="+(a+b));
            info.println("Subtraction= " + (a-b));
        }
        info.flush();
        info.close();


        FileInputStream fileInputStream=new FileInputStream("newfile.txt");
        DataInputStream dataInputStream=new DataInputStream(fileInputStream);
        try {

            while (true) {
                byte c = dataInputStream.readByte();
                System.out.print((char) c);
            }
        }catch (EOFException eofException){

        }



    }
}
