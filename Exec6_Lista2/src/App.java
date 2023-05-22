import java.util.Scanner;

public class App {
//* Nome do Aluno: Eduardo Tolotti dos Santos
//* RA: 1292317694
//* Nome do Programa: Conceito do Aluno.
//* Data: 15/05
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a nota de 0 a 100: ");
        int nota = teclado.nextInt();

        if (nota >= 0 && nota < 49){
            System.out.println("Insuficiente");
        }
        else if (nota >= 50 && nota <= 64){
            System.out.println("Regular");
        }
        else if (nota >= 65 && nota <= 84){
            System.out.println("Bom");
        }
        else if (nota >= 85 && nota <= 100){
            System.out.println("Otimo");
        }
      
        teclado.close();
    }
}
