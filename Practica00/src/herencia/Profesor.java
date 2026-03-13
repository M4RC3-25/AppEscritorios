package herencia;

public class Profesor extends Empleado {

    String materia;

    public Profesor(String nombre, double salario, String tipo, String materia) {
        super(nombre, salario, tipo);
        this.materia = materia;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Materia: " + materia);
    }
}