import java.util.Scanner;
/* 3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.*/
public class Ex3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String Nome = Scanner.next();
        System.out.printf("Seu nome é: "+ "\n"+ Nome +"\n"+ Nome + "\n"+ Nome + "\n"+ Nome + "\n"+ Nome + "\n"+ Nome + "\n"+ Nome + "\n"+ Nome + "\n"+ Nome + "\n"+ Nome  );
    }
}