//* Nome do Aluno: Eduardo Tolotti dos Santos
//* RA: 1292317694
//* Nome do Programa: numeros multiplos negativos de 7
//* Data: 17/05
public class App {
    public static void main(String[] args) throws Exception {
        int numero = -1000;

        do {
            if (numero % 7 == 0 && numero < 0) {
                System.out.println(numero);
            }
            numero--;
        } while (numero > -1000);
    }
}