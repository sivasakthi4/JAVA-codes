package practice_java;

import java.util.Scanner;

public class BASICpattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int i,j;
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
