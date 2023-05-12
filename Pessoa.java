
public abstract class Pessoa {
	private String nome;
	private String sobrenome;
	private int idade;
	private int cpf;
	private String endereco;
	private int celular;
	
	public Pessoa(String nome,String sobrenome,int idade,int cpf,String endereco,int celular) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setIdade(idade);
		this.setCpf(cpf);
		this.setEndereco(sobrenome);
		this.setCelular(celular);
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + ", cpf=" + cpf + ", endereco="
				+ endereco + ", celular=" + celular + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	
	
}
