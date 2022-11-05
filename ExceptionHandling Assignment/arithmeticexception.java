//ha

package armnum;

import java.util.*;
public class arithmeticexception {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter dividend number=");
        int devidend=s.nextInt();
        System.out.println("enter divisor number=");
        int divisor=s.nextInt();
        int result= devidend/divisor;
        System.out.println("the result is :"+result);
    }
}
