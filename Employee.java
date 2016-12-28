public class Employee
{
public String name;
public int id;
public int ssid;
public double salary;
Employee(String name, int id,int ssid, double salary)
{
this.name=name;
this.id=id;
this.ssid=ssid;
this.salary=salary;
}
void display()
{
System.out.println(name+"" +id+"" +ssid+"" +salary);
}


class Manager extends Employee
{
public String dept;
Manager(String name, int id, int ssid, double salary, String dept)
{
super(name,id,ssid,salary);
this.dept=dept;
}
void display()
{
System.out.println(name+"" +id+"" +ssid+"" +salary+"" +dept);
}
}

class Engineer extends Employee
{
public String designation;
Engineer(String name,int id,int ssid,double salary, String designation)
{
super(name,id,ssid,salary);
this.designation=designation;
}
void display1()
{
System.out.println(name+"" +id+"" +ssid+"" +salary+"" +designation);
}
}

public static void main(String[] args)
{
{
Manager m=new Manager("Shubha",40, 39,35000,"HR");
m.display();
}
{
Engineer e=new Engineer("Shruti",36,45,500000,"Senior Engg");
e.display1();
}
}
}
