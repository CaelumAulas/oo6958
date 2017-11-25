public class Funcionario {

	private String nome;
	protected double salario;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario
	 *            the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonificacao() {
		// return getSalario() * 0.1;
		return this.salario * 0.10;
	}
}
