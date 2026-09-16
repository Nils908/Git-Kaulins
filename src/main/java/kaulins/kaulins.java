package kaulins;

import java.util.Random;
import java.util.Scanner;

public class kaulins {
    static int mestKaulinu(int reizes){
        int skaitlis, min = 6;
        Random rand = new Random();
        for(int i = 1; i <= reizes; i++) {
            skaitlis = rand.nextInt(6) + 1;
            System.out.println("Uzmests skaitlis " + skaitlis);
            if(skaitlis < min){
                min = skaitlis;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int reizes;
        Scanner scan = new Scanner(System.in);
        System.out.print("Cik reizes metisi: ");
        reizes = scan.nextInt();
        System.out.print("Mazkais mestais skaitlis:  " + mestKaulinu(reizes));
        scan.close();
    }
}
