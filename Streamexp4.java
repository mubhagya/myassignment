package armnum;
import java.lang.*;
import java.util.*;
 class Transaction
{
    Traders Trader;
    int year;
    int value;
    Transaction(Traders Trader,int year,int value)
    {
        this.Trader=Trader;
        this.year=year;
        this.value=value;

    }
    public Traders getTrader()
    {
        return Trader;
    }
    public int getYear()
    {
        return year;
    }
    public int getValue()
    {
        return value;
    }
    @Override
    public String toString()
    {
        return "Transaction{"+"Traders="+Trader+",year="+year+",value="+value+'}';
    }

}
public class Streamexp4
{
    public static void main(String args[])
    {
        List<Transaction> list=Arrays.asList(
         new Transaction(new Traders("bhagyam","guntur"),2011,100000),
          new Transaction(new Traders("bhanu","banglore"),2010,50000),
          new Transaction(new Traders("rani","hyderabad"),2011,75000),
           new Transaction(new Traders("guru","delhi"),2014,50000),
           new Transaction(new Traders("lakshmi","pune"),2014,75000),
            new Transaction(new Traders("teddy","pune"),2020,76000));
        System.out.println(list);
        list.stream().filter(p->p.Trader.getCity().equalsIgnoreCase("delhi")).forEach(p->System.out.println(p.getValue()));
        Optional<Transaction> MaxValue=list.stream().max(Comparator.comparingInt(Transaction::getValue));
        System.out.println(MaxValue.get());
        Optional<Transaction> MinValue=list.stream().min(Comparator.comparingInt(Transaction::getValue));
        System.out.println(MinValue);
        list.stream().filter(p->p.getYear()==2011).forEach(p->System.out.println(p.getValue()));

    }
}
