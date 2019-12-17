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
public class PrestamoHipotecario extends Prestamo {

    private String garantia;

    public PrestamoHipotecario(Banco banco, BigDecimal monto, Integer cantidadCuotas) {
        super(banco, monto, cantidadCuotas);
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
    @Override
    public void imprimirDatos() {
        System.out.println("Impresión Préstamo Hipotecario");
        System.out.println("Garantia: " + garantia);
    };
}
