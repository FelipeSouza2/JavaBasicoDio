import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia, cliente;
        double saldo;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, insira o número da conta:");
        numeroConta = leitor.nextInt();

        System.out.println("Por favor, insira o número da agencia:");
        agencia = leitor.next();

        System.out.println("Por favor, insira o nome da pessoa:");
        cliente = leitor.next();
        
        System.out.println("Por favor, insira o saldo da conta:");
        saldo = leitor.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$%s já está disponível para saque.", cliente,
        agencia, numeroConta,saldo);
    }
}
