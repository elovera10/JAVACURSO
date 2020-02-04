/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject1.Controller;

import mavenproject1.dominio.Banco;
import mavenproject1.dominio.Prestamo;
import mavenproject1.dominio.PrestamoHipotecario;
import mavenproject1.dominio.PrestamoPersonal;
import java.math.BigDecimal;
import java.time.LocalDate;
import static java.util.Arrays.asList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 *
 * @author lovera1290
 */
@Controller

public class PaginasController {
    @RequestMapping(method = GET, path="/mis-prestamos")
    public String paginaPrestamos (Model model) {
        
        Banco bancoSaenz = Banco.obtenerBanco();
        
        BigDecimal elMonto = new BigDecimal("1550.50");
        BigDecimal elMonto2 = new BigDecimal("1000.10");
        BigDecimal elMonto3 = new BigDecimal("10500.00");
        
        PrestamoPersonal prestPersonal = new PrestamoPersonal (bancoSaenz, elMonto2, 18,"SIT6");        
        prestPersonal.setFechaAcreditacion(LocalDate.of(2020,03, 21));
        prestPersonal.setNumero(47866);
        
        PrestamoPersonal prestPersonal2 = new PrestamoPersonal (bancoSaenz, elMonto3, 24,"SIT3");
        
        PrestamoHipotecario prestamoHipotecario = new PrestamoHipotecario(bancoSaenz, elMonto, 30,"Auto");
        prestamoHipotecario.setFechaAcreditacion(LocalDate.of(2020,11,11));
        
        Prestamo [] prestamosDelCliente = {prestamoHipotecario,prestPersonal,prestPersonal2};
        List<Prestamo> prestamosList = asList(prestamosDelCliente);
        
        model.addAttribute("prestamos", prestamosList);
        model.addAttribute("otroPrestamo", prestamoHipotecario);
        
        return "prestamos-pagina";
    }
    
}
