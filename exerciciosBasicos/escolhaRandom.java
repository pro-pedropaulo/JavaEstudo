public class escolhaRandom {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 10; i++) {
            int sorteio = (int) (Math.random() * 23) + 1;
            if (sorteio == 23) {
                System.out.println("Parabéns voce tirou o numero do papai Lebron James");
            }
            System.out.println(sorteio);
        }
    }
    
}