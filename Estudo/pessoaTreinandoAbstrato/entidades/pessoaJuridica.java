package pessoaTreinandoAbstrato.entidades;

public class pessoaJuridica extends pessoa{
    private Integer numeroFuncioonarios;

    public pessoaJuridica() {
        super();
    }

    public pessoaJuridica(String nome, double rendaAnual, int numeroFuncioonarios) {
        super(nome, rendaAnual);
        this.numeroFuncioonarios = numeroFuncioonarios;
    }

    public Integer getNumeroFuncioonarios() {
        return numeroFuncioonarios;
    }

    public void setNumeroFuncioonarios(Integer numeroFuncioonarios) {
        this.numeroFuncioonarios = numeroFuncioonarios;
    }

    @Override
    public double imposto() {
        if (numeroFuncioonarios > 10) {
            return getRendaAnual() * 0.14;
        }
        else {
            return getRendaAnual() * 0.16;
        }
    }




}
