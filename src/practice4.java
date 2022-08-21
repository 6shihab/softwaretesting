import java.io.*;
import java.util.*;

public class practice4 {
    public static void main(String[] args) throws IOException {
//    try {
//        System.out.println(Class.forName("People$identity"));
//
//    } catch (ClassNotFoundException e) {
//        System.out.println(e);
//    }

//        FileWriter file=new FileWriter("info.txt");
//        BufferedWriter info=new BufferedWriter((file));
//        info.write("Hello shihab\nHow are you.");
//        info.flush();
//        info.close();
//        file.close();
//
//
//        FileReader fileReader=new FileReader("info.txt");
//        BufferedReader br=new BufferedReader(fileReader);
//        String line;
//        while ((line= br.readLine())!=null){
//            System.out.println(line);
//        }
//        br.close();
//        fileReader.close();

        FileWriter file=new FileWriter("info.txt");
        BufferedWriter info=new BufferedWriter(file);
        info.write("Hei shihab. Whassup?\nHow was going man." +
                " This is very Hard Time for me Bro.\nPlease preay for me.");
        info.close();

        FileInputStream fileInputStream=new FileInputStream("info.txt");
        DataInputStream dis= new DataInputStream(fileInputStream);
        try {
            while (true){
                byte c=dis.readByte();
                System.out.print((char)c);
            }
        }catch (EOFException eofException){
            System.out.println("\n\n");
            System.out.println(eofException);
        }


    }

}
class People{
        public static void identity(String name, int age) {
        System.out.println("Name: " + name + "\nAge: "+ age);
    }
}