package lista.exercicios.lsp.violation;

public class Carro extends Veiculo {
    
    @Override
    public void mudaMarcha(Marcha marcha) {
        Marcha marchaAtual = getMarcha();
        if (movendoParaFrente(marcha, marchaAtual) || movendoPraTraz(marcha, marchaAtual)) {
            parar();
        }
        super.mudaMarcha(marcha);
    }

    private boolean movendoPraTraz(Marcha marcha, Marcha marchaAtual) {
        return isMovendo() && Marcha.R.equals(marchaAtual) && Marcha.D.equals(marcha);
    }

    private boolean movendoParaFrente(Marcha marcha, Marcha marchaAtual) {
        return isMovendo() && Marcha.D.equals(marchaAtual) && Marcha.R.equals(marcha);
    }
}




