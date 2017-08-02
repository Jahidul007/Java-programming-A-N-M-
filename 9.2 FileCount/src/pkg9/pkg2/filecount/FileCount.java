/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.pkg2.filecount;
				
				
import java.io.*;
import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.io.File;
/**
 *
 * @author JAHIDUL ISLAM
 */
public class FileCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int count = new File("E:\\MY STUDY TOOLS\\java new\\9.2 FileCount").list().length;
        
       
            System.out.println(count);

    }
    
}
