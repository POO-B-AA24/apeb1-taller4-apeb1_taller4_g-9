package paquete2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEmpleadosEjecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ListaEmpleados> empleados = new ArrayList<>();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar un empleado");
            System.out.println("2. Mostrar información de los empleados");
            System.out.println("3. Calcular aumento de salario");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarEmpleado(empleados);
                    break;
                case 2:
                    mostrarEmpleados(empleados);
                    break;
                case 3:
                    calcularAumentoSalario(empleados);
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    public static void agregarEmpleado(List<ListaEmpleados> empleados) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();
        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        empleados.add(new ListaEmpleados(nombre, salario, edad));
        System.out.println("Empleado agregado correctamente.");
    }

    public static void mostrarEmpleados(List<ListaEmpleados> empleados) {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Información de los empleados:");
            for (ListaEmpleados empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }

    public static void calcularAumentoSalario(List<ListaEmpleados> empleados) {
        Scanner scanner = new Scanner(System.in);
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        double totalSalarios = 0;
        for (ListaEmpleados empleado : empleados) {
            totalSalarios += empleado.getSalario();
        }
        double salarioPromedio = totalSalarios / empleados.size();
        System.out.print("Ingrese el porcentaje de aumento salarial: ");
        double porcentajeAumento = scanner.nextDouble();
        for (ListaEmpleados empleado : empleados) {
            if (empleado.getSalario() < salarioPromedio) {
                empleado.aplicarAumento(porcentajeAumento);
                System.out.println("Nuevo salario de " + empleado.nombre + ": " + empleado.getSalario());
            }
        }
    }
}