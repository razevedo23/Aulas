import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float salario;

        Funcionario FuncionarioJoao;
        FuncionarioJoao = new Funcionario();
        FuncionarioJoao.nome = "João";
        FuncionarioJoao.sobrenome = "Silva";
        FuncionarioJoao.cidade = "POA";
        FuncionarioJoao.estado = "RS";
        FuncionarioJoao.horasTrabalhadas = 40;
        FuncionarioJoao.valorPorHora = 15;
        salario = FuncionarioJoao.valorPorHora * FuncionarioJoao.horasTrabalhadas * 4;

        boolean sair = true;
        do {

           System.out.println("**** Menu *****\n" +
                   "Selecione a opção desejada abaixo:\n" +
                   "0 - Consultar informações\n" +
                   "1 - Incrementar quantidade de horas trabalhadas\n" +
                   "2 - Substituir o valor por hora do funcionário\n" +
                   "3 - Calcular o salário do funcionário no final do mês");
           int menu = scanner.nextInt();
                if (menu == 1) {
                System.out.println("Adicionar horas não contabilizadas: ");
                int horas = scanner.nextInt();
                //FuncionarioJoao.horasTrabalhadas += horas ;
                FuncionarioJoao.adicionar(horas);
                System.out.println("Total de horas trabalhadas: " + FuncionarioJoao.horasTrabalhadas);
            //break;
            }
                if (menu == 2) {
                System.out.println("Novo valor por hora: ");
                int valor = scanner.nextInt();
                FuncionarioJoao.valorhora(valor);
                System.out.println("Novo valor por hora: " + FuncionarioJoao.valorPorHora);
            //break;
            }
                if (menu == 3) {
                salario = FuncionarioJoao.valorPorHora * FuncionarioJoao.horasTrabalhadas * 4;
                System.out.println("Salário do mês: " + salario);
            //break;
            }
            if (menu == 0) {
                sair = false;
            }
        }
        while (sair);

        System.out.println("Nome: "+ FuncionarioJoao.nome+" "+FuncionarioJoao.sobrenome+
                "\nCidade: "+FuncionarioJoao.cidade+
                "\nEstado: "+FuncionarioJoao.estado+
                "\nHoras trabalhadas "+FuncionarioJoao.horasTrabalhadas+
                "\nValor por hora: "+FuncionarioJoao.valorPorHora+
                "\nSalário: "+salario);
    }
}

