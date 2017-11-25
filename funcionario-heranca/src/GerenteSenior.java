
public class GerenteSenior extends Gerente {

	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 15000;
	}
}
