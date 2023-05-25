public class ExamenParcial extends Examen {
    private Integer nroUnidad, nroReintentos;

    public ExamenParcial(String titulo, String enunciado, Integer nota, Alumno alumno, Integer nroUnidad) {
        super(titulo, enunciado, nota, alumno);
        this.nroUnidad = nroUnidad;
        this.nroReintentos = 0;
    }


    public Boolean sePuedeRecuperar(){
        if(this.nroUnidad <= 3 && this.nroReintentos < 3){
            this.nroReintentos ++;
            return true;
        } else{
            if (this.nroUnidad > 3 && this.nroReintentos < 2){
                this.nroReintentos ++;
                return true;
            }else{
                return false;
            }
        }
    }

    public Boolean estaAprobado(){
        if (super.getNota() >= 4){
            return true;
        }else{
            return false;
        }
    }

    /* opcion
    public Boolean estaAprobado(){
        return super.getNota() >= 4;
    }*/


}
