
public class Gerente extends Funcionario {

	private String senha;
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public boolean autentica(String senha) {
		if(senha == this.senha) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public double getBonificacao() {
		return 5000;
	}
}
