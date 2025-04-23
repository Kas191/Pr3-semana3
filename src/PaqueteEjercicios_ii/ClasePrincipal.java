/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteEjercicios_ii;
import java.text.DecimalFormat;
/**
 *
 * @author DoxaF
 */
public class ClasePrincipal {

   //atributos
    private String nombres;
    private String apellidos;
    private String dni;
    private String nombreMedicamento;
    private double precioUnidad;
    private int cantidad;
    private String metodoPago;
    private double dineroRecibido;
    
    //constructor
     public ClasePrincipal(String nombres, String apellidos, String dni, String nombreMedicamento, double precioUnidad, int cantidad, String metodoPago, double dineroRecibido) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.nombreMedicamento = nombreMedicamento;
        this.precioUnidad = precioUnidad;
        this.cantidad = cantidad;
        this.metodoPago = metodoPago;
        this.dineroRecibido = dineroRecibido;
    }
//get and set
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

     public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getDineroRecibido() {
        return dineroRecibido;
    }

    public void setDineroRecibido(double dineroRecibido) {
        this.dineroRecibido = dineroRecibido;
    }
    
    
        // Método para mostrar resumen de la compra en el jtextfield 
    public String mostrarResumen() {
       
        // Validar método de pago (acepta solo Yape, Efectivo o Tarjeta)
    String metodo = metodoPago.toLowerCase(); //Conversion de mayusculas 
    //Equals compara !si es diferente
    if (!(metodo.equals("yape") || metodo.equals("efectivo") || metodo.equals("tarjeta"))) {
        return "x Método de pago inválido. Solo se permite: Yape, Efectivo o Tarjeta 😰.";
    }

    // Calcular total a pagar y vuelto
    double total = precioUnidad * cantidad;
    double vuelto = dineroRecibido - total;

    // Formatear decimales
    DecimalFormat df = new DecimalFormat("#0.00");

    // Armar resumen
     return "   🌞   RESUMEN DE VENTA  🌞\n"
                + "-----------------------------\n"
                + "👤 Nombre: " + nombres + " " + apellidos + "\n"
                + "🆔 DNI: " + dni + "\n"
                + "💊 Medicamento: " + nombreMedicamento + "\n"
                + "💵 Precio x unidad: S/ " + df.format(precioUnidad) + "\n"
                + "🔢 Cantidad: " + cantidad + "\n"
                + "💰 Total a pagar: S/ " + df.format(total) + "\n"
                + "💳 Método de pago: " + metodoPago.toUpperCase() + "\n"
                + "🎉 Dinero recibido: S/ " + df.format(dineroRecibido) + "\n"
                + "💸 Vuelto: S/ " + df.format(vuelto) + "\n";
    }  //pag de emojis piliapp xd usalo para poner los emojis Davide lo usa
     
    
    
    
}
