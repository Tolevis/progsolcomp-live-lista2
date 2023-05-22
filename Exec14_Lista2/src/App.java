//* Nome do Aluno: Eduardo Tolotti dos Santos
//* RA: 1292317694
//* Nome do Programa: Vetores Zero
//* Data: 16/05
public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[50];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }

        System.out.println("Vetor preenchido com zeros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}