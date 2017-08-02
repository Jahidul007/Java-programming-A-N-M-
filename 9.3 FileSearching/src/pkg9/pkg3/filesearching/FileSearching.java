/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.pkg3.filesearching;

import java.util.Scanner;
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
public class FileSearching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner sc = new Scanner(System.in);
       File input = new File(sc.next());
       if (input.exists())
       {
           System.out.println("File exists");
       }
       else
       {
           System.out.println("File doesn't exist");
       }
    }
    
}
