package negocios;

public class nota {
    public double a;
    public double b;
    public double c;
    public double d;

    
    public double mediaFinal() {
        double media = (a + b + c + d) / 4;
        return media;
    }
}