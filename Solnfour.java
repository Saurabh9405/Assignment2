package neebalgurukul.day2;

import java.util.Scanner;

public class Solnfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 10;
		int []evenFibonacci = new int[count];
		int a = 0, b = 1;
		for (int i = 0; i < count;) {
			if ( a % 2 == 0) {
				evenFibonacci[i] = a;
				i++;
			}
			int next = a + b;
			a = b;
			b = next;
		}
		System.out.println("First 10 Even Fibonacci Numbers : ");
		for (int num : evenFibonacci) {
			System.out.println(num);
		}	
	}

}
