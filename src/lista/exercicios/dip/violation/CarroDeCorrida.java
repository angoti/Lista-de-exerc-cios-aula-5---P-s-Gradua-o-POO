package lista.exercicios.dip.violation;

public class CarroDeCorrida implements Veiculo {

	private final int capacidadeTanqueCombustivel;
	private int quantidadeCombustivel;
	private int potencia;

	public CarroDeCorrida(final int combustivel) {
		this.capacidadeTanqueCombustivel = combustivel;
		this.quantidadeCombustivel = combustivel;
	}

	/* (non-Javadoc)
	 * @see lista.dip.Veiculo#acelerar()
	 */
	@Override
	public void acelerar() {
		potencia++;
		quantidadeCombustivel--;
	}

}