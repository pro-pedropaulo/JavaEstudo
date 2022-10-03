package pessoaTreinandoAbstrato.entidades;

public class pessoaFisica extends pessoa{
    private double gastosSaude;

    public pessoaFisica() {
    }
    public pessoaFisica(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto() {
        if (getRendaAnual() < 20000.00) {
            return getRendaAnual() * 0.15 - gastosSaude * 0.5;
        }
        else {
            return getRendaAnual() * 0.25 - gastosSaude * 0.5;
        }
    }
}
