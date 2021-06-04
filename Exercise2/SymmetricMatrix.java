/*Read a matrix from the console and check whether it is symmetric or not.*/
import java .util.Scanner ;
class SymmetricMatrix{
	public static void main(String[] args) {
		int a[][]=new int[50][50];
		int m,n,i,j,flag=0;
		Scanner in=new Scanner(System.in);
		System.out.println(" enter the rows of matrix");
		m=in.nextInt();
		System.out.println(" enter the columns of matrix");
		n=in.nextInt();
		if(m==n){
		
			System.out.println("enter the matrix");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					a[i][j]=in.nextInt();
				}
			}
			System.out.println("transpose of the matrix is");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(a[j][i] + " ");
				}
			System.out.println();
			}
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
			        if(a[i][j]==a[j][i])
		        {
			        flag=1;
					
		        }      
		        else
		        {
			        flag=0;
					break;
		        }
				}
			}
			if(flag==0)
				System.out.println("not a symmetric matrix");
			else
				System.out.println("symmetric matrix");
			
			
			
		}
		else{
		
		System.out.println("not a square matrix"); }
		
	
			
	}
}




/*
 enter the rows of matrix
3
 enter the columns of matrix
3
enter the matrix
1
1
1
1
1
1
1
1
1
transpose of the matrix is
1 1 1
1 1 1
1 1 1
symmetric matrix

------------------------------------------

 enter the rows of matrix
3
 enter the columns of matrix
3
enter the matrix
1
2
3
4
5
6
7
8
9
transpose of the matrix is
1 4 7
2 5 8
3 6 9
not a symmetric matrix

------------------------------------------

 enter the rows of matrix
3
 enter the columns of matrix
2
not a square matrix
*/
