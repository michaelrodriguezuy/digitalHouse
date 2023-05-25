import javax.swing.text.StyledEditorKit;

public class ExamenParcial extends Examen{
 private Integer nroUnidad, nroReintentos;

    public ExamenParcial(String titulo, String enunciado, Integer nota, Alumno alumno, Integer nroUnidad) {
        super(titulo, enunciado, nota, alumno);
        this.nroUnidad = nroUnidad;
        this.nroReintentos=0;
    }

    @Override
    public Boolean estaAprobado() {
        return super.getNota()>=4;
    }

    public Boolean seRecupera() {
        if (this.nroUnidad<=3 && this.nroReintentos<3) {
            nroReintentos++;
            return true;
        }else if (this.nroUnidad>3 && this.nroReintentos<2) {
            nroReintentos++;
            return true;
        }
        return false;
    }
}
