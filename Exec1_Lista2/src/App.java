import java.util.Scanner;
//* Nome do Aluno: Eduardo Tolotti dos Santos
//* RA: 1292317694
//* Nome do Programa: Ler Numero Maior
//* Data: 15/05

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o número A: ");
        int a = teclado.nextInt();
        
        System.out.print("Digite o número B: ");
        int b = teclado.nextInt();
        
        int maior = (a > b) ? a : b;
        
        System.out.println("O maior número é: " + maior);
        
        teclado.close();
    }
}