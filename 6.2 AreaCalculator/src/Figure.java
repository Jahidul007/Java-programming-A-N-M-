
/**
 *
 * @author JAHIDUL ISLAM
 */
public class Figure {
    public void getArea( double ras)
    {
        System.out.println("Area of circle "+ras*ras*3.1416);
    }
     public void getArea(int lg,int wd)
    {
        System.out.println("Area of triangle "+lg*wd*0.5);
    }
      public void getArea(double bs,double ht)
    {
        System.out.println("Area of Rectangle "+bs*ht);
    }
       public void getArea(double r,int he)
    {
        System.out.println("Area of Cylinder "+r*r*he*3.1416);
    }
    
}
