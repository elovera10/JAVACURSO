/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject1.dominio;

import java.math.BigDecimal;

/**
 *
 * @author lovera1290
 */
public class PrestamoPersonal extends Prestamo {
    
    private String situacionVeraz;
    
    public PrestamoPersonal(Banco banco, BigDecimal monto, int cantidadCuotas, String situacionVeraz) {
        super(banco, monto, cantidadCuotas);
    }
    
    public String getSituacionVeraz() {
        return situacionVeraz;
    }

    public void setSituacionVeraz(String situacionVeraz) {
        this.situacionVeraz = situacionVeraz;
    }
    @Override
    public String toString() {
        return "PrestamoPersonal{" + "Situacion Veraz: " + situacionVeraz + '}';
    }    

    void setFechaAcreditacion(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
