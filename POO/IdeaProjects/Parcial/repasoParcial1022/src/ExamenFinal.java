public class ExamenFinal extends Examen implements Comparable{
    private Integer notaOral;
    private String descripcion;

    public ExamenFinal(String titulo, String enunciado, Integer nota, Alumno alumno, Integer notaOral, String descripcion) {
        super(titulo, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.descripcion = descripcion;
    }
    @Override
    public Boolean estaAprobado(){
        if(super.getNota() >= 4 && this.notaOral >= 4){
            return true;
        }else{
            return false;
        }
    }

    public Double calcularPromedio(){
        Double promedio = (super.getNota() + this.notaOral) / 2.0;
        return promedio;
    }

    @Override
    public int compareTo(Object o) {
        ExamenFinal examenXParametro = (ExamenFinal) o;
        if(this.calcularPromedio() > examenXParametro.calcularPromedio()){
            return 1;
        }else{
            if (this.calcularPromedio() < examenXParametro.calcularPromedio()){
                return -1;
            }else{
                return 0;
            }
        }
    }
}
