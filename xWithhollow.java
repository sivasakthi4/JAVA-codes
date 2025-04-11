package practice_java;

import java.util.Scanner;

public class xWithhollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    n=n*2-1;
	    for(int i=1;i<=n;i++)
	    {
	      for(int j=1;j<=n;j++)
	      {
	      if((j==i)||(j==n-i+1)||(i==1)||(i==n)||(j==1)||(j==n))
	      {
	        System.out.print("*");
	      }
	      else
	         {
	           System.out.print(" ");
	         }
	      }
	      
	        System.out.println();
	}}


}
