package herencia;

public class Administrativo extends Empleado {

    String departamento;

    public Administrativo(String nombre, double salario, String tipo, String departamento) {
        super(nombre, salario, tipo);
        this.departamento = departamento;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Departamento: " + departamento);
    }
}