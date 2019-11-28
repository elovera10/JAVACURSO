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
public class MainPrestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int monto = 1000;
        int cantidadCuotas = 12;
        
        Prestamo prestamoUno = new Prestamo(monto, cantidadCuotas);
        Prestamo prestamoDos = new Prestamo(monto, cantidadCuotas);
        prestamoDos.setMonto(2500);
        prestamoDos.setCantidadCuotas(24);
        System.out.println("monto prestamoDos: " + prestamoDos.getMonto());
        System.out.println("monto prestamoUno: " + prestamoUno.getMonto());
        prestamoUno.setMonto(2000);
        System.out.println("nuevo monto prestamoUno: " + prestamoUno.getMonto());
        
        BigDecimal t1 = prestamoUno.calculaTasa(prestamoUno.getCantidadCuotas());
        BigDecimal t2 = prestamoDos.calculaTasa(prestamoDos.getCantidadCuotas());
        System.out.println("Tasa prestamoUno: " + t1);
        System.out.println("Tasa prestamoDos: " + t2);
        //prestamoUno.calculaTasa(prestamoDos);
        
    }
//        public static void calculaTasa(Prestamo P1) {
//        //int m1 = P1.getMonto();
//        int c1 = P1.getCantidadCuotas();
//        BigDecimal t1 = new BigDecimal(10);
//        BigDecimal t2 = new BigDecimal(20);
//        
//        if (c1 < 13){
//                    
//            P1.setTasa(t1);
//        }
//        if (c1 > 12){
//                    
//            P1.setTasa(t2);
//        }
//    }
   
}
