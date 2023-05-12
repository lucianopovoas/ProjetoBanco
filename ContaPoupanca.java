public class ContaPoupanca extends Conta{
	private int saldo;
	
	public ContaPoupanca() {
		this.setSaldo(0);
		this.setOperacoes(0);
	}
	
	@Override
	public String toString() {
		return "ContaPoupança [Saldo=" + this.getSaldo() + ", Operações realizadas=" + this.getOperacoes() + "]";
	}
	
	public void sacar(int valor) {
	if(this.isChecar() == true) {
		if(valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			this.setOperacoes(this.getOperacoes() + 1);
			System.out.println("Saque Realizado com sucesso, saldo: R$" + this.getSaldo());
		}else if(valor == 0) {
			System.out.println("Digite um valor válido, acima de 0");
		}else {
			System.out.println("Saldo insuficiente");
		}
	}else {
		System.out.println("Primeiro Crie ou Reative sua Conta");
	}
	}

	public void depositar(int valor) {
	if(this.isChecar() == true) {
		if(valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
			this.setOperacoes(this.getOperacoes() + 1);
			System.out.println("Deposito realizado com sucesso, Saldo: R$" + this.getSaldo());
		}else {
			System.out.println("Deposite um valor válido, acima de 0");
		}
	}else {
		System.out.println("Primeiro Crie ou Reative sua Conta");
	}
	}

	@Override
	public void UsarCartao(int r) {
	if(this.isChecar() == true) {
		if(r <= this.getSaldo()) {
			System.out.println("Compra Aprovada R$" + r);
			this.setSaldo(this.getSaldo() - r);
			this.setOperacoes(this.getOperacoes() + 1);
		}else if(this.getSaldo() == 0) {
			System.out.println("Você não tem Saldo, Zerou seu saldo");
		}else {
			System.out.println("Você não tem Saldo suficiente");
		}
	}else {
		System.out.println("Primeiro Crie ou Reative sua Conta");
	}
	}
	
	@Override
	public void extrato() {
	if(this.isChecar() == true) {
		System.out.println("Operações Realizadas: " + this.getOperacoes() + " Seu saldo é de: R$" + this.getSaldo());
	}else {
		System.out.println("Primeiro Crie ou Reative sua Conta");
	}
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}
