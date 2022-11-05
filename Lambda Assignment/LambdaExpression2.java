package armnum;
import java.util.*;
import java.util.function.Predicate;
interface Order
{
    void delivery(int price);
}

public class LambdaExpression2
{
    public static void main(String args[])
    {
        Order price=a->
        {
            if(a>15000)
            {
                System.out.println("order delivery complete");
            }
            else
            {
                System.out.println("order delivery not complete");
            }
        };
        price.delivery(10000);
    }
}
