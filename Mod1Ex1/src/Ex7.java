/*7) Leia a idade de 20 pessoas e exiba a média das idades.*/

import java.util.Scanner;

public class Ex7 {
    public static void main(String [] args){
        Scanner SC = new Scanner(System.in);
        int i = 1;
        int i1 = 0;
        do {
            System.out.println("Digite a sua idade: "+ i+"ª pessoa");
            int x = SC.nextInt();
            i1 = x+i1;
            i++;
        }
        while (i < 21);
        System.out.println("Soma é: "+ i1);
        System.out.println("Média é: "+ i1/20);
    }
}