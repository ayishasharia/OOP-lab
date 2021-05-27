/*Read 2 matrices from the console and perform matrix addition.*/
import java .util.Scanner ;
class MatrixAddition{
	public static void main(String[] args) {
		int a[][]=new int[50][50];
		int b[][]=new int[50][50];
		int c[][]=new int[50][50];
		int m1,m2,n1,n2,i,j;
		Scanner in=new Scanner(System.in);
		System.out.println(" enter the rows of matrix1");
		m1=in.nextInt();
		System.out.println(" enter the columns of matrix1");
		n1=in.nextInt();
		System.out.println(" enter the rows of matrix2");
		m2=in.nextInt();
		System.out.println(" enter the columns of matrix2");
		n2=in.nextInt();
		if(m1==m2 && n1==n2){
		System.out.println("Enter the  matrix1");
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n1;j++)
			{
				a[i][j]=in.nextInt();
				
			}
		}	
		
		System.out.println("Enter the  matrix2");
		for(i=0;i<m2;i++)
		{
			for(j=0;j<n2;j++)
			{
				b[i][j]=in.nextInt();
				
			}
		}
		
		System.out.println("the resultant matrix is");
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n1;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j] + " ");
				
			}
		System.out.println();	
		} }
		else
		{
			System.out.println("enter the matrices as same order");
		}
		
		
		
	}
}	



/*
 enter the rows of matrix1
2
 enter the columns of matrix1
2
 enter the rows of matrix2
3
 enter the columns of matrix2
3
enter the matrices as same order
--------------------------------------------------
 enter the rows of matrix1
3
 enter the columns of matrix1
3
 enter the rows of matrix2
3
 enter the columns of matrix2
3
Enter the  matrix1
1
2
3
4
5
6
7
8
9
Enter the  matrix2
1
2
3
4
5
6
7
8
9
the resultant matrix is
2 4 6
8 10 12
14 16 18
*/