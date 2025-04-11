package practice_java;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int res=0;
		while(n>0)
		{
			int d= n%10;
			res= res*10+d;
			n= n/10;
			
		}
		if(m==res) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
	
}
