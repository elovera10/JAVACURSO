/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author lovera1290
 */
import dominio.Banco;
import dominio.Prestamo;
import dominio.PrestamoHipotecario;
import dominio.PrestamoPersonal;
import java.math.BigDecimal;
import java.time.LocalDate;
import static java.util.Arrays.asList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrestamoController {
      @RequestMapping(method = GET, path = "/apirest/prestamos")
    public List<Prestamo> obtenerPrestamos() {

        Banco bancoSaenz = Banco.obtenerBanco();

        BigDecimal elMonto = new BigDecimal("1550.25");
        BigDecimal elMonto2 = new BigDecimal("1000.10");
        BigDecimal elMonto3 = new BigDecimal("10000.00");
        BigDecimal elMonto4 = new BigDecimal("15100.00");
        BigDecimal elMonto5 = new BigDecimal("13300.00");        
        BigDecimal ingresos = new BigDecimal("55000");
        
        PrestamoHipotecario prestamoHipotecario = new PrestamoHipotecario(bancoSaenz, elMonto, 30,"Auto");
        prestamoHipotecario.setGarantia("BCOHIPOTECARIO");
        //PrestamoHipotecario.setSituacionVeraz("AA");
        PrestamoPersonal prestPersonal = new PrestamoPersonal (bancoSaenz, elMonto2, 18,"SIT6");
        prestPersonal.setSituacionVeraz("AA");
        PrestamoPersonal prestPersonal2 = new PrestamoPersonal (bancoSaenz, elMonto3, 24,"SIT3");
        prestPersonal2.setSituacionVeraz("A2");        
        PrestamoPersonal prestPersonal3 = new PrestamoPersonal (bancoSaenz, elMonto4, 24,"SIT1");
        prestPersonal3.setSituacionVeraz("A4");
        PrestamoPersonal prestPersonal4 = new PrestamoPersonal (bancoSaenz, elMonto5, 24,"SIT2");
        prestPersonal4.setSituacionVeraz("A1");

        Prestamo [] prestamosDelCliente = {prestamoHipotecario,prestPersonal,prestPersonal2,prestPersonal3,prestPersonal4};
        return asList(prestamosDelCliente);
    }
}
