package lista.exercicios.ocp.violation;

public class ManipuladorDeEventos {

	private Veiculo veiculo;

	public ManipuladorDeEventos(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void mudarModoDirecao(ModoDirecao modoDirecao) {
		veiculo.setPotencia(modoDirecao.getPotencia());
		veiculo.setAlturaSuspencao(modoDirecao.getAlturaSuspencao());
		// para adicionar outro modo de direção, precisamos adicionar outro modo (exemplo ECONOMICO) duas classes serão alteradas ModoDirecao e ManipuladorDeEventos
	}
}
