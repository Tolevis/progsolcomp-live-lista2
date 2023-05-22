import java.util.Scanner;
//* Nome do Aluno: Eduardo Tolotti dos Santos
//* RA: 1292317694
//* Nome do Programa: Carga maxima elevador
//* Data: 18/05
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a carga máxima do elevador em kg: ");
        int cargaMaxima = teclado.nextInt();

        System.out.print("Digite a quantidade máxima de pessoas: ");
        int pessoasMaximas = teclado.nextInt();

        int cargaAtual = 0;
        int pessoasAtuais = 0;

        do {
            System.out.print("Digite o peso da pessoa em kg: ");
            int peso = teclado.nextInt();

            if (cargaAtual + peso <= cargaMaxima && pessoasAtuais + 1 <= pessoasMaximas) {
                cargaAtual += peso;
                pessoasAtuais++;
                System.out.println("Pessoa adicionada no elevador.");
            } else {
                System.out.println("Limite de carga ou de pessoas atingido. Não é possível adicionar mais pessoas.");
                break;
            }
        } while (true);

        System.out.println("Carga atual: " + cargaAtual + " kg");
        System.out.println("Pessoas atualmente no elevador: " + pessoasAtuais);

        teclado.close();
    }
}