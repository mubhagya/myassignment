package armnum;

public class Oops3 {
    String name;
    int money;
    Oops3(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void fixeddeposite()
    {
        System.out.println("money deposited is"+money);
    }
    public int totalMoney(){ return money;}


}
class current
{
    String name;
    int moneyc;
    current(String name, int moneyc)
    {
        this.name=name;
        this.moneyc=moneyc;
    }
    public int cashcredit()
    {
     System.out.println("money credited is:"+moneyc);
     return moneyc;
    }
    public int totalMoney(){ return moneyc;}
}
 class bank2{
    public static void main(String args[])
    {
        Oops3 b=new Oops3("John",1000);
        b.fixeddeposite();
        int p=b.totalMoney();
        current c=new current("bhag",2000);
        c.cashcredit();
        int d=c.totalMoney();
        int y=p+d;
        System.out.println("total money in the bank is"+y);
    }
}
