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
public class Alumno {
    private String nombre;
    private int edad;
    private String instrumento;
    private int puntaje;

    public Alumno(String nombre, int edad, String instrumento) {
        this.nombre = nombre;
        this.edad = edad;
        this.instrumento = instrumento;
        this.puntaje = -1;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    
   public String toString() {
       return "Nombre\n"+ this.getNombre()+ "\nInstrumento\n"+this.getInstrumento()+"\nPuntaje\n"+this.getPuntaje();
   }
    
    
    
    
}
