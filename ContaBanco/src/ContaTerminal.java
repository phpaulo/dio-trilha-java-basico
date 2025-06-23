import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
    }

    public static void Teste() {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        var numberAgence = scanner.nextInt();
        System.out.println("Por favor, digite o número da Conta:");
        var number = scanner.nextInt();
        System.out.println("Por favor, informe o nome do clinte:");
        var nameClient = scanner.next();

    }

}




