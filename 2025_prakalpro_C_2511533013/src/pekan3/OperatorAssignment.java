package pekan3;

import java.util.Scanner;
public class OperatorAssignment {
	
	public static void main(String[] args) {
		int A1;
		int A2;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input angka-1: ");
		A1 = keyboard.nextInt();//10
		System.out.print("Input angka-2: ");
		A2 = keyboard.nextInt();//5
		keyboard.close();
		System.out.println("Assignment penambahan");
		A1 += A2; //hasil 15
		System.out.println("Penambahan : " + A1);
		System.out.println("Assignment pengurangan");
		A1 -= A2; //hasil 10
		System.out.println("Pengurangan : " + A1);
		System.out.println("Assignment perkalian");
		A1 *= A2; //hasil 50
		System.out.println("Perkalian : " + A1);
		System.out.println("Assignment hasil bagi");
		A1 /= A2; //hasil 10
		System.out.println("Pembagian : " + A1);
		System.out.println("Assignment sisa bagi");
		A1 %= A2; //hasil 0
		System.out.println("Sisa Bagi : " + A1);
	}

}
