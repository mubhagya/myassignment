package armnum;
import java.util.*;
public class avg {
    public static void main(String args[])
    {
        int a[],b[],c[],i;
        Scanner s=new Scanner(System.in);
        double avg[],avg1[],total[],total1[];
        System.out.println("enter size");
        int n=s.nextInt();
        a=new int[n];
        b=new int[n];
        c=new int[n];
        avg=new double[n];
        total=new double[n];
        total1=new double[n];
        avg1=new double[n];
        System.out.println("enter first student marks");
        for(i=0;i<3;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("enter second student marks");
        for(i=0;i<3;i++)
        {
            b[i]=s.nextInt();
        }
        System.out.println("enter third student marks");
        for(i=0;i<3;i++)
        {
            c[i]=s.nextInt();
        }
        total[0]=a[0]+a[1]+a[2];
        total[1]=b[0]+b[1]+b[2];
        total[2]=c[0]+c[1]+c[2];
        avg[0]=total[0]/3;
        avg[1]=total[1]/3;
        avg[2]=total[2]/3;
        System.out.println("total marks of the student1 :"+total[0]+"\ntotal marks of student2:"+total[1]+"\n total marks of student3:"+total[2]);
        System.out.println("average marks of the student1 :"+avg[0]+"\n average marks of the student2:"+avg[1]+"\naverage marks of student3"+avg[2]);
        total1[0]=a[0]+b[0]+c[0];
        total1[1]=a[1]+b[1]+c[1];
        total1[2]=a[2]+b[2]+c[2];
        avg1[0]=total1[0]/3;
        avg1[1]=total[1]/3;
        avg1[2]=total1[2]/3;
        System.out.println("total marks of students in first subject:"+total1[0]+"\ntotal marks of students in second subject:"+total1[1]+"\ntotal marks of students in third subject is:"+total1[2]);
        System.out.println("average marks of the students in first subject is:"+avg1[0]+"\n average marks of students in second subject:"+avg1[1]+"\naverage marks of students in third subject is:"+avg1[2]);

    }
}
