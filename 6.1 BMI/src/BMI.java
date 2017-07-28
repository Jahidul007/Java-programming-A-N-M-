
/**
 *
 * @author JAHIDUL ISLAM
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BMI_Test bmi = new BMI_Test("Tanvir",145,70);
        System.out.println("The BMI for "+bmi.getName()+" is ("+bmi.getBMI()+")"+bmi.getStatus());
    }
    
}
