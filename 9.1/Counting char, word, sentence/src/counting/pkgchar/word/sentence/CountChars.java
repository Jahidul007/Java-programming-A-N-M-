package counting.pkgchar.word.sentence;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountChars {
    
   public CountChars(){
       
   }
    
    public int getNumberOfChars(String str) throws IOException , FileNotFoundException {
        
        FileReader input = new FileReader(str);
        int count = 0,c;
        char ch;
        while((c=input.read())!=-1) {
            count++;
        }
        return count;
        
    }
    
}
