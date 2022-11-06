package armnum;
import java.lang.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.stream.Collectors;
class Traders
{
    String name;
    String city;

        public Traders(String name, String city)
        {
            this.name = name;
            this.city = city;
        }
    public String getName()
    {
        return name;
    }


    public String getCity()
    {
        return city;
    }
   @Override
   public boolean equals(Object o)
   {
       if(this == o) return true;
       if(!(o instanceof Traders)) return false;
       Traders trader=(Traders)o;
       return Objects.equals(getCity(),trader.getCity());

   }
   @Override
    public int hashCode()
   {
       return Objects.hash(getCity());
   }
   @Override
    public String toString(){
           return "Trader{" +
                   "name='" + name + '\'' +
                   ", city='" + city + '\'' +
                   '}';
        }
}
public class StreamExp3
{
    public static void main(String[] args)
    {
        List<Traders> trader =Arrays.asList(
        new Traders("bhagya","bangalore"),
        new Traders("vishnu","hyd"),
        new Traders("guru","guntur"),
        new Traders("priya","delhi"),
        new Traders("vishnu","hyd"),
         new Traders("lakshmi","pune")
        );
        System.out.println("Unique cities");
        trader.stream().distinct().forEach(p->System.out.println(p.getCity()));
        System.out.println("Traders in pune sorted by Name");
        trader.stream().filter(p->p.getCity().equalsIgnoreCase("pune")).sorted((Comparator.comparing(Traders::getName))).forEach(p->System.out.println(p.getName()));
        System.out.println("traders who is in guntur");
        trader.stream().filter(p->p.getCity().equalsIgnoreCase("guntur")).forEach(p->System.out.println(p.getName()));
        System.out.println("traders names sorted Alphabetically");
        trader.stream().sorted(Comparator.comparing(Traders::getName)).collect(Collectors.toList()).forEach(p->System.out.println(p.getName()));

            }
        }



