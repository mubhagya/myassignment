package armnum;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.*;
import java.lang.reflect.Method;
import java.lang.*;
import java.util.ArrayList;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute
{
    int Sequence();
}
class MyClass
{
    @Execute(Sequence=1)
    public void myMethod1()
    {
        System.out.println("Method 1");
    }
    @Execute(Sequence=2)
    public void myMethod2()
    {
        System.out.println("Method 2");
    }
    @Execute(Sequence=3)
    public void myMethod3()
    {
        System.out.println("Method 3");
    }
}

/*public class Annotation3
{
  public static void main(String[] args)
  {
      MyClass s = new MyClass();
      Method m1=s.getClass().getMethod("myMethod1");
      Method m2=s.getClass().getMethod("myMethod2");
      Method m3=s.getClass().getMethod("myMethod3");
      Execute e1=m1.getAnnotation(Execute.class);
      Execute e2=m2.getAnnotation(Execute.class);
      Execute e3=m3.getAnnotation(Execute.class);
      System.out.println(e1.Sequence());
      System.out.println(e2.Sequence());
      System.out.println(e2.Sequence());

  }
}*/
