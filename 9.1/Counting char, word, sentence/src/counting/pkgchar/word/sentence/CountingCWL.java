package counting.pkgchar.word.sentence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountingCWL {

    public static void main(String[] args) throws FileNotFoundException {

        File input = new File(System.getProperty("user.dir") + File.separator + "Input.txt");
        
        CountChars cc = new CountChars();
        try{
            System.out.println("The number of characters : "+cc.getNumberOfChars(input.getPath()));
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch(IOException e){
            System.out.println("File can not be read.");
        }
        
        CountWords cw = new CountWords();
        try{
            System.out.println("The number of words : "+cw.getNumberOfWords(input.getPath()));
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch(IOException e){
            System.out.println("File can not be read.");
        }
        
        CountLines cl = new CountLines();
        try{
            System.out.println("The number of lines : "+cl.getNumberOfLines(input.getPath()));
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch(IOException e){
            System.out.println("File can not be read.");
        }
        
    }
    
}
