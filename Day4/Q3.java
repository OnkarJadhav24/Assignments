//Q3 calculates the sum of multiples of 3 in a sequence of numbers

import java.util.Scanner;

class Sumofmultiples{
	
	public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a Number (n):");
	
	int n  = sc.nextInt();

	int sum = 0;
	
	for (int i=0; i<=n; i++){
		int t = 2*(i - 1);
		
		if (t % 3 == 0){
			sum += t;
		}
	}
	
	System.out.println("Sum of multiples of 3: " + sum);
	}
}