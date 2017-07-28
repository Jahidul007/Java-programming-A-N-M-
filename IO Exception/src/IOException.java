import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
public class IOException {

    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader reader;
        
        reader = new BufferedReader(InputStreamReader(System.in));
        String line;   
        do
        {
            line = reader.readLine();
            line = line.toUpperCase();
            System.out.println(line);
        }while(!"quit".equals(line));
    }

  
    
}
