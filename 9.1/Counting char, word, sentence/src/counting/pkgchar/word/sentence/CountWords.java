package counting.pkgchar.word.sentence;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountWords {
    
   public CountWords(){
       
   }
    
    public int getNumberOfWords(String str) throws IOException , FileNotFoundException {
        
        FileReader input = new FileReader(str);
        int count = 0,c;
        boolean docount=false;
        char ch;
        while((c=input.read())!=-1) {
            ch = (char)c;
            //System.out.println(ch);
            if((ch==' '||ch=='.'||ch=='\n')&&docount==true){
                count++;
                docount = false;
            }
            else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9'))docount=true;
        }
        if(docount)count++;
        return count;
        
    }
    
}
