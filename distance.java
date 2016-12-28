class distance
{
int u,a,t;
void initialize()
{
u=10;
a=5;
t=1;
}
void display()
{
float distance=(u*t+(0.5*a*t*t));
System.out.println("The distance is "+distance);
}
public static void main(String[] args)
{
distance d=new distance();
d.initialize();
d.dispaly();
}
}