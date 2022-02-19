import java.util.*;


public class sumDi {
  public static void main(String[] args) {
  // Write your code here
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the input : ");
  char[] ch = sc.nextLine().toCharArray();
  
  for(int i = ch.length - 1; i >= 0; i--) {
	  System.out.print(ch[i]);
  }
  
  System.out.println("\n");
  
 }
}
