package lista.exercicios.ocp.violation;

public class ManipuladorDeEventos {

	private Veiculo veiculo;

	public ManipuladorDeEventos(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void mudarModoDirecao(ModoDirecao modoDirecao) {
		veiculo.setPotencia(modoDirecao.getPotencia());
		veiculo.setAlturaSuspencao(modoDirecao.getAlturaSuspencao());
		// para adicionar outro modo de dire��o, precisamos adicionar outro modo (exemplo ECONOMICO) duas classes ser�o alteradas ModoDirecao e ManipuladorDeEventos
	}
}
