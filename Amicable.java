package practice_java;

import java.util.Scanner;

public class Amicable {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int count1=0;
		int count2=0;
		for(int i=1 ;i<a1;i=i+1)
	     {
		  if(a1%i==0)
		  {
			 count1 =count1+i;}
		  }
	    for(int i=1 ;i<a2;i=i+1)
	     {
		  if(a2%i==0)
		  {
			 count2 =count2+i;}
		  }
	    if((count1==a2)&&(count2==a1))
	    {
	    	System.out.println("its Amicable pair");
	    }
	    else
	    {
	    	System.out.println("not amicable");
	    }
	}

}
