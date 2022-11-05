package armnum;

public class Stringmethods {
    public static void main(String[] args) {
        String str = new String("java string pools refers to a collection of Strings which are stored in heap memory");
        System.out.println("lower case given string is\n" + str.toLowerCase());
        System.out.println("upper case given string is\n" + str.toUpperCase());
        System.out.println("after replacing the all a character with $ sign is\n"+str.replace('a','$'));
        System.out.println(str.contains("collection"));
        System.out.println("java string pools refers to a collection of Strings which are stored in heap memory ");
        System.out.println(str.matches("java string pools refers to a collection of Strings which are stored in "));
        System.out.println(str.equals("java string pools refers to a collection of Strings which are stored in heap memory "));
        if(str==str)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }

        }

    }

