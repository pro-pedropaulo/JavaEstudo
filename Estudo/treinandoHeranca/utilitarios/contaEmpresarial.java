package treinandoHeranca.utilitarios;

public class contaEmpresarial extends Conta{
    private Double limiteEmprestimo;

    public contaEmpresarial() {
        super();
    }

    public contaEmpresarial(Integer numero, String nome, Double valor, Double limiteEmprestimo) {
        super(numero, nome, valor);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    public void emprestimo(double value) {
        if (value <= limiteEmprestimo) {
            valoremConta += value;
        } else {
            System.out.println("Valor de emprestimo maior que o limite");
        }
    }
    @Override
    public void saque(double valor) {
       super.saque(valor);
        valoremConta -= 100.0;
    }
}
