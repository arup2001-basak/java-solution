//Print all the elements in the Fibonacci number series.


import java.util.*;

public class sumDi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : ");
		int n = sc.nextInt();
		
		int n1 = 0 , n2 = 1 , sum , i;
		
		for(i = 0; i<=n; i++) {
			if(i<=1) {
				sum = i;
			}
			
			else {
				sum = n1 + n2;
				n1 = n2;
				n2 = sum;
			}
			
			System.out.println(sum);
		}
		
	}
}
