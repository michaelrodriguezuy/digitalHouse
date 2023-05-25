import clases.Instituto;
import composite.Curso;
import composite.CursoIndividual;
import composite.ProgramaIntensivo;
import factory.CursoFactory;

public class Test {
    public static void main(String[] args) {
        Instituto instituto = new Instituto("DigitalHouse");

        //crear cursos
        Curso frontEnd = CursoFactory.getInstance().crearCursos(CursoFactory.CODIGO_CURSO_INDIVIDUAL,"FrontEnd","El mejor de los cursos de FrontEnd");
        Curso backEnd = CursoFactory.getInstance().crearCursos(CursoFactory.CODIGO_CURSO_INDIVIDUAL, "BackEnd","El mejor de los cursos de BackEnd");
        Curso fullStack = CursoFactory.getInstance().crearCursos(CursoFactory.CODIGO_PROGRAMA_INTENSIVO, "FullStack", "Este es el mejor curso de FullStack");

        //cargar los datos que me faltan para cada uno de los cursos y programa intensivos
            //frontEnd
        ((CursoIndividual)frontEnd).setCargaHoraria(16.0);
        ((CursoIndividual)frontEnd).setDuracion(2.0);
        ((CursoIndividual)frontEnd).setValorHora(1000.0);
            //backEnd
        ((CursoIndividual)backEnd).setCargaHoraria(20.0);
        ((CursoIndividual)backEnd).setDuracion(2.0);
        ((CursoIndividual)backEnd).setValorHora(900.0);
            //fullStack
        ((ProgramaIntensivo)fullStack).agregarCurso(frontEnd);
        ((ProgramaIntensivo)fullStack).agregarCurso(backEnd);
        ((ProgramaIntensivo)fullStack).setBonificacion(20.0);

        //cargar los cursos y programas intensivos al instituto
        instituto.agregarCurso(frontEnd);
        instituto.agregarCurso(backEnd);
        instituto.agregarCurso(fullStack);

        //mostar el informe de los cursos
        for (String curso:instituto.generarInforme()){
            System.out.println(curso);
        }




    }
}