package pack1;

import java.util.Scanner;

public class customer {
	private static Scanner s;
	public static void main(String[] args)
	{
		double salary=1000;
		String name;
		int price;
		int quantity;
		double total;
		double expense=0;
		s=new Scanner(System.in);
		System.out.println("Enter customer name");
		name=s.nextLine();
		
		System.out.println("Enter the price");
		price=s.nextInt();
		System.out.println("Enter the quantity");
		quantity=s.nextInt();
		
			total=price*quantity;
			expense=(double)((total/salary)*100);
			System.out.println("Percentage Expense " +expense);
	}
}
		
			


