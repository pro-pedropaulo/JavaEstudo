package treinandoAbstrato.entidades;

import treinandoAbstrato.enumeracao.CorEnum;

public abstract class forma {
    private CorEnum cor;

    public forma(CorEnum cor) {
        this.cor = cor;
    }
    public forma(){
    }

    public CorEnum getCor() {
        return cor;
    }

    public void setCor(CorEnum cor) {
        this.cor = cor;
    }
    public abstract double area();

}
