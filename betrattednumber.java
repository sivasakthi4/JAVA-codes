package practice_java;

import java.util.Scanner;

public class betrattednumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	    if((count1-1==a2)&&(count2-1==a1))
	    {
	    	System.out.println("its Betratted");
	    }
	    else
	    {
	    	System.out.println("not Betratted");
	    }
	}

}
