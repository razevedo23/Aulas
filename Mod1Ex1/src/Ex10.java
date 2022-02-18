import java.util.Scanner;

public class Ex10 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int mult = 1;
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        for(int i=1; i<11; i++){
        mult = i * n;
        System.out.println("Resultatdo: "+mult);
        }

    }
}