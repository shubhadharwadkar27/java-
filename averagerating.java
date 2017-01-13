package pack1;

import java.util.*;
class averagerating
{
	private static Scanner sc;
public static void main(String[] args)

{
    int i;
int rating[]=new int[2];
String name[]=new String[2];
double total=0;
double averagerating=0;

for(i=0;i<=1;i++)
{
	 sc=new Scanner(System.in);
System.out.println("Enter the name of the customer");
name[i]=sc.nextLine();
System.out.println("enter the rating of mobile");
rating[i]=sc.nextInt();
//System.out.println(name[i]);
//System.out.println(rating[i]);
}
for(i=0;i<rating.length;i++)
{
total+=rating[i];


}
System.out.println(total);
averagerating=total/rating.length;

System.out.println("average is" +averagerating);

}
}
