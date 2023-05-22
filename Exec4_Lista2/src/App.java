import java.util.Scanner;

//* Nome do Aluno: Eduardo Tolotti dos Santos
//* RA: 1292317694
//* Nome do Programa: Par ou Impar , Negativo ou Positivo ou 0;
//* Data: 15/05

public class App {
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        teclado.close();
    }
}