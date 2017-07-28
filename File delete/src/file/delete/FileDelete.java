/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.delete;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author JAHIDUL ISLAM
 */
public class FileDelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          File file = new File("Hello.txt");
        if(file.exists())
        {
            System.out.println("File exist");
        }
        else
        {
            System.out.println("File doesnot exist, lets create one");
            try
            {
                file.createNewFile();
                
            }
            catch(IOException e)
                    {
                        e.printStackTrace();
                    }
        }
     File file1 = new File("Hello.txt");
     file1.delete();
     System.out.println("Now File deletd");
    }
    
}
