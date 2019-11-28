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
    //private BigDecimal monto; 
    private BigDecimal monto; 
    private int plazoEnMeses;
    private int cantidadCuotas;
    private BigDecimal tasa;
    private DocumentoDigital[] documentoDigitales;

    //public Prestamo(BigDecimal monto, int cantidadCuotas) {
    public Prestamo(BigDecimal monto, int cantidadCuotas) {
        this.monto = monto;
        this.cantidadCuotas = cantidadCuotas;
    }
    public Boolean cancelarCuotas (int cantidad){
        
        Boolean cancelo = true;
        return cancelo;
    };
    public void cancelarPrestamo (){
        
    };
//    public BigDecimal calculaTasa(int cuotas) {
//        //int m1 = P1.getMonto();
//        BigDecimal t1 = new BigDecimal(10);
//        BigDecimal t2 = new BigDecimal(20);
//        BigDecimal tasa1 = new BigDecimal("0");
//        
//        if (cuotas < 13){
//                    
//            tasa1 = new BigDecimal(10);
//        }
//        if (cuotas > 12){
//                    
//            tasa1 =new BigDecimal(20);
//        }
//        return tasa1;
//    }
    
    public BigDecimal getMonto() {
    //public int getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
    //public void setMonto(int monto) {        
        this.monto = monto;
    }

    public int getPlazoEnMeses() {
        return plazoEnMeses;
    }

    public void setPlazoEnMeses(int plazoEnMeses) {
        this.plazoEnMeses = plazoEnMeses;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public BigDecimal getTasa() {
        return tasa;
    }

    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
    }

    public DocumentoDigital[] getDocumentoDigitales() {
        return documentoDigitales;
    }

    public void setDocumentoDigitales(DocumentoDigital[] documentoDigitales) {
        this.documentoDigitales = documentoDigitales;
    }
   
}
