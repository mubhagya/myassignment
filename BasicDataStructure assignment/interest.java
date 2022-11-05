package armnum;
import java.util.*;
public class interest {
    public static void main(String args[])
    {
        double p,r,t,simple,compound;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of p:");
        p=s.nextDouble();
        System.out.println("enter the value of annual rate of interest:");
        r=s.nextDouble();
         System.out.println("enter the time(years)=");
         t=s.nextDouble();
         simple=(p*r*t)/100;
         compound=p*Math.pow(1.0+r/100.0,t)-p;
         System.out.println("simple interest:"+simple);
         System.out.println("compound interest:"+compound);
    }
}
