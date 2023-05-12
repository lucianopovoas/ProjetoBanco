
public class Ligacao {
	PessoaFisica pf;
	PessoaJuridica pj;
	ContaCorrente cc;
	ContaPoupanca cp;
	
	public void criarContaCorrente(PessoaFisica pf, ContaCorrente cc) {
		System.out.println("------------------------------");
		System.out.println("ContaCorrente Criada com Sucesso");
		System.out.println(cc.toString());
		System.out.println(pf.toString());
		System.out.println("------------------------------");
		cc.setChecar(true);
	}
	public void criarContaCorrente(PessoaJuridica pj, ContaCorrente cc) {
		System.out.println("------------------------------");
		System.out.println("ContaCorrente Criada com Sucesso");
		System.out.println(cc.toString());
		System.out.println(pj.toString());
		System.out.println("------------------------------");
		cc.setChecar(true);
	}
	
	public void criarContaPoupanca(PessoaFisica pf, ContaPoupanca cp) {
		System.out.println("------------------------------");
		System.out.println("ContaPoupança Criada com Sucesso");
		System.out.println(cp.toString());
		System.out.println(pf.toString());
		System.out.println("------------------------------");
		cp.setChecar(true);
	}
	public void criarContaPoupanca(PessoaJuridica pj, ContaPoupanca cp) {
		System.out.println("------------------------------");
		System.out.println("ContaPoupança Criada com Sucesso");
		System.out.println(cp.toString());
		System.out.println(pj.toString());
		System.out.println("------------------------------");
		cp.setChecar(true);
	}

	public void desativarContaCorrente(PessoaFisica pf, ContaCorrente cc) {
		if(cc.isChecar() == true) {
			if(cc.getGasto() == 0) {
				System.out.println("Conta Desativada com Sucesso");
				cc.setChecar(false);
			}else {
				System.out.println("Primeiro Pague sua Fatura para Desativar sua conta");
			}
		}else {
			System.out.println("Você não tem uma conta ou já desativou ela");
		}
	}
	public void desativarContaCorrente(PessoaJuridica pj, ContaCorrente cc) {
		if(cc.isChecar() == true) {
			if(cc.getGasto() == 0) {
				System.out.println("Conta Desativada com Sucesso");
				cc.setChecar(false);
			}else {
				System.out.println("Primeiro Pague sua Fatura para Desativar sua conta");
			}
		}else {
			System.out.println("Você não tem uma conta ou já desativou ela");
		}
	}
	
	public void desativarContaPoupanca(PessoaFisica pf, ContaPoupanca cp) {
		if(cp.isChecar() == true) {
			if(cp.getSaldo() == 0) {
				System.out.println("Conta Desativada com Sucesso");
				cp.setChecar(false);
			}else {
				System.out.println("Primeiro gaste ou saque o dinheiro da sua conta para Desativar sua conta");
			}
		}else {
			System.out.println("Você não tem uma conta ou já desativou ela");
		}
	}
	public void desativarContaPoupanca(PessoaJuridica pf, ContaPoupanca cp) {
		if(cp.isChecar() == true) {
			if(cp.getSaldo() == 0) {
				System.out.println("Conta Desativada com Sucesso");
				cp.setChecar(false);
			}else {
				System.out.println("Primeiro gaste ou saque o dinheiro da sua conta para Desativar sua conta");
			}
		}else {
			System.out.println("Você não tem uma conta ou já desativou ela");
		}
	}
}
