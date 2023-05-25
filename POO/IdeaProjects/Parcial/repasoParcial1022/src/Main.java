public class Main {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Pablo", "Palacios", "1");
        Alumno alumno2 = new Alumno("Lucia", "Alves","2");

        //((ExamenParcial)examen1)
        Examen examen1 = new ExamenParcial("Examen Parcial","Todos Aprueban", 8, alumno, 2);
        System.out.println(examen1.estaAprobado());
        System.out.println(((ExamenParcial)examen1).sePuedeRecuperar());
        System.out.println(((ExamenParcial)examen1).sePuedeRecuperar());
        System.out.println(((ExamenParcial)examen1).sePuedeRecuperar());
        System.out.println(((ExamenParcial)examen1).sePuedeRecuperar());

        Examen examenFinal1 = new ExamenFinal("Examen Final", "Les va a ir muy bien", 5,alumno2,8,"lalalal");
        Examen examenFinal2 = new ExamenFinal("Examen Final2", "Les va a ir muy bien", 7,alumno2,9,"lalalal");
        System.out.println(((ExamenFinal)examenFinal1).compareTo((ExamenFinal)examenFinal2));
    }
}