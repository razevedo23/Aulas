import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Vamos acompanhar sua leitura\nInforme o titulo do livro:");
        String titulo1 = scanner.nextLine();

        Livro Livrotitulo;
        Livrotitulo = new Livro();
        Livrotitulo.titulo = titulo1;
        System.out.println("Informe seu nome:");
        String nomeDoLeitor1 = scanner.nextLine();
        Livrotitulo.nomeDoLeitor = nomeDoLeitor1;
        System.out.println("Informe a quantidade de páginas do livro:");
        int qPaginas1 = scanner.nextInt();
        Livrotitulo.qPaginas = qPaginas1;
        System.out.println("Informe a quantidade de páginas lidas do livro:");
        int paginasLidas1 = scanner.nextInt();
        Livrotitulo.paginasLidas = paginasLidas1;

        System.out.println("Você leu "+Livrotitulo.leitura(paginasLidas1)+"% do livro");


    }
}

