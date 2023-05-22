import java.util.Scanner;

public class App {
//* Nome do Aluno: Eduardo Tolotti dos Santos
//* RA: 1292317694
//* Nome do Programa: Visualizar dados.
//* Data: 15/05
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o seu Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite o seu Sobrenome: ");
        String sobrenome = teclado.nextLine();

        System.out.print("digite a sua idade: ");
        int idade = teclado.nextInt();

        teclado.nextLine();

        System.out.print("Digite a cidade em que nasceu: ");
        String cidade = teclado.nextLine();

        //“Deseja visualizar dados completos?”. Se o caractere digitado pelo usuário for ‘S’ o programa deve imprimir na tela Nome, Sobrenome, idade e naturalidade. 

        System.out.print("Deseja visualizar todos os dados? (S/N): ");
        char dados = teclado.nextLine().toUpperCase().charAt(0);

        if (dados == 'S') {
            System.out.println("Nome Completo: " + nome + " " + sobrenome);
            System.out.println("Idade:" + idade);
            System.out.println("Naturalidade: " + cidade);
        }
        else if (dados == 'N') {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
        else {
            System.out.println("Digitação errada. Tente novamente");
        }
        teclado.close();
    }
}
        
