package pack1;
import java.util.Scanner;

public class matrixadd {
	private static Scanner s;
	public static void main(String[] args)
			{
		int m,n,a,b;
		
		
		
		 s=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of first matrix ");
				m=s.nextInt();
				n=s.nextInt();
				int first[][]=new int[m][n];
				int second[][]=new int[m][n];
				int sum[][]=new int[m][n];
				System.out.println("Enter the elements of first matrix");
				for(a=0;a<m;a++)
				{
					for(b=0;b<n;b++)
					{
						first[a][b]=s.nextInt();
					}
				}
				System.out.println("Enter the number of rows and columns of second matrix ");
				m=s.nextInt();
				n=s.nextInt();
				System.out.println("Enter the elements of second matrix");
				for(a=0;a<m;a++)
				{
					for(b=0;b<n;b++)
					{
						second[a][b]=s.nextInt();
					}
				}
				
				for(a=0;a<m;a++)
				{
					for(b=0;b<n;b++)
					{
						sum[a][b]=first[a][b]+second[a][b];
					}
				}
				System.out.println("Sum of matrices");
				for(a=0;a<m;a++)
				{
					for(b=0;b<n;b++)
					{
						System.out.print(sum[a][b]+ "\t");
					}
						System.out.println("\n");
					}
			}

}




