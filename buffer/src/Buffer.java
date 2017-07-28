import java.nio.ByteBuffer;
import  java.nio.InvalidMarkException;

public class Buffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ByteBuffer bb = ByteBuffer.allocate(1);
        System.out.println("Capacity: "+bb.capacity());
        System.out.println("Limit: "+bb.limit());
        System.out.println("position: "+bb.position(1));
        try
        {
            bb.reset();
            System.out.println("position: "+bb.position());
        }
        catch(InvalidMarkException e)
        {
            System.out.println("Mark is not set");
        }
        
    }
    
}
