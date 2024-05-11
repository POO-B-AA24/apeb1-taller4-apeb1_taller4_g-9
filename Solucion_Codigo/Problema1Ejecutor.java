package paquete1;

import java.util.Scanner;

public class Problema1Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float precio;
        int cantidad;
        System.out.print("Ingrese el precio del producto: ");
        precio = sc.nextFloat();
        
        System.out.print("Ingrese el numero de productos: ");
        cantidad = sc.nextInt();

        VentaProducto venta = new VentaProducto(precio, cantidad);
        float descuento = venta.calcularDescuento();
        float precioFinal = venta.calcularPrecioFinal();

        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final despues del descuento: $"+precioFinal);

    }
}
