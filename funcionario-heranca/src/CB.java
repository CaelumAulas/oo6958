
public class CB {

	private double total;
	
	public void adiciona(Funcionario f) {
		total = total + f.getBonificacao();
	}
	
	public double getTotal() {
		return this.total;
	}
}
