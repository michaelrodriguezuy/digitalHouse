public class ExamenFinal extends Examen implements Comparable {
    private Integer notaOral;
    private String descripcion;

    public ExamenFinal(String titulo, String enunciado, Integer nota, Alumno alumno, Integer notaOral, String descripcion) {
        super(titulo, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.descripcion = descripcion;
    }

    @Override
    public Boolean estaAprobado() {
        return super.getNota()>=4 && this.notaOral>=4;
    }

    public Double calcularPromedio() {
        return  (super.getNota()+this.notaOral)/2.0;
    }

    @Override
    public int compareTo(Object o) {
        ExamenFinal examenXparametro = (ExamenFinal) o;
        if (this.calcularPromedio()> examenXparametro.calcularPromedio()) {
            return 1;
        } else if(this.calcularPromedio()< examenXparametro.calcularPromedio()) {
            return -1;
        }
    return 0;
    }

}
