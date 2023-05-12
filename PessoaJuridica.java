
public class PessoaJuridica extends Pessoa{
	private int cnpj;
	
	public PessoaJuridica(String nome, String sobrenome, int idade, int cpf, String endereco, int celular, int cnpj) {
		super(nome, sobrenome, idade, cpf, endereco, celular);
		this.setCnpj(cnpj);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + this.getNome() + ", sobrenome=" + this.getSobrenome() + ", idade=" + this.getIdade() + ", cpf=" + this.getCpf() + ", endereco="
				+ this.getEndereco() + ", celular=" + this.getCelular() + ", cnpj=" + cnpj + "]";
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

}
