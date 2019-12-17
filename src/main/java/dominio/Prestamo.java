package dominio;

import static dominio.ImprimirDatos.COLORDEFAULT;
import java.math.BigDecimal;

public abstract class Prestamo implements ImprimirDatos{
    private Banco banco;
    private BigDecimal monto; 
    private int cantidadCuotas;
    private BigDecimal tasa;
    private DocumentoDigital[] documentoDigitales;

   
    @Override
    public String toString(){
        return "Monto: " + this.monto
                + " // cantidad de cuotas: " + this.cantidadCuotas;    
    
    }

//    public Prestamo(BigDecimal montoN) {
//        System.out.println("MONTO NUEVO: " + montoN);
//        this.monto = montoN;
//    }
//    public Prestamo(){
//    }
    public Prestamo(Banco banco, BigDecimal monto, int cantidadCuotas) {
        this.banco = banco;
        this.monto = monto;
        this.cantidadCuotas = cantidadCuotas;
    }
    //Prestamo p1 = new Prestamo(BigDecimal monto, int cantidadCuotas);
     // Implementación del método imprimirDatos() declarado en la interfaz ImprimirDatos
    public void imprimirDatos() {
        System.out.println("Impresión Prestamo: "
                + "monto del préstamo = " + monto
                + ", cantidad de cuotas = " + cantidadCuotas
                + ". Color de impresión: " + COLORDEFAULT);
    };
    public BigDecimal getMonto() {
        //public int getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
    //public void setMonto(int monto) {        
        this.monto = monto;
    }
    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

//    public void setCantidadCuotas(int cantidadCuotas) {
//        this.cantidadCuotas = cantidadCuotas;
//    }

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
//    public Boolean cancelarCuotas (int cantidad){
//        
//        Boolean cancelo = true;
//        return cancelo;
//    };
//    public void cancelarPrestamo (){
//        
//    };   

   
}
