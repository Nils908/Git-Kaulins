package kaulins;

import java.util.Random;
import java.util.Scanner;

public class Main {
	static void mestKaulinu(int reizes) {
		int skaitlis;
		Random rand = new Random();
		
		int min = 6;
		int max = 0;
		
		for (int i = 0; i < reizes; i++) {
			skaitlis = rand.nextInt(6) + 1;
			System.out.printf("Uzkrita skaitlis: %d\n", skaitlis);
			if (skaitlis < min)
				min = skaitlis;
			if (skaitlis > max)
				max = skaitlis;
		}
		
		System.out.printf("Mazākais skaitlis no visiem metieniem: %d\nLielākais skaitlis no visiem metiniem: %d\n", min, max);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cik reizes mest kauliņu?");
		int reizes = sc.nextInt();
		mestKaulinu(reizes);

		sc.close();
	}
}
