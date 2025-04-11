package practice_java;

import java.util.Scanner;

public class seperateDIGITS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
	
		
		while(n>0) {
			int d=n%10;	
		    n=n/10;
		
			System.out.print(d+" ");
		}
		
	}

}
