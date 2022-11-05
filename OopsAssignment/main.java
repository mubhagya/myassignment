package armnum;

 class employee {
    String name;
    int salary;
    employee()
    {
        name=null;
        salary=0;
    }
    employee(String name, int salary)
    {
        this.name=name;
        this.salary=salary;
    }
    int getSalary()
    {
        return salary;
    }
}
class Manager extends employee{
    int hra,ta;
    Manager()
    {
     super();
     hra=ta=0;
    }
    Manager(String n, int sal, int h,int t)
    {
        super( n,sal);
        hra=h;
        ta=t;
    }
    int getSalary()
    {
        return(super.getSalary()+hra+ta);
    }
}
class Labour extends employee{
    int hra,ta;
    Labour()
    {
        super();
        hra=ta=0;
    }
    Labour(String n, int sal, int h,int t)
    {
        super(n, sal);
        hra=h;
        ta=t;

        }
        int getSalary()
        {
            return(super.getSalary()+hra+ta);
        }
}
public class main {
    public static void main(String[] args) {
    Manager m1=new Manager("bhagyam",20000,500,1800);
    Labour lab=new Labour("siva",10000,500,1000);
    System.out.println("salary of manager"+m1.name+"="+m1.getSalary());
    System.out.println("salary of labour"+m1.name+"="+lab.getSalary());

    }
}