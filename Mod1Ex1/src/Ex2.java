import java.util.Scanner;
/* 2) Escreva um algoritmo que calcule a soma dos números de 1 a 15. */
public class Ex2 {
public static void main(String[] args){
    Scanner Scanner = new Scanner(System.in);
    int x = 1;
    int x1 = 0;
    do {
        x1 = x + x1;
        System.out.println("Count is: " + x1);
        x++;
    } while (x <= 15);
}
}

