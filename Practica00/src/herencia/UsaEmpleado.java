package herencia;
import java.util.Scanner;

public class UsaEmpleado {

    static Scanner num = new Scanner(System.in);
    static Empleado[] empleados = new Empleado[10];
    static int i = 0;

    public static void main(String[] args) {

        int opcion = 0;

        while(opcion != 5){
            MostrarMenu();
            opcion = num.nextInt();
            num.nextLine(); 
            Seleccion(opcion);
        }
    }

    public static void MostrarMenu(){
        System.out.println("\nNENU PRINCIPAL");
        System.out.println("1.- Agregar empleado");
        System.out.println("2.- Agregar profesor");
        System.out.println("3.- Agregar administrativo");
        System.out.println("4.- Imprimir lista de empleados");
        System.out.println("5.- Salir");
        System.out.print("Ingresa tu opcion: ");
    }

    public static void Seleccion(int opcion){

        switch(opcion){

            case 1:
                if(Validar()){
                    CrearEmpleado();
                    i++;
                }
                break;

            case 2:
                if(Validar()){
                    CrearProfesor();
                    i++;
                }
                break;

            case 3:
                if(Validar()){
                    CrearAdministrativo();
                    i++;
                }
                break;

            case 4:
                ImprimirEmpleados();
                break;

            case 5:
                System.out.println("Cerrando programa...");
                break;

            default:
                System.out.println("Opcion no valida");
        }
    }

    public static void CrearEmpleado(){
        System.out.println("Ingresa la informacion del empleado");
        System.out.print("Nombre: ");
        String nombre = num.nextLine();

        System.out.print("Salario: ");
        double salario = num.nextDouble();
        num.nextLine();

        empleados[i] = new Empleado(nombre, salario, "Generico");
    }

    public static void CrearProfesor(){
        System.out.println("Ingresa la informacion del profesor");
        System.out.print("Nombre: ");
        String nombre = num.nextLine();

        System.out.print("Salario: ");
        double salario = num.nextDouble();
        num.nextLine();

        System.out.print("Materia: ");
        String materia = num.nextLine();

        empleados[i] = new Profesor(nombre, salario, "Profesor", materia);
    }

    public static void CrearAdministrativo(){
        System.out.println("Ingresa la informacion del administrativo");
        System.out.print("Nombre: ");
        String nombre = num.nextLine();

        System.out.print("Salario: ");
        double salario = num.nextDouble();
        num.nextLine();

        System.out.print("Departamento: ");
        String departamento = num.nextLine();

        empleados[i] = new Administrativo(nombre, salario, "Administrativo", departamento);
    }

    public static void ImprimirEmpleados(){
        System.out.println("\n--------LISTA DE EMPLEADOS--------");

        for(int j = 0; j < i; j++){
            System.out.println("------------------------");
            empleados[j].mostrarDatos();
        }
    }

    public static boolean Validar(){
        if(i >= 10){
            System.out.println("El arreglo se encuentra lleno");
            return false;
        }
        return true;
    }
}