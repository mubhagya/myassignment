package armnum;

abstract class oops4 {
    public void display() {
        System.out.println("concrete method of parent class");
    }
}
     class Demo extends oops4{
        public void display2(){System.out.println("override abstract method");}
        public static void main(String args[])
        {
           Demo d= new Demo();
           d.display();
           d.display2();
        }
    }

