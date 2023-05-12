
public class testar {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente();
		ContaPoupanca cp1 = new ContaPoupanca();
		
		PessoaFisica pf1 = new PessoaFisica("Julia","Machado",22,847956,"Rua a",1234);
		PessoaJuridica pj1 = new PessoaJuridica("Pedro","Oliveira",37,855364,"Rua b",1234,900);
		
		Ligacao l[] = new Ligacao[2];
		l[0] = new Ligacao();
		l[1] = new Ligacao();
		
		cc1.extrato();
		cp1.depositar(100);
		
		System.out.println();
		
		System.out.println("=============Conta Corrente Testando=============");
		l[0].criarContaCorrente(pj1, cc1);
		cc1.extrato();
		cp1.extrato();
		
		System.out.println();
		
		cc1.UsarCartao(240);
		cc1.UsarCartao(260);
		cc1.UsarCartao(100);
		cc1.extrato();
		
		System.out.println();
		
		cc1.pagarFatura(700);
		cc1.pagarFatura(200);
		
		System.out.println();
		
		cc1.UsarCartao(130);
		cc1.UsarCartao(70);
		cc1.extrato();
		
		System.out.println();
		
		l[0].desativarContaCorrente(pj1, cc1);
		cc1.pagarFatura(500);
		l[0].desativarContaCorrente(pj1, cc1);
		
		System.out.println();
		
		System.out.println("=============Conta Poupança Testando=============");
		l[1].criarContaPoupanca(pf1, cp1);
		
		cp1.sacar(100);
		cp1.depositar(800);
		cp1.sacar(100);
		
		System.out.println();
		
		cp1.UsarCartao(500);
		cp1.extrato();
		
		System.out.println();
		
		cp1.UsarCartao(300);
		cp1.sacar(200);
		cp1.extrato();
		
		System.out.println();
		
		cp1.depositar(100);
		l[1].desativarContaPoupanca(pf1, cp1);
		cp1.sacar(100);
		l[1].desativarContaPoupanca(pf1, cp1);
	}

}
