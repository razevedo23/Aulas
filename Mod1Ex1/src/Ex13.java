//13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100.

import java.util.Random;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //int rand = random.nextInt(10);
        int nun = 0;
        for (int i = 0; i < 20; i++) {
            int rand = random.nextInt(200);
        System.out.println(rand);
        //int n = scanner.nextInt();

            if (rand<=100) {
                nun = nun +1;
            }
        }      System.out.println("Resultatdo: " + nun);
    }
}