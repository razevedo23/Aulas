/*6) Leia a idade de 20 pessoas e exiba a soma das idades.*/

import java.util.Scanner;

public class Ex6 {
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
        System.out.println("idade é: "+ i1);

    }
}
