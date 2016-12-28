class volume
{
int r,h;
double pi;
void initialize()
{
r=5;
h=7;
pi=3.14;
}
void display()
{
double volume=(pi*r*r*h);
System.out.println("The volume of cylinder is"+volume);
}
public static void main(String[] args)
{
volume v=new volume();
v.initialize();
v.display();
}
}
