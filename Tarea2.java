package tarea2;

public class Tarea2 {
    String nombre;
    String carrera;
    String docente;
    String curso;
    int semestre;
    String apellido;
    int edad;

    public Tarea2() {
    }

    public Tarea2(String nombre, String carrera, String docente, String curso, int semestre, String apellido, int edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.docente = docente;
        this.curso = curso;
        this.semestre = semestre;
        this.apellido = apellido;
        this.edad = edad;
    }

    void info(){
        System.out.println("===hola==="+nombre+carrera+docente+curso+semestre);
    }
    void personal(){
        System.out.println(" soy "+nombre +" y mi apellido es "+apellido+" tego "+edad+ " de edad");
    }
    void isten(){
        System.out.println(" estoy cursando el "+semestre+"  semestre en la cual llevo varios cursos como "+curso);
    }
}
