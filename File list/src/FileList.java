import java.io.File;

public class FileList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File home = new File("E:\\MY STUDY TOOLS\\java new\\File delete");
        File[] listRoots= home.listFiles();
        for(File file : listRoots)
        {
            System.out.println(file.getPath());
        }
        
    }
    
}
