
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JAHIDUL ISLAM
 */
public class BMI_Test {
    public static final double Kilograms_Per_Pound = 0.45359237;
       public static final double Meter_Per_Inch = 0.0254;
       private String name;
       private double weight ;
       private double height ;
       public BMI_Test(String name, double weight ,double height ) 
               {
                   this.name = name;
                   this.weight = weight ;
                   this.height = height ;    
               }    
       public double getBMI()
       {
           double value= (weight*Kilograms_Per_Pound/((height*Meter_Per_Inch)*(height*Meter_Per_Inch)));
           value =Double.parseDouble(new DecimalFormat("##.##").format(value));
           return value ;
       }
       public String getStatus()
       {
           double bmi =getBMI() ;
        ;
           if (bmi<18.5)
           {
               return "Underweight";
           }
           else if (bmi<=25)
           {
               return "Normal";
           }
           else
           {
               return "overweight";
           }        
           
       }
       public String getName()
       {
           return name;
       }
       
}
