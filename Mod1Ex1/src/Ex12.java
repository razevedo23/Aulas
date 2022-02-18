//12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
pares

import java.util.Random;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //int rand = random.nextInt(10);
        int nun = 0;
        for (int i = 0; i < 20; i++) {
            int rand = random.nextInt(10);
        System.out.println(rand);
        //int n = scanner.nextInt();

            if (rand % 2 == 0) {
                nun = nun +1;
            }
        }      System.out.println("Resultatdo: " + nun);
    }
}