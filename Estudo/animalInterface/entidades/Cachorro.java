package animalInterface.entidades;

public class Cachorro implements InterfaceAnimais {

        @Override
        public void tamanho(int peso) {
            if (peso > 10) {
                System.out.println("O cachorro é grande");
            } else {
                System.out.println("O cachorro é pequeno");
            }
        }

        @Override
        public void cor() {
            System.out.println("O cachorro é preto");
        }

        @Override
        public void som() {
            System.out.println("O cachorro faz au au");
        }

        @Override
        public void nome() {
            System.out.println("O cachorro se chama Rex");
        }
}
