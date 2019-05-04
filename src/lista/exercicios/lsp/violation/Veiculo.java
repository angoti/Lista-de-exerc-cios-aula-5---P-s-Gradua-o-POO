package lista.exercicios.lsp.violation;

public class Veiculo {

	private boolean movendo;
    private Marcha marcha;

    public Marcha getMarcha() {
        return marcha;
    }

    public void mudaMarcha(Marcha marcha) {
        this.marcha = marcha;
    }
    public void mover(){
    	movendo = true;
    }
    
    public void parar(){
    	movendo = false;
    }

	public boolean isMovendo() {
		return movendo;
	}
    

}
