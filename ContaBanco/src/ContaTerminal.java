import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        OpenAccount();
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
    }

    public static void OpenAccount() {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor, digite a Agência do cliente:");
        var agence = scanner.next();
        System.out.println("Por favor, digite o número da Conta do cliente:");
        var number = scanner.nextInt();
        System.out.println("Por favor, digite o nome do clinte:");
        var nameClient = scanner.next();
        System.out.println("Por favor, digite qual é o saldo atual do cliente:");
        var balance = scanner.nextDouble();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s " +
                " já está disponível para saque. ",nameClient, agence, number, balance);

    }

}




