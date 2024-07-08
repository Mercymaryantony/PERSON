import java.util.*;
class person
{
    String name,gender,address;
    int age;
    person(String name,String gen,String add,int age)
    {
        this.name=name;
        this.gender=gen;
        this.address=add;
        this.age=age;
    }
}
class employee extends person
{
    int empid,sal;
    String company_name,quali;
    employee(String name,String gen,String add,int age,int empid,int sal, String company,String qual)
    {
        super(name,gen,add,age);
        this.empid=empid;
        this.sal=sal;
        this.company_name=company;
        this.quali=qual;
    }
}
class teacher extends employee
{
    String subject,department;
    int teacherid;
    teacher(String name,String gen,String add,int age, int empid,int sal, String company,String qual,String sub,String dept, int tid)
    {
        super(name,gen,add,age,empid,sal,company,qual);
        this.subject=sub;
        this.department=dept;
        this.teacherid=tid;
    }
    void display()
    {
        System.out.println("Name"+name);
        System.out.println("Gender"+gender);
        System.out.println("Address"+address);
        System.out.println("Age"+age);
        System.out.println("Employee id"+empid);
        System.out.println("Salary"+sal);
        System.out.println("Company"+company_name);
        System.out.println("Qualification"+quali);
        System.out.println("Subject"+subject);
        System.out.println("department"+department);
        System.out.println("teacherid"+teacherid);
    }
}
public class index
{
    public static void main(String[] args)
    {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the size");
     int n=s.nextInt();
        teacher[] obj=new teacher[n];
        for(int i=0;i<n;i++)
        {
           
            System.out.println("Name");
     String name =s.next();
     System.out.println("Gender");
     String gen=s.next();
     System.out.println("Address");
     String add= s.next();
     System.out.println("Age");
     int age=s.nextInt();
     System.out.println("Employee id");
     int empid=s.nextInt();
     System.out.println("Salary");
     int sal= s.nextInt();
     System.out.println("Company");
     String cn=s.next();
     System.out.println("Qualification");
     String q=s.next();
     System.out.println("Subject");
     String sub=s.next();
     System.out.println("department");
     String tid=s.next();
     System.out.println("teacherid");
     int t=s.nextInt();
     obj[i]=new teacher(name, gen, add, age, empid, sal, cn, q, sub, tid, t);
        }
        for(int i=0;i<n;i++)
        obj[i].display();
    }
}
