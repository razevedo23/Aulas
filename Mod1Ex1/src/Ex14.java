//14) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100, quantos estão entre 101 e 200 e quantos são maiores de 200.

import java.util.Random;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //int rand = random.nextInt(10);
        int num = 0, num2 = 0, num3 = 0;

        for (int i = 0; i < 20; i++) {
            int rand = random.nextInt(500);
            System.out.println(rand);
            //int n = scanner.nextInt();

            if (rand <= 100) {
                num = num + 1;
            }
            if (rand >= 100 && rand <= 200) {
                num2 = num2 + 1;
            }
            if (rand > 200) {
                num3 = num3 + 1;
            }
        }
        System.out.println("Entre 0 e 100: " + num);
        System.out.println("Entre 101 e 200: " + num2);
        System.out.println("maior que 200: " + num3);
    }
}
