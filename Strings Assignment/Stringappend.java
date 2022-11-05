package armnum;

public class Stringappend {
    public static void main(String[] args) {
     System.out.println("StringBuffer");
     StringBuffer sbf=new StringBuffer("StringBuffer");
     String str=new String("is a peel class of string");
     sbf.append(str);
     System.out.println("result after appenind is="+sbf);
     System.out.println("that provides a much of");
     sbf=new StringBuffer("that provides amuch of");
     str=new String("the funcionality of strings");
     sbf.append(str);
     System.out.println("result after appendind is="+sbf);
    }
}