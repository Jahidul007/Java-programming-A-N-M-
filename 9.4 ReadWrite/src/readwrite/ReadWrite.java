
package readwrite;

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
public class ReadWrite {

    private static String ch;

    public static void main(String[] args) {
        // TODO code application logic here
        Reader reader = null;
        try
        {
            reader = new FileReader("input.txt");
            int c ;
            while ((c=reader.read())!=-1)
            {
                char  ch = (char)c;
                System.out.print(ch);
                
            }
            System.out.println();
        }
        catch(IOException e)
                {
                    e.printStackTrace();
                }
        finally
        {
        try
        {
            if(reader!=null)
            {
                reader.close();
            }
        }
            catch(IOException e)
                {
                    e.printStackTrace();
                }
        
        }
        try {
       File input = new File("input.txt");
       File output = new File("output2.txt");
       Scanner sc = new Scanner(input);
        
        PrintWriter printer = new PrintWriter("output2.txt");
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            ///System.out.println(s);
            printer.write(s);
            printer.flush();
            printer.close();
        }
        }
   catch(FileNotFoundException e) {
        System.err.println("File not found. Please scan in new file.");
    }
        
    
    }
}
