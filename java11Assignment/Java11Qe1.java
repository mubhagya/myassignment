package armnum;
import java.lang.*;
import java.util.*;
public class Java11Qe1
{
    public static void main(String args[])
    {
        float p,r,t,SimpleInterest;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the amount of principle :");
        p=s.nextInt();
        System.out.println("Enter the rate :");
        r=s.nextInt();
        System.out.println("Enter the time :");
        t=s.nextInt();
        SimpleInterest=(p*r*t)/100;
        System.out.println("SimpleInterest is : " + SimpleInterest);

    }

}
