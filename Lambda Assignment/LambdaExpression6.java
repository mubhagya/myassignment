package armnum;
import java.lang.*;
import java.util.*;
public class LambdaExpression6
{
    public static void main(String[] args)
    {
        List<String> list=new ArrayList<String>();
        list.add("Muppavarapu");
        list.add("bhagya");
        list.add("guru");
        list.add("lakshmi");
        list.replaceAll(p -> p.toUpperCase());
        System.out.println(list);
    }
}
