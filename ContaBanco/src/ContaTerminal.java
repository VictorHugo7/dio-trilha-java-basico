package src;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

        // Coleta de dados do usuário
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite sua conta: ");
        String conta = scanner.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Exemplo de saldo fixo (poderia vir de outro lugar no futuro)
        double saldo = 1250.75;

        // Apresentação dos dados
        System.out.println("\"Olá, " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
        System.out.println("\n--- Dados da Conta Bancária ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.printf("Saldo: R$ %.2f\n", saldo);

        System.out.println("Gostaria de realizar um saque? Digite 1 se SIM ou 2 para NÃO: ");
        Integer opcaoSaque = scanner.nextInt();
        
        if(opcaoSaque == 1) {
            System.out.println("Por favor, insira o valor que gostaria de sacar: \n R$ ");
            Double valorSaque = scanner.nextDouble();
            
            if(valorSaque > saldo) {
                System.out.printf("Saldo insuficiente. \n Por favor, Solicite um valor menor ou igual que " + saldo + "\n"); 
                valorSaque = scanner.nextDouble();
                
                Double novoSaldo = saldo - valorSaque;
            	System.out.printf("Saque realizado com sucesso! Seu saldo atual é de " + novoSaldo);
            }else {
            	Double novoSaldo = saldo - valorSaque;
            	System.out.printf("Saque realizado com sucesso! Seu saldo atual é de " + novoSaldo);
            }
        	
        }
        scanner.close();
    }
}

