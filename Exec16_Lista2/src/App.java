import java.util.Scanner;
//* Nome do Aluno: Eduardo Tolotti dos Santos
//* RA: 1292317694
//* Nome do Programa: digite numeros até maior q 0
//* Data: 17/05
public class App {
    public static void main(String[] args) throws Exception {
            Scanner teclado = new Scanner(System.in);
            int numero;
    
            System.out.println("Digite um número (digite um número menor que 0 para encerrar):");
            numero = teclado.nextInt();
    
            while (numero >= 0) {
                System.out.println("Número digitado: " + numero);
                System.out.println("Digite um número (digite um número menor que 0 para encerrar):");
                numero = teclado.nextInt();
            }
    
            System.out.println("Programa encerrado.");
            teclado.close();
        }
    }