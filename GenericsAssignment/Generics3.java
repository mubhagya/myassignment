package armnum;

import java.util.Arrays;

public class Generics3 {
    public static void swap(Object[] a,int i,int j)
    {
      Object temp=a[i];
      a[i]=a[j];
      a[j]=temp;
    }
    public static void main(String[] args)
    {
        String[] a = {"1","2","3","4","5"};
        System.out.println("before:"+ Arrays.toString(a));
        swap(a,1,3);
        System.out.println("after:"+ Arrays.toString(a));
    }
}
