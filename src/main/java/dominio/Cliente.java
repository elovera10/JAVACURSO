/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import java.math.BigDecimal;
/**
 *
 * @author lovera1290
 */
public class Cliente implements ImprimirDatos{
    //private DocumentoDigital[] dni;   
    private String dni;
    private Domicilio[] domicilio;
    private BigDecimal ingresos;    
    //private DocumentoDigital[] dniDigitalizado;
    private Prestamo[] prestamos;
    private String nombreApellido;

    public Cliente (String nombreNuevo) {
        System.out.println("CREACION DE CLIENTE: " + nombreNuevo);
        this.nombreApellido = nombreNuevo;
    }         
    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", domicilio=" + domicilio + ", ingresos=" + ingresos + ", prestamos=" + prestamos + ", nombre=" + nombreApellido + '}';
    }
    @Override
    public void imprimirDatos() {
        System.out.println("Impresión Cliente: "
                + "DNI = " + dni + ", ingresos = " + ingresos
                + ". Color de impresión: " + COLORSECUNDARIO);
        for (Prestamo prestamo : prestamos) {
            prestamo.imprimirDatos();
        }
    }
    public void cambiarDomicilio (Domicilio newDomicilio){
        
    }
    
    public void actualizarIngresos(DocumentoDigital recibo,BigDecimal monto){
    
    }
//    public String getNombreApellido() {
//        return nombreApellido;
//    }

//    public void setNombreApellido(String nombreApellido) {
//        this.nombreApellido = nombreApellido;
//    }

    public Domicilio[] getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio[] domicilio) {
        this.domicilio = domicilio;
    }

    public BigDecimal getIngresos() {
        return ingresos;
    }

    public void setIngresos(BigDecimal ingresos) {
        this.ingresos = ingresos;
    }
    
//    public DocumentoDigital[] getDniDigitalizado() {
//        return dni;
//    }

//    public void setDniDigitalizado(DocumentoDigital[] dniDigitalizado) {
//        this.dni = dniDigitalizado;
//    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }
    
}
