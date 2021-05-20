
/**
 * Write a description of class Aula here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aula
{
    Estudiante[] estudiantes;
    int registrados;
    public Aula(int cantidadAlumnos){
        estudiantes= new Estudiante [cantidadAlumnos];
        registrados=0;
    }
    public String anadirNota(Estudiante estu1){
        String reporte="";
        if(registrados<estudiantes.length){
            estudiantes[registrados]=estu1;
            registrados++;
            reporte="registrado";
        }else{
            reporte="Aula llena";
        }
        return reporte;
    }
    public double promedioTodas(){
        double total=0;
        int i=0;
        while(i <estudiantes.length){
            total=total+estudiantes[i].getNota();
            i++;
        }
        double promedioNotas=total/i;
        return promedioNotas;
    }
    public double promedioAprobadas(){
        double proAprobadas,nota;
        double suma=0;
        int contador=0;
        for(int i=0;i <estudiantes.length;i++){
            nota=estudiantes[i].getNota();
            if(nota>51){
                suma=suma+nota;
                contador++;
            }
        }
        proAprobadas=suma/contador;
        return proAprobadas;
    }
    public int cantAprobados(){
        double nota;
        int aprobados=0;
        for(int i=0;i <estudiantes.length;i++){
            nota=estudiantes[i].getNota();
            if(nota>51){
                aprobados++;
            }
        }
        return aprobados;
    }
    public int cantReprobados(){
        double nota;
        int reprobados=0;
        for(int i=0;i <estudiantes.length;i++){
            nota=estudiantes[i].getNota();
            if(nota<=51){
                reprobados++;
            }
        }
        return reprobados;
    }
    public String notaMasAlta(){
        double nota;
        double notaAlta=0;
        int indice=0;
        for(int i=0;i<estudiantes.length;i++){
            nota=estudiantes[i].getNota();
            if(nota>notaAlta){
                notaAlta=nota;
                indice=i;
            }
        }
        
        return "La nota mas alta le pertenece a "+estudiantes[indice].getNombre()+" con "+estudiantes[indice].getNota();
    }
}
