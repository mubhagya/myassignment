package armnum;

public class Singletone {
    static Singletone st=new Singletone();
    public Singletone()
    {
        System.out.println("singletone class");
    }
    static Singletone getInstance()
    {
        return st;
    }
}
class test
{
    public static void main(String[] args)
    {
        Singletone s1=new Singletone();
        Singletone s2=new Singletone();
        System.out.println(s1);
        System.out.println(s2);
    }
}
