import java.util.Scanner;
//* Nome do Aluno: Eduardo Tolotti dos Santos
//* RA: 1292317694
//* Nome do Programa: tabuada
//* Data: 19/05
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = teclado.nextInt();

        if (numero <= 0) {
            System.out.println("Número inválido. Digite um número positivo.");
        } else {
            for (int i = 1; i <= numero; i++) {
                System.out.println("Tabuada do " + i + ":");
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
                System.out.println();
            }
        }

        teclado.close();
    }
}