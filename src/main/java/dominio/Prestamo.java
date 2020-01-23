package dominio;

import static dominio.ImprimirDatos.COLORDEFAULT;
import java.math.BigDecimal;
import java.time.LocalDate;

//clase abstracta, no instanciable
public abstract class Prestamo implements ImprimirDatos{
    private Banco banco;
    private Integer numero;
    private BigDecimal monto; 
    private int cantidadCuotas;
    private BigDecimal tasa;
    private DocumentoDigital[] documentoDigitales;
    private String estado;
    private LocalDate fechaAdjudicacion;
    private LocalDate fechaAcreditacion;

    // Constructor default
    public Prestamo(Banco banco, BigDecimal monto, int cantidadCuotas) {
        this.banco = banco;
        this.monto = monto;
        this.cantidadCuotas = cantidadCuotas;
        this.estado = "ACTIVO";
    }
    
    //método que sobreescribe el toString() default
    public String toString(){
        return "Monto: " + this.monto
                + " // cantidad de cuotas: " + this.cantidadCuotas;    
    
    }
    
    // Implementación del método imprimirDatos() declarado en la interfaz ImprimirDatos
    @Override
    public void imprimirDatos() {
        System.out.println("Impresión Prestamo: "
                + "monto del préstamo = " + monto
                + ", cantidad de cuotas = " + cantidadCuotas
                + ". Color de impresión: " + COLORDEFAULT
                + ", Fecha Acreditacion: " + fechaAcreditacion);
    };
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public LocalDate getFechaAdjudicacion() {
        return fechaAdjudicacion;
    }

    public void setFechaAdjudicacion(LocalDate fechaAdjudicacion) {
        this.fechaAdjudicacion = fechaAdjudicacion;
    }

    public LocalDate getFechaAcreditacion() {
        return fechaAcreditacion;
    }

    public void setFechaAcreditacion(LocalDate fechaAcreditacion) {
        this.fechaAcreditacion = fechaAcreditacion;
    }

   
    
    

//    public Prestamo(BigDecimal montoN) {
//        System.out.println("MONTO NUEVO: " + montoN);
//        this.monto = montoN;
//    }
//    public Prestamo(){
//    }
    
    //Prestamo p1 = new Prestamo(BigDecimal monto, int cantidadCuotas);
     // Implementación del método imprimirDatos() declarado en la interfaz ImprimirDatos
    
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
    private void setCantidadCuotas(Integer cantidadCuotas) {
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
//    public Boolean cancelarCuotas (int cantidad){
//        
//        Boolean cancelo = true;
//        return cancelo;
//    };
//    public void cancelarPrestamo (){
//        
//    };   

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Boolean cancelarCuotas(int cantidadACancelar) {
        int diferenciaDeCuotas = cantidadCuotas - cantidadACancelar;
        // Verifico que sea posible cancelar dicha cantidad de cuotas
        if (diferenciaDeCuotas >= 0) {
            // Setteo la cantidadDeCuotas a la cantidad de cuotas restantes
            setCantidadCuotas(diferenciaDeCuotas);
            return true;
        } else {
            cancelarCuotas(cantidadACancelar - 1); //recursivo!!
        }
        return false;
    }

    // Función para cancelar préstamos
    public void cancelarPrestamo() {
        this.estado = "CANCELADO";
    }
   
}
