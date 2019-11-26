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
}
