import java.util.Scanner;
//* Nome do Aluno: Eduardo Tolotti dos Santos
//* RA: 1292317694
//* Nome do Programa: Estaçoes
//* Data: 16/05
public class App { 
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 12: ");
        int numeroMes = teclado.nextInt();

        String[] nomesMeses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        String[] estacoes = {
            "Verão", "Verão", "Outono", "Outono", "Outono", "Inverno",
            "Inverno", "Inverno", "Primavera", "Primavera", "Primavera", "Verão"
        };

        if (numeroMes >= 1 && numeroMes <= 12) {
            String nomeMes = nomesMeses[numeroMes - 1];
            String estacao = estacoes[numeroMes - 1];

            System.out.println("Mês: " + nomeMes);
            System.out.println("Estação: " + estacao);
        } else {
            System.out.println("Mês inválido");
            System.out.println("Estação inválida");
        }
        teclado.close();
    }
}