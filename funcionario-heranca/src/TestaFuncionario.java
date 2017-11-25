
public class TestaFuncionario {

	public static void main(String[] args) {
	
		Funcionario joao = new Funcionario();
		joao.setNome("Joao");
		joao.setSalario(1000);
		
		Gerente jose = new Gerente();
		jose.setNome("Jose");
		jose.setSalario(15000);
		
		Secretario flavio = new Secretario();
		flavio.setNome("Flavio");
		flavio.setSalario(20000);
		
		CB cb = new CB();
		cb.adiciona(joao);
		cb.adiciona(jose);
		cb.adiciona(flavio);
		
		System.out.println("Total de bonificações: " + cb.getTotal());
	}
}
