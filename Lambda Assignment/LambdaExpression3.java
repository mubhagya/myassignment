package armnum;
import java.lang.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
public class LambdaExpression3
{
    public static void main(String[] args)
    {
        Supplier<Integer> a=new Supplier<Integer>()
        {
          @Override
          public Integer get()
          {
              return 8;
          }
        };
        Consumer<Integer> b=new Consumer<Integer>()
        {
            @Override
            public void accept(Integer integer)
            {
                System.out.println(integer);
            }
        };
        Predicate<Integer> c=new Predicate<Integer>()
        {
            @Override
            public boolean test(Integer integer)
            {
                System.out.println(integer);
                return true;
            }
        };
        Function<Integer,Integer> d=new Function()
        {
           @Override
           public Object apply(Object o)
           {
               System.out.println(o);
               return o;
           }
        };
        a.get();
        b.accept(8);
        c.test(18);
        d.apply(45);

    }

}




