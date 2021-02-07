/*
CONCURSO DE MUSICA. SON 5 GENEROS Y CANTIDAD DE ALUMNOS N POR GENERO MUSICAL.
CADA ALUMNO REGISTRA, NOMBRE, EDAD E INSTRUMENTO QUE TOCA.-
GENERAR CONSTRUCTOR PARA UN CONCURSO DE N ALUMNOS, DONDE SE SUS PUNTAJES INICIAN EN -1-
DADO UN ALUMNO Y GENERO MUSICA VALIDO,INSCRIBIRLO ASUMINETO QUE HAY LUGAR
DADO UN PUNTAJE Y NOMBRE DE ALUMNO ASIGNE EL PUNTAJE AL ALUMNO, QUE PODRIA NO EXISTIR.
DEVOLVER EL ALUMNO CON MAYOR PUNTAJE EN TODO EL CURSO.-
 */
package examen4;

/**
 *
 * @author User
 */
public class Examen4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno auxiliar= null;
        Concurso C= new Concurso(20);
        
        Alumno A= new Alumno("Lore", 32, "Saxo");
        Alumno A2= new Alumno("Bren", 35, "Voz");
        Alumno A3= new Alumno("Pato", 35, "Bajo");
        Alumno A4= new Alumno("Alan", 29, "Trompeta");
        Alumno A5= new Alumno("Lulo", 39, "Saxo Soprano");
        
        C.inscribirAlumno(A, 0);
        C.inscribirAlumno(A2, 0);
        C.inscribirAlumno(A3, 2);
        C.inscribirAlumno(A4, 4);
        C.inscribirAlumno(A5, 3);
        
        C.asignarPuntaje("Lore", 10);
        C.asignarPuntaje("Alan", 7);
        C.asignarPuntaje("Bren", 12);
        C.asignarPuntaje("Pato", 3);
        
        auxiliar=C.mayorPuntaje();
        System.out.println("EL ALUMNO CON MAYOR PUNTAJE ES\n"+auxiliar.toString());
        
        
    }
    
}
