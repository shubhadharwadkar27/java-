class pattern
{
public void display()
{
int i,j,k;
k=0;
{
for(i=1; i<5; i++)
{
for(j=0; j<i; j++)
{
System.out.print(" " + (++k));
}
System.out.print("\n");
}
}
}
public static void main(String[] args)
{
pattern p=new pattern();
p.display();
}
}



