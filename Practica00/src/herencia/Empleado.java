package herencia;

public class Empleado {

    String nombre;
    double salario;
    String tipo;

    public Empleado(String nombre, double salario, String tipo) {
        this.nombre = nombre;
        this.salario = salario;
        this.tipo = tipo;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Tipo: " + tipo);
    }
}