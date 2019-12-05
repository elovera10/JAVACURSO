package dominio;

import java.math.BigDecimal;

public class MainPrestamo {

    
    
    public static void main(String[] parametros) {
        
        Prestamo miPrestamo = new Prestamo();
        miPrestamo.setCantidadCuotas(6);
        
        BigDecimal elMonto = new BigDecimal("1550.25");
        miPrestamo.setMonto(elMonto);
                
        Prestamo miSegundoPrestamo = new Prestamo();
        miSegundoPrestamo.setCantidadCuotas(12);
        
        BigDecimal elMonto2 = new BigDecimal("1000.10");
        miSegundoPrestamo.setMonto(elMonto2); 
                
        //uso de constructor de Cliente
        //como no hay setter del nombre, una vez que lo creo no lo puedo cambiar
        Cliente cliente = new Cliente ("Jose");      
        
        Prestamo [] prestamosDelCliente = {miPrestamo,miSegundoPrestamo};
        cliente.setPrestamos(prestamosDelCliente);
        
        //System.out.println("Prestamo creado: " + miPrestamo);
        System.out.println("Cliente creado: " + cliente);
        System.out.println("Prestamo1 creado: " + miPrestamo);
        System.out.println("Prestamo2 creado: " + miSegundoPrestamo);
        final BigDecimal elMonto3 = new BigDecimal("35000.10");
        miSegundoPrestamo.setMonto(elMonto3);  
        System.out.println("Prestamo3 creado: " + miSegundoPrestamo);
        //elMonto2 = new BigDecimal ("50000.00");
//        
//        System.out.println("Prestamo creado2: " + miSegundoPrestamo);
        
        //uso de constructor de Prestamo
        //BigDecimal elMonto3 = new BigDecimal("1200.05");
       
    }
}