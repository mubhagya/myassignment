package armnum;
import java.util.*;
public class Generics2 {
    public static void main(String args[])
    {
        HashMap<Integer,Double> map=new HashMap <Integer,Double>();
        map.put(1,1.1);
        map.put(2,2.2);
        map.put(3,3.3);
        map.put(4,4.4);
        map.put(5,5.5);
        map.put(6,6.6);
        map.put(7,7.7);
        map.put(8,8.8);
        map.put(9,9.9);
        map.put(10,10.4);
        System.out.println("size of map is:"+map.size());
        for(Map.Entry m : map.entrySet());
        System.out.println(map);
    }

}
