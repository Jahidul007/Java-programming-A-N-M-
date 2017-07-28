import java.io.File;
import java.io.FileFilter;
public class FileFiltering {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File home =new File("E:\\MY STUDY TOOLS\\java new\\File delete");
        
        FileFilter xmlFlter = new FileFilter()
        {
            @Override
            public boolean accept (File pathname)
            {
                String fileName = pathname.getName();
                if(fileName.endsWith(".xml"))
                {
                    return true;
                }
                return false;
            }
            
        };
        File[] listRoots = home.listFiles(xmlFlter);
         for(File file : listRoots)
        {
            System.out.println(file.getPath());
        }
        
    }
    
}
