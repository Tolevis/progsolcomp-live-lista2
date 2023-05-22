import java.util.Scanner;
//* Nome do Aluno: Eduardo Tolotti dos Santos
//* RA: 1292317694
//* Nome do Programa: Diaria
//* Data: 15/05
public class App {
    public static void main(String[] args) throws Exception {
    Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de diárias: ");
        int numeroDiarias = teclado.nextInt();

        double valorDiaria = 60.00;
        double taxaServico;

        if (numeroDiarias > 15) {
            taxaServico = 5.50;
        } else if (numeroDiarias == 15) {
            taxaServico = 6.00;
        } else {
            taxaServico = 8.00;
        }

        double total = (valorDiaria + taxaServico) * numeroDiarias;

        System.out.println("O total da hospedagem é: R$ " + total);

        teclado.close();
    }
}