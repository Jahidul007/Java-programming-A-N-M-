import java.io.File;
import java.io.IOException;

public class FileRename {

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
        File oldFile = new File ("Hello.txt");
        File newFile = new File ("newFile.txt");
        
        boolean fileRenamed = oldFile.renameTo(newFile);
        
        if(fileRenamed)
        {
            System.out.println(oldFile+ " Renamed to "+ newFile);
        }
        else
        {
            System.out.println("Renaming "+oldFile+ " to "+ newFile+ " Failed");
        }
    }
    
}
