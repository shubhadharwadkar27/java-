package pack1;

import java.util.Scanner;

public class student {
	private static Scanner sc;
	public static void main(String[] args)
	{
		String name;
		String subject[]=new String[5];
		int marks[]=new int[5];
		double percentage=0;
		double total=0;
		 sc=new Scanner(System.in);
		System.out.println("Enter student name");
		name=sc.nextLine();
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the Subject");
			subject[i]=sc.nextLine();
			
		}
			for(int i=0;i<5;i++)
			{
			System.out.println("Enter the Marks");
			marks[i]=sc.nextInt();	
			}
		for(int i=0;i<5;i++)
		{
		total=total+marks[i];
		}
		System.out.println(total);
		percentage=((total/500)*100);
		System.out.println(percentage);
		if(percentage>=85.0d && percentage<=100.0d){  
	        System.out.println("A+ grade");  
		}
		else if(percentage>=75.0d && percentage<84.0d){  
	        System.out.println("A grade");  
	    }
		else if(percentage>=65.0d && percentage<=74.0d){  
	        System.out.println("B grade");
		}
		else if(percentage>=64.0d && percentage<=50.0d){  
	        System.out.println("C grade");
		}
		else if(percentage<50.0d){
	        System.out.println("fail");  
	    }  
	   else{  
	        System.out.println("Invalid!");  
	    }  
	}

}
