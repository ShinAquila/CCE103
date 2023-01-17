package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        char[] charUwU = new char[100];

        FileReader file = new FileReader("BufferedReader/ReadFromFile.txt");
        BufferedReader readOwO = new BufferedReader(file);
        readOwO.read(charUwU);
        
        System.out.print("Data: ");
        System.out.print(charUwU);
        System.out.println();

        readOwO.close(); 
    }
}
