package armnum;
import java.lang.*;

import java.util.*;
public class LambdaExpression8
{
   public static void main(String args[]) {

       Thread t = new Thread(()->{
           List<Integer> list = new ArrayList<>();
       list.add(23);
       list.add(90);
       list.add(89);
       System.out.println(list);

   });
                t.start();
   }
}
