package armnum;
import java.util.*;
import java.lang.*;
public class LambdaExpression7
{
    public static void main(String args[])
    {
        Map<String,String> list=new HashMap<String,String>();
        list.put("football","player");
        list.put("Eating","food");
        list.put("bhagyam","muppavarapu");
        StringBuilder string=new StringBuilder();
        for(Map.Entry<String,String> p:list.entrySet())
        {
            String str1=p.getKey()+p.getValue();
            System.out.println(str1);
            string.append(str1);
        }
        System.out.println(string);
    }
}
