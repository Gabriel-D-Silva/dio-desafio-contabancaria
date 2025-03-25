package Main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO: Conhecer e importar a classe Scanner
		// Exibir as mensagens para o usuario
		// Obter pelo scanner os valores digitados no terminal
		// Exibir a mensagem "conta criada"
		
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria usuario = new ContaBancaria();
		usuario.numero = 0;
		
		System.out.println("Olá, vamos criar uma conta bancaria");
		
		System.out.println("Por favor, digite o número da Agência!");
		usuario.agencia = sc.nextLine();
		System.out.println("Por favor, digite seu nome completo!");
		usuario.nome = sc.nextLine();
		System.out.println("Por favor, digite seu deposito inicial para abrir a conta!");
		usuario.saldo = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Olá "+usuario.nome.split(" ")[0]+", obrigado por criar uma conta em nosso banco, sua agência é "+usuario.agencia+", conta "+usuario.numero+" e seu saldo de R$ "+usuario.saldo+" já está disponível para saque");
		
	}

}
