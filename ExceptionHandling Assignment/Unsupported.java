package armnum;

import java.util.Scanner;

public class Unsupported {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter dividend number=");
        int devidend=s.nextInt();
        System.out.println("enter divisor number=");
        int divisor=s.nextInt();
        int result= devidend/divisor;
        System.out.println("the result is :"+result);
        try{
            result=devidend/divisor;
            System.out.println("the result is :"+result);
        }
        catch(java.lang.UnsupportedOperationException e){
            System.out.println("can't be devided by zero"+e);
        }

    }
}