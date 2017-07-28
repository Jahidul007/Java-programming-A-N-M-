import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;
public class FileChannelWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File outputFile = new File("hello.txt");
        String text = "I love Bangladesh.";
        
        try  
        {
            FileOutputStream fos =new FileOutputStream(outputFile);
            FileChannel fileChannel = fos.getChannel();
            
            byte[] bytes = text.getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(bytes);
            fileChannel.write(buffer);
            fileChannel.close();
            
        }
        catch(java.io.IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
