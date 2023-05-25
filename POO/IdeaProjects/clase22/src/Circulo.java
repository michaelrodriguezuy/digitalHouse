public class Circulo implements Figura{

    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double area() {
        return  Math.PI * radio*radio;
    }
}
