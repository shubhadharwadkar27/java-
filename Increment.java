class Increment
{
int x=5;
void operator()
{
x=5;
int y=x++;
int z=y++;
y++;
x++;
System.out.println(x);
System.out.println(y);
System.out.println(z);
}
public static void main(String[] args)
{
Increment i=new Increment();
i.operator();
}
}