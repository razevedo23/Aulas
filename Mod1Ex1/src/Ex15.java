import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int n = 0;
        int n1 = 0;
        int cont = 0;

        //System.out.println("Digite um número: ");
        //n1 = scanner.nextInt();
        //if (n1 < 0) ;
        //{
        //    System.out.println("Digite apenas números positivos");
        //}
        //if (n1 >= 0.0) {
            do {
                System.out.println("Digite um número: ");
                n = scanner.nextInt();
                if (n >= 0) ;
                {
                    num = num + n;
                    cont++;
                }
            }
            while (n >= 0) ;
        System.out.println("Soma: " + num);
        System.out.println("Quantidade de números digitados: " + cont);
    }
}
