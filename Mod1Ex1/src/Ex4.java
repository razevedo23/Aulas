import java.util.Scanner;

/* 4) Leia o nome um número do usuário um número N e escreva o nome dele na tela N*/
public class Ex4 {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = SC.next();
        System.out.println("Digite um número: ");
        float n = SC.nextFloat();
        int ni = 1;
        while (ni <= n){
            System.out.printf("Seu nome é: " + nome +"\n");
        ni++;
        }
    }
}
