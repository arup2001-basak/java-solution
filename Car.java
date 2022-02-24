//An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

//1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
//2nd data, Total number of wheels = W
 

//The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.


import java.util.*;


public class Car {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numver of vaicle : ");
		int v = sc.nextInt();
		System.out.println("Enter the number of wheel : ");
		int w = sc.nextInt();
		
		if(w>= 2 && w%2 == 0 && v<w) {
			int tw = ((v * 4)-w)/2;
			int fw = v - tw ;
			System.out.println("Two wheeler is : " + tw + " and four wheeler is : " +fw);
			
		}
		
		else {
			System.out.println("Invalid ! ");
		}
	}

}
