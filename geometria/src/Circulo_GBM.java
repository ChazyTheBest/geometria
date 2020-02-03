
public class Circulo_GBM extends FiguraGeometrica_GBM
{
    private double radio;
    // Constante pi
    static final double PI = 3.1416;

    public Circulo_GBM(double r, String tipoFigura)
    {
        super(tipoFigura);
        radio = r < 0 ? r * (-1) : r;
    }

    @Override
    public double area()
    {
        return radio * radio * PI;
    }

    @Override
    public double perimetro()
    {
        return radio * 2 * PI;
    }

}
