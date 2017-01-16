
package pack1;
import java.util.Scanner;
public class matrix {
	private static Scanner s;
	public static void main(String[] args)
	{
		int m,n,p,q,a,b,c;
		int sum=0;
		 s=new Scanner(System.in);
		System.out.print("Enter number of rows and columns of first matrix: ");
		m=s.nextInt();
		n=s.nextInt();
		int first[][]=new int[m][n];
		System.out.print("Enter elements of first matrix");
		for(a=0;a<m;a++)
		{
			for(b=0;b<n;b++)
			{
				first[a][b]=s.nextInt();
	
			}
		}
		System.out.print("Enter number of rows and columns of second matrix: ");
		p=s.nextInt();
		q=s.nextInt();
		if(n!=q)
		{
			System.out.println("Multiplication cannot be performed");
		}
		else
		{
			int second[][]=new int[p][q];
			int multiply[][]=new int[m][q];
			
			System.out.print("Enter elements of second matrix");
			for(a=0;a<p;a++)
			{
				for(b=0;b<q;b++)
				{
					second[a][b]=s.nextInt();
				}
			}
			System.out.println("Multiplying matrices");
			for(a=0;a<m;a++)
			{
				for(b=0;b<q;b++)
				{
					for(c=0;c<p;c++)
					{
						sum=sum+first[a][c]*second[c][b];
					}
					multiply[a][b]=sum;
					sum=0;
				}
			}
			System.out.println("Multiplication performed");
			System.out.print("Result is \n");
			for(a=0;a<m;a++)
			{
				for(b=0;b<q;b++)
				{
					System.out.print(multiply[a][b]+ "\t");
				}
				System.out.print("\n");
			}
		}
		
		
		
	}
	}


