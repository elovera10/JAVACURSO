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
public class Prestamo {
    private BigDecimal monto; 
    private int plazoEnMeses;
    private int cantidadCuotas;
    private BigDecimal tasa;
    private DocumentoDigital[] documentoDigitales;
}
