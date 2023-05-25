public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Pedro", "Almodovar", "4545454");
        Alumno alumno2 = new Alumno("Cacique", "Medina", "454AAA4");

        Examen examenParcial1 = new ExamenParcial("examenP 1", "enunciado 1", 7, alumno1, 6);
        Examen examenParcial2 = new ExamenParcial("examenP 2", "enunciado 2", 4, alumno2, 3);

        System.out.println("Se recupera? " + ((ExamenParcial)examenParcial1).seRecupera() );
        System.out.println("Se recupera? " + ((ExamenParcial)examenParcial1).seRecupera() );
        System.out.println("Se recupera? " + ((ExamenParcial)examenParcial1).seRecupera() );
        System.out.println("Se recupera? " + ((ExamenParcial)examenParcial1).seRecupera() );
        System.out.println("Esta aprobado? " + ((ExamenParcial)examenParcial2).estaAprobado() );

        Examen examen1 = new ExamenFinal("examen 1", "enunciado 1", 7, alumno1, 6, "historia nacional");
        Examen examen2 = new ExamenFinal("examen 2", "enunciado 2", 8, alumno2, 5, "historia nacional");
        System.out.println( ((ExamenFinal)examen1).compareTo((ExamenFinal)examen2));
    }
}