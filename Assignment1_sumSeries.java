//Write a program to sum a series of numbers with Java recursion

import java.util.*;


class Assignment1_sumSeries{
	
	 static int sumSeries(int n){
		if(n<=1)
			return n;
		else
		{
				return n+sumSeries(n-1);
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		
		System.out.println(sumSeries(n));
		
		
	}
}