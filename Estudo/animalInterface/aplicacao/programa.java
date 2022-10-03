package animalInterface.aplicacao;

import animalInterface.entidades.Baleia;
import animalInterface.entidades.Cachorro;
import animalInterface.entidades.Gato;

public class programa {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Baleia baleia = new Baleia();
        cachorro.tamanho(12);
        cachorro.cor();
        cachorro.som();
        cachorro.nome();
        gato.tamanho(4);
        gato.cor();
        gato.som();
        gato.nome();
        baleia.tamanho(1900);
        baleia.cor();
        baleia.som();
        baleia.nome();
    }
}

