import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Todo: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
        //Exibir as mensagens para o nosso usuario
        System.out.println("Por favor, digite o número da Agência ! ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite a Agência ");
        String agencia = sc.nextLine();
        System.out.println("Nome do cliente");
        String nome_Cliente = sc.nextLine();
        System.out.println("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome_Cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque");

        sc.close();
    }
}
