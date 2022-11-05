package armnum;

public class armrange {
    public static void main(String args[])
    {
        int n1,n2,n3,result,temp;
        for(int num=100;num<=999;num++)
        {
            temp=num;
            n3=temp%10;
            temp=temp/10;
            n2=temp%10;
            temp=temp/10;
            n1=temp%10;
            result=(n1*n1*n1)+(n2*n2*n2)+(n3*n3*n3);
            if(num==result)
            {
                System.out.println(num+"is armstrong number");
            }
        }
    }
}
