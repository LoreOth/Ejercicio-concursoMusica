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
public class Concurso {
    private Alumno [][] matriz;
    private int cant_alumnos;

    public Concurso(int cant_alumnos) {
        this.cant_alumnos = cant_alumnos;
        this.matriz = new Alumno [5][this.cant_alumnos];
        for ( int i=0; i<5; i++){
            for ( int j=0; j<this.cant_alumnos; j++){
                this.matriz[i][j]=null;
            }
        }
        
        
        
    }
    // inscribo a un alumno en un genero dado, asumiento que hay lugar
    public void inscribirAlumno( Alumno unAlumno, int unGenero){
        int j=0;
        while ( this.matriz[unGenero][j] != null){
            j++;
        }
        // como asumo que hay lugar, cuando sale es porque lo encuentra.-
        this.matriz[unGenero][j]=unAlumno;
        
    }
    
    public void asignarPuntaje ( String unNombre, int unPuntaje){
        boolean ok=false;
        int i=0;
        while ( ( i< 5 ) && (!ok)){
            int j=0;
            while ( ( j<this.cant_alumnos) && (!ok)){
                if (this.matriz[i][j]!=null ){
                    if (this.matriz[i][j].getNombre().equals(unNombre)){
                        this.matriz[i][j].setPuntaje(unPuntaje);
                        ok=true;
                        System.out.println("Se asignó correctamente");
                    }
                }
                j++;
                
            }
            i++;
        }
        
        
        
    }
    public Alumno mayorPuntaje(){
        int max=-1;
        Alumno AlumnoMax=null;
        for ( int i=0; i< 5; i++){
            for ( int j=0; j<this.cant_alumnos;j++){
                if (this.matriz[i][j]!=null ){
                    if(this.matriz[i][j].getPuntaje()>max){
                        max=this.matriz[i][j].getPuntaje();
                        AlumnoMax=this.matriz[i][j];
                                
                    }
                }
            }
        }
   return AlumnoMax;
    }
    
}
