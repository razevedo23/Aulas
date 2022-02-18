
public class Livro {
    String titulo;
    String nomeDoLeitor;
    int qPaginas;
    int paginasLidas;

    Livro (String titulo,String nomeDoLeitor, int qPaginas, int paginasLidas){
        this.titulo = titulo;
        this.nomeDoLeitor = nomeDoLeitor;
        this.qPaginas = qPaginas;
        this.paginasLidas = paginasLidas;
    }
    Livro() {}

    int leitura(int paginasLidas){
        this.qPaginas = paginasLidas * 100 / qPaginas;
        return qPaginas;
    }
}

