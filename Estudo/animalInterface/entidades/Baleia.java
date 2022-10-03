package animalInterface.entidades;

public class Baleia implements InterfaceAnimais {
    private int peso;

    @Override
    public void tamanho(int peso) {
        if (peso > 1000) {
            System.out.println("A baleia é grande");
        } else {
            System.out.println("A baleia é pequena");
        }
    }

    @Override
    public void cor() {
        System.out.println("A baleia é azul");
    }

    @Override
    public void som() {
        System.out.println("A baleia faz barulho");
    }

    @Override
    public void nome() {
        System.out.println("A baleia se chama Moby Dick");
    }
}

