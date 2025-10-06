package tarea2;

public class Tarea3 {
    String nombre;
    String plato1;
    String plato2;
    String plato3;
    int precio1;
    int precio2;
    int precio3;

    public Tarea3() {
    }
    public Tarea3(String nombre, String plato1, String plato2, String plato3, int precio1, int precio2, int precio3) {
        this.nombre = nombre;
        this.plato1 = plato1;
        this.plato2 = plato2;
        this.plato3 = plato3;
        this.precio1 = precio1;
        this.precio2 = precio2;
        this.precio3 = precio3;
    }
    void carta(){
        System.out.println(" ***la carta de hoy*** "+plato1+plato2+plato3);
    }
    void cliente(){
        System.out.println("****"+nombre+"****");
    }
    void preciosPlatos(){
        System.out.println(" ***los precios para el dia de hoy*** "+precio1+" "+precio2+" "+precio3);
    }
}
