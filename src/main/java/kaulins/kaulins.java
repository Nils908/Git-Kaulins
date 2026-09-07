package kaulins;

import java.util.Random;
import java.util.Scanner;

public class kaulins {
    public static void main(String[] args) {
        int skaitlis, reizes;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Cik reizes metisi: ");
        reizes = scan.nextInt();
        for(int i = 1; i <= reizes; i++) {
            skaitlis = rand.nextInt(6)+1;
            System.out.println("Uzmestais skaitlis"+skaitlis);
        }
        scan.close();
    }
}
