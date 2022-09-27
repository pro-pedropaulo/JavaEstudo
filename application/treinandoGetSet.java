package application;
import negocios.dados;

public class treinandoGetSet {

    public static void main(String[] args) throws Exception {

        dados PrimeiraPessoa = new dados("Joao", 20, 1.80, 1000.00);
        dados SegundaPessoa = new dados("Maria", 25, 1.60, 2000.00);

        System.out.println("Nome: " + PrimeiraPessoa.getNome());
        System.out.println("Idade: " + PrimeiraPessoa.getIdade());
        System.out.println("Altura: " + PrimeiraPessoa.getAltura());
        System.out.println("Salario: " + PrimeiraPessoa.getSalario());
        System.out.println("Segunda Pessoa");
        System.out.println("Nome: " + SegundaPessoa.getNome());
        System.out.println("Idade: " + SegundaPessoa.getIdade());
        System.out.println("Altura: " + SegundaPessoa.getAltura());
        System.out.println("Salario: " + SegundaPessoa.getSalario());

        // alterar idade da primeira pessoa
        PrimeiraPessoa.setIdade(21);
        System.out.println("Nova idade da primeira pessoa: " + PrimeiraPessoa.getIdade());
    }
    
}