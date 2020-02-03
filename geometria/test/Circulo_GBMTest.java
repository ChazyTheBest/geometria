import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Circulo_GBMTest
{
    private double r, area, perimetro;
    private String tipoFigura;

    public Circulo_GBMTest (double r, String tipoFigura, double area, double perimetro)
    {
        this.r = r;
        this.tipoFigura = tipoFigura;
        this.area = area;
        this.perimetro = perimetro;
    }

    @Parameters
    public static Collection<Object[]> params()
    {
        return Arrays.asList(new Object[][] {
            {  7, "Circulo", 153.9384, 43.9824 },
            {  0, "Circulo", 0,        0 },
            { -3, "Circulo", 28.2744,  18.8496 }
        });
    }

    @Test
    public void testArea()
    {
        Circulo_GBM circulo = new Circulo_GBM(r, tipoFigura);
        //System.out.println(circulo.area());
        assertEquals(area, circulo.area(), 0);
    }

    @Test
    public void testPerimetro()
    {
        Circulo_GBM circulo = new Circulo_GBM(r, tipoFigura);
        //System.out.println(circulo.perimetro());
        assertEquals(perimetro, circulo.perimetro(), 0);
    }
}
