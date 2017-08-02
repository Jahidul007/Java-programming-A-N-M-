/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.pkg5.touppercase;
				
				
import java.io.*;
import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author JAHIDUL ISLAM
 */
public class ToUpperCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
       File input = new File("input.txt");
       File output = new File("output2.txt");
       Scanner sc = new Scanner(input);
        
        PrintWriter printer = new PrintWriter("output2.txt");
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            String s1 = s.toUpperCase();
            System.out.println(s1);
            printer.write(s1);
            printer.flush();
            printer.close();
        }
        }
   catch(FileNotFoundException e) {
        System.err.println("File not found. Please scan in new file.");
    }
    }
    
}
