package counting.pkgchar.word.sentence;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CountLines {
    
    public CountLines(){
       
   }
    
    public int getNumberOfLines(String str) throws IOException , FileNotFoundException {
        
        FileReader input = new FileReader(str);
        int count = 0,c;
        //boolean docount=false;
        char ch;
        while((c=input.read())!=-1) {
            ch = (char)c;
            if(ch=='\n')count++;
        }
        return count+1;
        
    }
    
}
