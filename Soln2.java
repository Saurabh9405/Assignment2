package neebalgurukul.day2;

import java.util.Scanner;

public class Soln2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc= new Scanner(System.in);
 
 { 
	 System.out.print("x: ");
	    int x = sc.nextInt();
	    System.out.print("y: ");
	    int y = sc.nextInt();
	    if (x == 0 && y == 5) {
	    	
	    	System.out.println(" Y axis ");
	    	
	    } else if(x>0 && y>0) {
	    	
         System.out.println("Quadrant I");   
     
     } else if(x<0 && y>0) {
    	 
         System.out.println("Quadrant II");
    
     } else if(x<0 && y<0) {
    	 
    	 System.out.println("Quadrant III"); 

     } else if (x > 0 && y < 0) {
    	 
         System.out.println("Quadrant IV");
     }
	}
	}
}