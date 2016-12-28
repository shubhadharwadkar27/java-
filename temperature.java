class temperatue
{
double c;
void initialize()
{
c=25;
}
void display()
{
temperature=(c*(9/5)+32);
System.out.println("The converted temperature to Fareheit is"+temperature);
}
public static void main()
{
temperature t=new temperature();
t.initialize();
t.display();
}
}
