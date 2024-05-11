package Paquete1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEmpleados {

    private String nombre;
    private double salario;
    private int edad;

    public ListaEmpleados(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nSalario: " + salario + "\nEdad: " + edad;
    }

    public double getSalario() {
        return salario;
    }

    public void aplicarAumento(double porcentaje) {
        salario *= (1 + porcentaje / 100);
    }

}
