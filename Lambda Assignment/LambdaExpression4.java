package armnum;
import java.lang.*;
import java.util.*;
public class LambdaExpression4
{
    public static void main(String args[])
    {
        List<String> list=new ArrayList<String>();
        list.add("bhagya");
        list.add("muppavarap");
        list.add("sai");
        list.add("bhan");
        list.removeIf(p -> p.length()%2!=0);
        System.out.println(list);
    }
}
