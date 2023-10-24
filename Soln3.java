package neebalgurukul.day2;

import java.util.Scanner;

public class Soln3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter lower bound:");
		int lowerbound = sc.nextInt();
		System.out.println("Enter upper bound:");
		int upperbound = sc.nextInt();
		int first = 0;
		int second = 1;
		int next;
		
		System.out.println("The fibonacci numbers between ");
		while (first <= upperbound) {
			if (first >= lowerbound) {
				System.out.println(first);
			}
				next = first + second;
				first = second;
				second = next;

			}
		}
	}

