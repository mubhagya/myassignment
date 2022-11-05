package armnum;

abstract class Shapes {
    abstract void draw();
}
class Rectangle
{
    int length,breadth;
    void draw(int l,int b)
    {
        length =l;
        breadth = b;
        System.out.println("drawing rectangle of length and breath");
    }
}
class Line
{
    int length;
    void draw(int l)
    {
        length = l;
        System.out.println("drawing line of length"+length);
    }
}
class Cube
{
    int side;
    void draw(int l)
    {
        side=l;
        System.out.println("drawing cube of side"+side);
    }
}
class Draw
{
    public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        Line l=new Line();
        Cube c=new Cube();
        r.draw(4,5);
        l.draw(7);
        c.draw(8);
    }
}

