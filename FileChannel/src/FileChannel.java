import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import static java.time.Clock.system;
///import java.nio.channels.FileChannel;

public class FileChannel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File inputFile =new File("Hello.txt");
        if(!inputFile.exists())
        {
            System.out.println("THe input doesnot exists");
            return;
        }
        try
        {
            FileInputStream fis = new FileInputStream(inputFile);
            java.nio.channels.FileChannel fileChannel=fis.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while(fileChannel.read(buffer)>0)
            {
                buffer.flip();
                while(buffer.hasRemaining())
                {
                    byte b = buffer.get();
                    system.out.print((char)b);
                    
                }
                buffer.clear();
            }
            fileChannel.close();
        }
        catch(IOException e)
                {
                    e.printStackTrace();
                }
    }
    
}
