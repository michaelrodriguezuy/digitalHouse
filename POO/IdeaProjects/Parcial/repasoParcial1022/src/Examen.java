public abstract class Examen {
    private String titulo, enunciado;
    private Integer nota;
    private Alumno alumno;

    public Examen(String titulo, String enunciado, Integer nota, Alumno alumno) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
        this.alumno = alumno;
    }
    // lo agrego para poder usar en las clases hijas.
    public Integer getNota(){
        return nota;
    }

    public abstract Boolean estaAprobado();

}
