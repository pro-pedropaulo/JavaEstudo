package negocios;

public class impostoSalario {
    public String nome;
    public double salarioBruto;
    public double imposto;
    public double porcentagem;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

   public double salarioAumento() {
       return salarioLiquido() + (salarioLiquido() * porcentagem / 100);
   }
   public String toString() {
       return "com o aumento de " + porcentagem + "%, o funcionario " + nome + " recebeu R$ " + salarioAumento();
   }
}