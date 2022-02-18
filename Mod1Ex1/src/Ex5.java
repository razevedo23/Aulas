import java.util.Scanner;

/*5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
números.*/
public class Ex5 {
    public static void main(String [] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Digite um número: ");
        float N1 = SC.nextFloat();
        System.out.println("Digite um número: ");
        float N2 = SC.nextFloat();
        System.out.println("Digite um número: ");
        float N3 = SC.nextFloat();
        System.out.println("Digite um número: ");
        float N4 = SC.nextFloat();
        System.out.println("Digite um número: ");
        float N5 = SC.nextFloat();
        System.out.println("Digite um número: ");
        float N6 = SC.nextFloat();
        System.out.println("Digite um número: ");
        float N7 = SC.nextFloat();
        System.out.println("Digite um número: ");
        float N8 = SC.nextFloat();
        System.out.println("Digite um número: ");
        float N9 = SC.nextFloat();
        System.out.println("Digite um número: ");
        float N10 = SC.nextFloat();
        float result;
        result = N1 + N2 + N3 + N4 + N5 + N6 + N7 + N8 + N9 + N10;
        System.out.println("Soma dos números digitados: "+ result);
    }
}
