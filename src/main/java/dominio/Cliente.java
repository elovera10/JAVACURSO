/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 *
 * @author lovera1290
 */
public class Cliente implements ImprimirDatos{
    private DocumentoDigital dni;   
    //private String dni;
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
    @SuppressWarnings("InfiniteRecursion")
    public void imprimirDatos() {
        System.out.println("Impresión Cliente: "
                + "DNI = " + dni + ", ingresos = " + ingresos
                + ". Color de impresión: " + COLORSECUNDARIO);
        List <Prestamo> listPrest = Arrays.asList(prestamos);
        List<Prestamo> listaFiltrada = listPrest.stream()
        //listPrest.sort(Comparator.comparing(Prestamo::getFechaAcreditacion));
        //listPrest
                //.stream()
                .filter(pres -> pres.getFechaAcreditacion() != null)
                .filter(i -> i.getFechaAcreditacion().isBefore(LocalDate.now()))
                .collect(Collectors.toList());
                //.forEach(pres2 -> pres2.imprimirDatos() );
        //System.out.println(LocalDate.now());
        listaFiltrada
                .sort(Comparator.comparing(Prestamo::getFechaAcreditacion));
        
        for (Prestamo prestamo : listaFiltrada) {        
//        for (Prestamo prestamo : listPrest) {            
            prestamo.imprimirDatos();
        }
//        listPrest
//                .stream()
//                .filter(pres -> pres.getFechaAcreditacion().isBefore(LocalDate.now()));

    }
    /*public void cambiarDomicilio (Domicilio newDomicilio){
        
    }
    
    public void actualizarIngresos(DocumentoDigital recibo,BigDecimal monto){
    
    }*/
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
//
//    public void setDniDigitalizado(DocumentoDigital[] dniDigitalizado) {
//        this.dni = dniDigitalizado;
//    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }

    public DocumentoDigital getDni() {
        return dni;
    }

    public void setDni(DocumentoDigital dni) {
        this.dni = dni;
    }

    /*public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }*/
    
}
