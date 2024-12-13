package conta.model;

public class ContaCorrente extends Conta {

	// Atributos / Variaveis
	private float limite;

	// Método Especial - Método Construtor
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo); // invocando o método construtor da Conta
		this.limite = limite;

	}

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = 5000.0f;
	}

	// Método de Acesso
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(float valor) {

		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo insuficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	// Polimorfismo da Sobreescrita -> add mais lógica a um método já existente
	public void visualizar() {
		super.visualizar(); // Método de Classe Conta
		System.out.println("Limite de Crédito: " + this.limite);
	}

}
