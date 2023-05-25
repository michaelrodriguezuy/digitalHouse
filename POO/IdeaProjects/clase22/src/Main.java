import org.w3c.dom.css.CSSImportRule;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(5.0, 4.0);
        Circulo circulo1 = new Circulo(1.0);
        Circulo circulo2 = new Circulo(1.0);
        Circulo circulo3 = new Circulo(1.0);
        Triangulo triangulo = new Triangulo(40.0, 12.0);

        List<Figura> figuras = new ArrayList<>();

        figuras.add(rectangulo);
        figuras.add(circulo1);
        figuras.add(circulo2);
        figuras.add(circulo3);

        Vagon vagon = new Vagon(figuras);

        System.out.println(vagon.area());
    }
}