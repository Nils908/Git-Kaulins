package kaulins;

import java.util.Random;
import java.util.Scanner;

public class kaulins {
    static void mestKaulinu(int reizes){
        int skaitlis, min = 6, max = 1;
        Random rand = new Random();
        for(int i = 1; i <= reizes; i++) {
            skaitlis = rand.nextInt(6) + 1;
            System.out.println("Uzmests skaitlis " + skaitlis);
            if(skaitlis < min){
                min = skaitlis;
            }
            if(skaitlis > max){
                max = skaitlis;
            }
        }
        System.out.println("Mazakais bija: " + min);
        System.out.println("Lielakais bija: " + max);
    }

    public static void main(String[] args) {
        int reizes;
        Scanner scan = new Scanner(System.in);
        System.out.print("Cik reizes metisi: ");
        reizes = scan.nextInt();
        mestKaulinu(reizes);
        scan.close();
    }
}
