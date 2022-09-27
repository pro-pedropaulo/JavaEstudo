package negocios;

public class dados {
    
	private String nome;
	private int idade;
	private double altura;
	private double salario;


    public dados(String nome, int idade, double altura, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.salario = salario;
    }
    
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}


