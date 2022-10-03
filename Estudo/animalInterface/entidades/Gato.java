package animalInterface.entidades;

public class Gato implements InterfaceAnimais {

    @Override
    public void tamanho(int peso) {
        if (peso > 5) {
            System.out.println("O gato é grande");
        } else {
            System.out.println("O gato é pequeno");
        }
    }

    @Override
    public void cor() {
        System.out.println("O gato é Branco");
    }

    @Override
    public void som() {
        System.out.println("O gato mia");
    }

    @Override
    public void nome() {
        System.out.println("O gato se chama Garfield");
    }
}

