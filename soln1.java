package neebalgurukul.day2;

import java.util.Scanner;

public class soln1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Angle: ");
 double angle = sc.nextDouble();
 double x = Math.toRadians(angle);
 int m = -1;
 long b = 1;		 
 double a = 1, sum = 1;
 for (int i = 1; i <= 20; ++i) {
	 a = a * x;
	 b = b * i;
	 if (i % 2 == 0) {
		 sum += a/b * m;
		 m = -m;
	 }
   }
  System.out.printf("cos(%.1f\u00B0) = %.1f\n", angle, sum);
  }
}