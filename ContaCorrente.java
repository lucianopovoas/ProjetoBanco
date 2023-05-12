public class ContaCorrente extends Conta{
	private int limite;
	private float gasto;
	
	public ContaCorrente() {
		this.setLimite(500);
		this.setOperacoes(0);
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [Limite=" + limite + ", Gasto=" + gasto + " Operações Realizadas: " + this.getOperacoes() + "]";
	}

	public void pagarFatura(int r) {
	if(this.isChecar() == true) {
		if(r <= this.getGasto()) {
			if(r == this.getGasto()) {
				System.out.println("Fatura Total Paga com sucesso");
				this.setLimite(r);
				this.setGasto(0);
				System.out.println("Seu limite renovado novamente para: R$" + this.getLimite());
			}else {
				System.out.println("Parte da Fatura Paga com sucesso, Limite disponivel: R$" + r);
				this.setLimite(r);
				this.setGasto(this.getGasto() - r);
			}
		}else {
			System.out.println("Não é possivel Pagar Valor mais alto que a fatura");
		}
	}else {
		System.out.println("Primeiro Crie ou Reative sua conta");
	}
	}
	
	public void UsarCartao(int r) {
	if(this.isChecar() == true) {
		if(r <= this.getLimite()) {
			System.out.println("Compra Aprovada R$" + r);
			this.setLimite(this.getLimite() - r);
			this.setGasto(this.getGasto() + r);
			this.setOperacoes(this.getOperacoes() + 1);
		}else if(this.getLimite() == 0){
			System.out.println("Transação não Autorizada Você zerou seu limite");
		}else {
			System.out.println("Transação não Autorizada Seu limite está abaixo desse valor");
		}
	}else {
		System.out.println("Primeiro Crie ou Reative sua conta");
	}
	}

	@Override
	public void extrato() {
		if(this.isChecar() == true) {
		System.out.println("Operações Realizadas: " + this.getOperacoes() + " Limite do seu cartao disponivel é: R$" + this.getLimite());
	}else {
		System.out.println("Primeiro Crie ou Reative sua conta");
	}
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public float getGasto() {
		return gasto;
	}

	public void setGasto(float gasto) {
		this.gasto = gasto;
	}
	
}
