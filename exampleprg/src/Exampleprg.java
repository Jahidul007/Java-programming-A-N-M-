public class Exampleprg {

    /**
     * @param args the command line arguments
     */
    String str1,str2;
    Exampleprg(String[] vargs)
    {
        for (String varg : vargs) {
            str1 = varg;
            System.out.println("hello "+ str1+".");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Exampleprg ex = new Exampleprg(args);
       
    }
    
}
