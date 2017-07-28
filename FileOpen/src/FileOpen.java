
import java.io.File;
import java.io.IOException;


public class FileOpen {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        File file = new File("new.txt");
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
        
    }
    
}
