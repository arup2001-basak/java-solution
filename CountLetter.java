package Placement;

import java.util.*;

class Digit{
  public static void countString(String c) {
	  char[] x =  c.toCharArray();
	  int letter = 0;
	  int number = 0;
	  int space = 0;
	  int other = 0;
	  
	  for(int i = 0; i<x.length; i++) {
		  if(Character.isLetter(x[i])) {
			  letter ++;
		  }
		  
		  else if(Character.isDigit(x[i])) {
			  number ++;
		  }
		  
		  else if(Character.isSpaceChar(x[i])) {
			  space ++;
		  }
		  
		  else {
			  other ++;
		  }
		  
	  }
	  
	  System.out.println("Now number of Letter is : " +letter+ " , Number of Digit is : " +number+ " , Number of space is : " +space+ " , Other is : " +other);
  }
}

public class sumDi {
  public static void main(String[] args) {
  // Write your code here
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the input : ");
  String s = sc.nextLine();
  
  
  Digit obj = new  Digit();
   obj.countString(s);
 }
}
