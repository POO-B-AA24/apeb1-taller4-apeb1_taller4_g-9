package paquete1;

public class VentaProducto {
    //Atributos
    private float precio;
    private int cantidad;
    
    //Metodo constructor
    public VentaProducto(float precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public float calcularDescuento() {
       if (precio >= 1000 && cantidad >= 10) {
            return 10/100; // 10% de descuento
        } else {
            return 5/100; // 5% de descuento
        }
    }
    public float calcularPrecioFinal() {
        float descuento = calcularDescuento();
        float precioFinal = precio * (1 - descuento);
        return precioFinal;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
