import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num_conta;
		String agencia;
		String cliente;
		double saldo;
		
		System.out.println("Ola, seja bem vindo ao banco DIO");
		System.out.println("Qual o seu nome?");
		cliente = sc.nextLine();
		System.out.println("Qual a sua agencia?");
		agencia = sc.nextLine();
		System.out.println("Qual o numero da sua conta?");
		num_conta = sc.nextInt();
		System.out.println("Qual o seu saldo?");
		saldo = sc.nextDouble();
		
		System.out.println("Ola "+cliente+", obrigado por criar uma conta em nosso banco, sua agencia é a "+agencia+
				", conta "+num_conta+" e seu saldo "+saldo+" ja esta disponivel para saque.");
		sc.close();
	}

}
