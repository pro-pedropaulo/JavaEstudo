package negocios;

public class retangulo {
    public int a;
    public int b;

    public double area() {
        return a * b;
    }

    public double perimetro() {
        return 2 * (a + b);
    }

    public double diagonal() {
        return Math.sqrt(a * a + b * b);
    }

   
    public String toString() {
        return " Area = "
            + String.format("%.2f%n", area())
            + " Perimetro = "
            + String.format("%.2f%n", perimetro())
            + " Diagonal = "
            + String.format("%.2f%n", diagonal());
    }

}