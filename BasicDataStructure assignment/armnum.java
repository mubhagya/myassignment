package armnum;
import java.util.*;

public class armnum {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int n=s.nextInt();
        int temp=n;
        int res=0;
        while(temp>0)
        {
            int id=temp%10;
            res=res+id*id*id;
            temp=temp/10;
        }
        if(res==n)
        {
            System.out.println("number is armstrong");
        }
        else
        {
            System.out.println("number is not armstrong");
        }

    }
}
