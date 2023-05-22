import java.util.Scanner;

public class App {

//* Nome do Aluno: Eduardo Tolotti dos Santos
//* RA: 1292317694
//* Nome do Programa: Multiplos
//* Data: 15/05

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero A: ");
        int a = teclado.nextInt();

        System.out.print("Digite o numero B: ");
        int b = teclado.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao são multiplos");
        }
        teclado.close();
    }
}