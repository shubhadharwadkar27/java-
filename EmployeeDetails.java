import java.util.Scanner;
class EmployeeDetails
{
static Scanner s;
String id;
String name;
public void accept()
{
s=new Scanner(System.in);
System.out.println("Enter the name and id");
id=s.next();
name=s.next();
}
public void display()
{
System.out.println("Name of the employee is" +name);
System.out.println("ID of the employee is" +id);
}
public static void main(String[] args)
{
System.out.println("-----------Menu---------");
System.out.println("1.Enter data");
System.out.println("2.Display data");
System.out.println("3.Exit");
System.out.println("Choose the option");
EmployeeDetails e=new EmployeeDetails();

int choice=0;
Scanner s=new Scanner(System.in);
choice =s.nextInt();

switch(choice)
{
case 1:
    e.accept();
    break;
    

case 2:
    e.display();
    break;
    

case 3:

break;

default :
break;
}
}
}
