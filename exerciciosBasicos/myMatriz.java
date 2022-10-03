public class myMatriz {

    public static void main(String[] args) {

        int[][] matriz = new int[2][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int number = 6;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == number) {
                    System.out.println("The number " + number + " is in the position: " + i + " " + j);
                    return;
                } else if (matriz[i][j] == number + 1) {
                    System.out.println("The number up " + (number + 1));
                } else if (matriz[i][j] == number - 1) {
                    System.out.println("The number left " + (number - 1));
                } else if (matriz[i][j] == number + 3) {
                    System.out.println("The number right " + (number + 3));
                } else if (matriz[i][j] == number - 3) {
                    System.out.println("The number up " + (number - 3));

                }
                if (i == matriz.length - 1 && j == matriz[i].length - 1) {
                    System.out.println("Numero não encontrado");
                }

            }
        }


}
}
