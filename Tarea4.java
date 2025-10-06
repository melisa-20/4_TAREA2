package tarea2;

public class Tarea4 {
    String gato;
    String comida;
    String raza;

    //CONSTRUCTOR
    public Tarea4() {
    }

    public Tarea4(String gato, String comida, String raza) {
        this.gato = gato;
        this.comida = comida;
        this.raza = raza;
    }
    void michi(){
        System.out.println("**holo sou** "+gato+" miau ");
    }
    void miau(){
        System.out.println("me gua mucho el "+comida);
    }
    void yo(){
        System.out.println("soy de raza** ");
    }
}
