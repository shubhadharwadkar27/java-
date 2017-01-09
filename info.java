public class info
{
String name;
int ID;
int age;
String Qual;
info(String name,int ID, int age, String Qual){
this.name=name;
this.ID=ID;
this.age=age;
this.Qual=Qual;
}



public void display()
{
System.out.println(name);
System.out.println(ID);
System.out.println(age);
System.out.println(Qual);
}
public static void main(String[] args)
{
info i=new info("Shubha",40,23,"BE");

i.display();
}
}

