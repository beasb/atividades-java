package conta;

import java.util.Scanner;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente(1, 123, 1, "Adriana", 10000.0f, 20000.0f);
	/*	c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar(); */
		
		// Instanciamento da Classe Conta Corrente
		ContaCorrente cc2 = new ContaCorrente(1, 34, 1, "Francisco", 500.0f, 1000.0f);
		cc2.visualizar();
		
		//Instaciamento da Classe Conta Corrente com Limite Fixo
		ContaCorrente cc3 = new ContaCorrente(3, 12345, 1, "João", 1000.0f);
		cc3.visualizar();
		
		ContaPoupanca cp4 = new ContaPoupanca(3, 123, 2, "Victor", 100000.0f, 15);
		cp4.visualizar();
		cp4.sacar(1000.0f);
		cp4.visualizar();
		cp4.depositar(5000.0f);
		cp4.visualizar(); 
		
		System.out.println();
		
//		System.out.println("Titular: " + c1.getTitular());
//		System.out.println("Saldo: " + c1.getSaldo());
		
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND 
				+            "****************************************************");
			System.out.println("**            Banco do Brasil com Z               **");
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("              1 - Criar Conta                       ");
			System.out.println("              2 - Listar todas as Contas            ");
			System.out.println("              3 - Buscar Conta por Numero           ");
			System.out.println("              4 - Atualizar Dados da Conta          ");
			System.out.println("              5 - Apagar Conta                      ");
			System.out.println("              6 - Sacar                             ");
			System.out.println("              7 - Depositar                         ");
			System.out.println("              8 - Tranferir valores entre Contas    ");
			System.out.println("              9 - Sair                              ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("**           Entre com a opção desejada:          **");
			System.out.println("                                                    " + Cores.TEXT_RESET);
			opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu futuro começa aqui! ");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta \n\n");
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas \n\n");
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por números\n\n");
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar os Dados da Conta\n\n");
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Tranferência entre Contas\n\n");
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				break;
			}

		}

		}
	

	public static void sobre() {
		
		System.out.println("\n***********************************************");
		System.out.println("Projeto desenvolvido por: Beatriz B");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/beasb");
		System.out.println("***********************************************");

		}

}
