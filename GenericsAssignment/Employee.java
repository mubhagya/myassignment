package armnum;
import java.util.*;
 class Employee {
     int id;
     String name;
     float salary;
     String department;

     public Employee(int id, String name, float salary, String department) {
         this.id = id;
         this.name = name;
         this.salary = salary;
         this.department = department;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", salary=" + salary +
                 ", department='" + department + '\'' +
                 '}';
     }
 }
 class Exam
     {
         public static void main(String[] args)
         {
             HashSet<Employee> set=new HashSet<>();
             set.add(new Employee(1,"bhagya",20000,"software"));
             set.add(new Employee(2,"guru",50000,"developer"));
             Iterator<Employee> itr=set.iterator();
             {
                 while(itr.hasNext())
                 {
                     /*Employee employee=(Employee) itr.next();
                     System.out.println(employee.toString());*/
                     System.out.println(itr.next());
                 }
             }
         }
     }




