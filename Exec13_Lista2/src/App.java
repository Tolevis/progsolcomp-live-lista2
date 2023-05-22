//* Nome do Aluno: Eduardo Tolotti dos Santos
//* RA: 1292317694
//* Nome do Programa: Soma While
//* Data: 16/05

public class App {
    public static void main(String[] args) throws Exception {
        int numero = 1;
        int soma = 0;

        while (numero <= 100) {
            soma += numero;
            numero++;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}