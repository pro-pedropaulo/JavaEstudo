package herancaFuncionarios.entidades;

public class tercerizado extends funcionario{
    private Double Adicional;


    public tercerizado() {
        super();
    }

    public tercerizado(String nome, Integer horas, Double valorPorHora, Double Adicional) {
        super(nome, horas, valorPorHora);
        this.Adicional = Adicional;
    }

    public Double getAdicional() {
        return Adicional;
    }

    public void setAdicional(Double Adicional) {
        this.Adicional = Adicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + (Adicional * 1.1);
    }
}
