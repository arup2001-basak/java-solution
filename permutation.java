// Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there
//Permutation combination


import java.util.*;


public class sumDi {
  public static void main(String[] args) {
  // Write your code here
  int amount = 0;
  for(int i = 1; i <= 4; i++) {
	  for(int j = 1; j<= 4; j++) {
		  for(int k = 1; k <= 4; k++) {
			  if(k != i && k != j && j != i) {
				  amount ++;
				  System.out.println(i+ "" +j+ "" +k);
			  }
		  }
	  }
  }
  
  System.out.println("Total number of three number digit is : " +amount);
 }
}
