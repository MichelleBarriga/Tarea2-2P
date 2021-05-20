
/**
 * Write a description of class Estudiante here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Estudiante
{
    private double nota;
    private String nombre;
    public Estudiante(String name, double note){
        nombre=name;
        nota=note;
    }
    public double getNota(){
        return nota;
    }
    public String getNombre(){
        return nombre;
    }
}
