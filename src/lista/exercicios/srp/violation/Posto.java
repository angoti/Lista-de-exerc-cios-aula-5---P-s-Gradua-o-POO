package lista.exercicios.srp.violation;

public class Posto {
	public void reabastecimento(Veiculo veiculo) {
		veiculo.setQuantidadeCombustivel(veiculo.getCapacidadeTanqueCombustivel());
	}
}
