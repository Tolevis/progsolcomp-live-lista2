import java.util.Scanner;
//* Nome do Aluno: Eduardo Tolotti dos Santos
//* RA: 1292317694
//* Nome do Programa: Calculo vendas
//* Data: 16/05
public class App {
    public static void main(String[] args) throws Exception {
         Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da venda: R$ ");
        double valorVenda = teclado.nextDouble();

        System.out.println("\nMenu - Condições de Pagamento");
        System.out.println("1. Venda à vista - Desconto de 10%");
        System.out.println("2. Venda a prazo 30 dias - Desconto de 5%");
        System.out.println("3. Venda a prazo 60 dias - Mesmo preço");
        System.out.println("4. Venda a prazo 90 dias - Acréscimo de 5%");
        System.out.println("5. Venda com cartão de débito - Desconto de 8%");
        System.out.println("6. Venda com cartão de crédito - Desconto de 7%");

        System.out.print("\nEscolha a opção de pagamento (1-6): ");
        int opcaoPagamento = teclado.nextInt();

        double descontoOuAcrescimo = 0.0;

        if (opcaoPagamento == 1) {
            descontoOuAcrescimo = 0.10;
        } else if (opcaoPagamento == 2) {
            descontoOuAcrescimo = 0.05;
        } else if (opcaoPagamento == 4) {
            descontoOuAcrescimo = 0.05;
        } else if (opcaoPagamento == 5) {
            descontoOuAcrescimo = 0.08;
        } else if (opcaoPagamento == 6) {
            descontoOuAcrescimo = 0.07;
        }

        double totalVenda = valorVenda;

        if (opcaoPagamento == 1 || opcaoPagamento == 2 || opcaoPagamento == 5 || opcaoPagamento == 6) {
            totalVenda -= valorVenda * descontoOuAcrescimo;
        } else if (opcaoPagamento == 4) {
            totalVenda += valorVenda * descontoOuAcrescimo;
        }

        System.out.println("\nTotal da venda: R$ " + totalVenda);
        teclado.close();
    }
}