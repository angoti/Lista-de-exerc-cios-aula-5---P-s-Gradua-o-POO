package lista.exercicios.ocp.violation;

public class Passeio implements ModoDirecao {
	int pot, alt;

	public int getPot() {
		return pot;
	}

	public void setPot(int pot) {
		this.pot = pot;
	}

	public int getAlt() {
		return alt;
	}

	public void setAlt(int alt) {
		this.alt = alt;
	}

	@Override
	public int getPotencia() {
		// TODO Auto-generated method stub
		return pot;
	}

	@Override
	public int getAlturaSuspencao() {
		// TODO Auto-generated method stub
		return alt;
	}

}
