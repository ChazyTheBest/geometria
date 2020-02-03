/**
 * @author Gabriel Blanca Montes
 * @version 1.2
 *
 */
public class Rectangulo_GBM extends FiguraGeometrica_GBM
{
    private double l1;
    private double l2;

    /**
     * El contructor de la clase.
     *
     * @param tipoFigura Tipo de figura.
     * @param lG Lado grande.
     * @param lP Lado peque;o.
     */
    public Rectangulo_GBM(String tipoFigura, double lG, double lP)
    {
        super(tipoFigura);
        l1 = lG;
        l2 = lP;
    }

    /**
     * Calcula el area de un objeto geométrico
     *
     * @return el area de la figura
     */
    @Override public double area()
    {
        return l1 * l2;
    }

    /**
     * Calcula el perimetro de un objeto geométrico
     *
     * @return el perimetro de la figura
     */
    @Override public double perimetro()
    {
        return (2 * l1) + (2 * l2);
    }

}
