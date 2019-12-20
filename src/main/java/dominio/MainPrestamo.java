package dominio;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MainPrestamo {

    
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] parametros) {
        System.out.println("Hola mundo!");
        //Prestamo miPrestamo = new Prestamo(elMonto,);
        //miPrestamo.setCantidadCuotas(6);
        //Banco bancoSaenz = Banco.obtenerBanco("Saenz");
        Banco bancoSaenz = Banco.obtenerBanco();
        //String codigoDelBanco1 = bancoSaenz.getCodigo();
        //System.out.println(Banco.convertirAString());
        //System.out.println("BANCO UNO: " + bancoSaenz.getCodigo());
        //System.out.println("BANCO UNO: " + bancoSaenz);
        System.out.println("Iniciando sistema del banco: " + bancoSaenz);
        BigDecimal elMonto = new BigDecimal("1550.25");
        //miPrestamo.setMonto(elMonto);
        //Prestamo miPrestamo = new Prestamo(bancoSaenz,elMonto,6);  
        
        //elMonto.setScale(5);
        //Prestamo miSegundoPrestamo = new Prestamo();
        //miSegundoPrestamo.setCantidadCuotas(12);
        
        BigDecimal elMonto2 = new BigDecimal("1000.10");
        BigDecimal elMonto3 = new BigDecimal("10000.00");
        BigDecimal ingresos = new BigDecimal("55000");
        //miSegundoPrestamo.setMonto(elMonto2); 
        //Prestamo miSegundoPrestamo = new Prestamo(bancoSaenz,elMonto2, 12);        
        //uso de constructor de Cliente
        //como no hay setter del nombre, una vez que lo creo no lo puedo cambiar
        Cliente cliente = new Cliente ("José Perez"); 
        //cliente.setDni("11223564");
        cliente.setIngresos(ingresos);
        PrestamoHipotecario prestamoHipotecario = new PrestamoHipotecario(bancoSaenz, elMonto, 30,"Auto");
        prestamoHipotecario.setGarantia("BCOHIPOTECARIO");
        //PrestamoHipotecario.setSituacionVeraz("AA");
        PrestamoPersonal prestPersonal = new PrestamoPersonal (bancoSaenz, elMonto2, 18,"SIT6");
        prestPersonal.setSituacionVeraz("AA");
        PrestamoPersonal prestPersonal2 = new PrestamoPersonal (bancoSaenz, elMonto3, 24,"SIT3");
        prestPersonal2.setSituacionVeraz("A2");
        
        prestPersonal.setFechaAcreditacion(LocalDate.of(2019,03, 21));
        prestPersonal.setFechaAdjudicacion(LocalDate.of(2019, 03, 15));        
        prestPersonal2.setFechaAcreditacion(LocalDate.of(2019,12, 21));
        prestPersonal2.setFechaAdjudicacion(LocalDate.of(2019, 10, 15));
        prestamoHipotecario.setFechaAcreditacion(LocalDate.of(2019,8, 21));
        prestamoHipotecario.setFechaAdjudicacion(LocalDate.of(2019,8, 15));
        
        Prestamo [] prestamosDelCliente = {prestamoHipotecario,prestPersonal,prestPersonal2};
        cliente.setPrestamos(prestamosDelCliente);
        //cliente.setPrestamos(prestamosDelCliente); //asignacion de prestamos al cliente
        //cliente.getPrestamos()[2] = miTercerPrestamo; obtengo y agrego otro
        //prestamo
        
        //System.out.println("Prestamo creado: " + miPrestamo);
//        System.out.println("Prestamo1 creado: " + miPrestamo);
//        System.out.println("Cliente creado: " + cliente);
//        System.out.println("Prestamo2 creado: " + miSegundoPrestamo);
        for (Prestamo prestamo : prestamosDelCliente) {
            System.out.println("Monto Del Prestamo: " + prestamo.getMonto());
        }
        cliente.imprimirDatos();
        
        //final BigDecimal elMonto3 = new BigDecimal("35000.10");
        //miSegundoPrestamo.setMonto(elMonto3);  
        //System.out.println("Prestamo3 creado: " + miSegundoPrestamo);
//        
//        System.out.println("Prestamo creado2: " + miSegundoPrestamo);
        
        //uso de constructor de Prestamo
        //BigDecimal elMonto3 = new BigDecimal("1200.05");
        Banco bancoDos = Banco.obtenerBanco();
        //String codigoDelBanco2 = bancoDos.getCodigo();
        //System.out.println(Banco.convertirAString());
        //System.out.println("BANCO DOS: " + bancoDos.getCodigo());
        //bancoDos.setCodigo("SNZ");
        //System.out.println(Banco.convertirAString());
        //String codigoDelBanco3 = bancoDos.getCodigo();
        //System.out.println("BANCO UNO: " + bancoSaenz.getCodigo());
        //System.out.println("BANCO DOS: " + bancoDos.getCodigo());
        
    }
    
}