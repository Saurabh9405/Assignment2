package neebalgurukul.day2;

import java.util.Scanner;

public class Soln5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Enter the base number: ");
   double b = sc.nextDouble();

   System.out.print("Enter the exponent (power): ");
   double e = sc.nextDouble();

   double r = Math.pow(b, e);

   System.out.println(b + "^" + e + " = " + r);

}

}
