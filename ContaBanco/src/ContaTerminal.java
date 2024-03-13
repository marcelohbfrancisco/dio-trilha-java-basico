import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // classe Scanner, necessaria para que o Usurio possa fornecer o input de dados.

        int numero;
        String agencia;
        String nome_Cliente;
        Double saldo;

        System.out.println("Por favor, digite o número da conta");
        numero = scanner.nextInt();
        scanner.nextLine(); // linha necessaria para o funcionamento correto e comportamento desejado do código.

        System.out.println("Por favor, digite o numero da agencia:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        nome_Cliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nome_Cliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta " + numero+ " e seu saldo  " + saldo +" já está disponível para saque");
    }
}
