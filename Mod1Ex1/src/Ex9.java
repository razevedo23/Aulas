/*9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.*/

import groovy.lang.GString;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int idadepessoamaisnova = 0;
        String nomepessoamaisnova = null;

        for (int i = 0; i > 3; i++) {
            System.out.println("Digite seu nome: " + i + "ª pessoa");
            String nome1 = SC.next();
            System.out.println("Digite a sua idade: " + i + "ª pessoa");
            int idade1 = SC.nextInt();
            nomepessoamaisnova = nome1;
            idadepessoamaisnova = idade1;

            if (idadepessoamaisnova == 0) {
                System.out.println(nomepessoamaisnova);
            }
            if (idadepessoamaisnova < idade1) {
                System.out.println(nomepessoamaisnova);
            }
        }
    }
}
