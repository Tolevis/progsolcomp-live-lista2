import java.util.Scanner;

//* Nome do Aluno: Eduardo Tolotti dos Santos
//* RA: 1292317694
//* Nome do Programa: Ordem Crescente
//* Data: 15/05

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int a = teclado.nextInt();

        System.out.print("Digite o segundo numero: ");
        int b = teclado.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int c = teclado.nextInt();

        System.out.println("Numeros em ordem crescente: ");

        if (a <= b && a <= c) {
            System.out.print("Ordem crescente: ");
            System.out.print(a + ", ");

            if (b <= c) {
                System.out.print(b + ", ");
                System.out.print(c);
            } else {
                System.out.print(c + ", ");
                System.out.print(b);
            }
        } else if (b <= a && b <= c) {
            System.out.print("Ordem crescente: ");
            System.out.print(b + ", ");

            if (a <= c) {
                System.out.print(a + ", ");
                System.out.print(c);
            } else {
                System.out.print(c + ", ");
                System.out.print(a);
            }
        } else {
            System.out.print("Ordem crescente: ");
            System.out.print(c + ", ");

            if (a <= b) {
                System.out.print(a + ", ");
                System.out.print(b);
            } else {
                System.out.print(b + ", ");
                System.out.print(a);
            }
            
            teclado.close();
        }
    }
}