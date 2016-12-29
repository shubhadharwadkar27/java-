public class Employee
{
 String name;
 int id;
 int ssid;
 double salary;
Employee(String name, int id,int ssid, double salary)
{
this.name=name;
this.id=id;
this.ssid=ssid;
this.salary=salary;
}
void display()
{
System.out.println(name+" " +id+" " +ssid+" " +salary);
}

public static void main(String[] args)
{
{
Manager m=new Manager("Shubha",40, 39,35000,"HR");
m.display();
}
{
Engineer e=new Engineer("Shruti",36,45,500000.00,"Senior Engg");
e.display1();
}
}
}


class Manager extends Employee
{
 String dept;
public Manager(String name, int id, int ssid, double salary, String dept)
{
super(name,id,ssid,salary);
this.dept=dept;
}
void display()
{
System.out.println(name+" " +id+" " +ssid+" " +salary+" " +dept);
}
}

class Engineer extends Employee
{
 String designation;
Engineer(String name,int id,int ssid,double salary, String designation)
{
super(name,id,ssid,salary);
this.designation=designation;
}
void display1()
{
System.out.println(name+" " +id+" " +ssid+" " +salary+" " +designation);
}
}
