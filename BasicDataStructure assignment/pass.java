package armnum;
import java.util.*;
public class pass {
    public static void main(String args[])
    {
        int sub1,sub2,sub3;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the marks of subject1:");
        sub1=s.nextInt();
        System.out.println("enter the marks of subjects2:");
        sub2=s.nextInt();
        System.out.println("enter the marks of subject3:");
        sub3=s.nextInt();
        if(sub1>60 && sub2>60 && sub3>60)
        {
            System.out.println("passed");
        }
        else if((sub1>60 && sub2>60) || (sub2>60 && sub3>60) || (sub1>60 && sub3>60))
        {
            System.out.println("prompted");

        }
        else
        {
            System.out.println("failed");
        }
    }
}
