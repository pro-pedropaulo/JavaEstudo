public class forParOuImpar {

    public static void main(String[] args) throws Exception {

        for(int i = 0; i < 100; i++){
            if (i % 2 == 0) {
                System.out.println("o numero " + i + " é par");
            } else {
                System.out.println("o numero " + i + " é impar");
            }
        }
    }
}