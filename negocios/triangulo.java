package negocios;

public class triangulo {
    public double a;
    public double b;
    public double c;
    

    public double areaDoTriangulo() {
        double p = (a + b + c) / 2.0;
        double calculo = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return calculo;
    }
}