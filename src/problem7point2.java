import java.io.*;
import java.util.Scanner;

public class problem7point2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String data = sc.nextLine();
        byte[] buf = data.getBytes();
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
        for (byte b:buf) {
            dos.writeChar(b);
        }
        dos.flush();

        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
        while(true) {
            char ch;
            try {
                ch = dis.readChar();
                System.out.print(ch);
            } catch (EOFException e) {
                System.out.println(e);
                System.out.println("\n");
                System.out.println("\nEnd of file reached");
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
