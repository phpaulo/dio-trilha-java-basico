import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        var paramOne = scanner.nextInt();
        System.out.println("Informe o segundo número:");
        var paramTwo = scanner.nextInt();

        try {
            //chamando o métodoo contendo a lógica de contagem
            count(paramOne, paramTwo);

        } catch (ParametrosInvalidosException ex) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } finally {
            System.out.println("***FIM***");
        }
    }

    public static void count(int paramOne, int paramTwo) throws ParametrosInvalidosException {
        //validar se paramOne é MAIOR que paramTwo e lançar a exceção
        validation(paramOne, paramTwo);
        var result = paramTwo - paramOne;
        //realizar o for para imprimir os números com base na variável result
        for (int i = 1; i <= result; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }

    public static void validation(int paramOne, int paramTwo) {
        if (paramOne > paramTwo) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }

}
