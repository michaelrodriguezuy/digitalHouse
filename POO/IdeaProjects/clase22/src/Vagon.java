import java.util.List;

public class Vagon implements Figura{

    private List<Figura> figuras;

    public Vagon(List<Figura> figuras) {
        this.figuras = figuras;
    }

    @Override
    public Double area() {
        Double resultado=0.0;

        for (Figura figura: figuras) {
            resultado += figura.area();
        }

        return resultado;
    }
}
