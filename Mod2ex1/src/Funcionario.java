
    public class Funcionario {
        String nome;
        String sobrenome;
        String cidade;
        String estado;
        int horasTrabalhadas;
        int valorPorHora;

        Funcionario (String nome,String sobrenome,String cidade,String estado, int horasTrabalhadas, int valorPorHora){
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.cidade = cidade;
            this.estado = estado;
            this.horasTrabalhadas = horasTrabalhadas;
            this.valorPorHora = valorPorHora;
        }

        Funcionario() {}

        boolean adicionar(int horas){
            this.horasTrabalhadas += horas;
            return true;
        }
        boolean valorhora(int valor){
            this.valorPorHora = valor;
            return true;
        }
}
