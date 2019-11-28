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
public class Cliente {
    private String dni;
    private String nombreApellido;
    private Domicilio[] domicilio;
    private BigDecimal ingresos;    
    private DocumentoDigital[] dniDigitalizado;
    private Prestamo[] prestamos;

    public void cambiarDomicilio (Domicilio newDomicilio){
        
    }
    
    public void actualizarIngresos(DocumentoDigital recibo,BigDecimal monto){
    
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

    public DocumentoDigital[] getDniDigitalizado() {
        return dniDigitalizado;
    }

    public void setDniDigitalizado(DocumentoDigital[] dniDigitalizado) {
        this.dniDigitalizado = dniDigitalizado;
    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }
    
}
