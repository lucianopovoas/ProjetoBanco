
public abstract class Conta implements AcoesConta{
	private int operacoes;
	private boolean checar;

	public int getOperacoes() {
		return operacoes;
	}

	public void setOperacoes(int operacoes) {
		this.operacoes = operacoes;
	}

	public boolean isChecar() {
		return checar;
	}

	public void setChecar(boolean checar) {
		this.checar = checar;
	}
	
}
