package armnum;

public class Stringbuilder
    {
        public static void main(String args[])
        {
          StringBuilder str=new StringBuilder("Stringbuffer");
          str.append("Stringbuffer");
          System.out.println("String="+str.toString());
          StringBuilder reversestr=new StringBuilder("this method returns reserved objects on which it was called Stringbuffer class");
          reversestr.reverse();
          System.out.println("reverse string is="+reversestr.toString());
          StringBuilder insertstr=new StringBuilder("inserttest");
          insertstr.insert(6,"_");
          System.out.println("insert string is="+insertstr.toString());


        }

    }

