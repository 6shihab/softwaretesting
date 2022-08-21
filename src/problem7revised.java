import java.io.*;
import java.util.Scanner;

public class problem7revised {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fStream = new FileWriter("data.txt");
            BufferedWriter info = new BufferedWriter(fStream);
            for (int i=0;i<6;i++){
                info.write("Hello\r\n");
            }
            info.close();
        } catch (Exception e) {
            System.out.println("A write error has occurred");
        }

        try {
            File file = new File("data.txt"); // java.io.File
            FileReader fr = new FileReader(file); // java.io.FileReader
            BufferedReader br = new BufferedReader(fr); // java.io.BufferedReader
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
