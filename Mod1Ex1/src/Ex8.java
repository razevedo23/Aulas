import java.util.Scanner;

/* 8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade. */
public class Ex8 {
    public static void main(String [] args) {
        Scanner SC = new Scanner(System.in);
        int i = 1;
        int i1 = 0;
        int i2 = 1;
        int cont = 0;
        do {
            System.out.println("Digite a sua idade: " + i + "ª pessoa");
            int x = SC.nextInt();
            i1 = x + i1;
            i++;
            if (x > 17) {
                cont = i2+cont;
            }
        }
        while(i < 21);
            System.out.println(cont+" pessoas são maiores de idade");
        i++;
        //while (i < 21);
        //if (i1 > 18) {
        //    System.out.println("Soma é: " + i1);
        //}
    }
}