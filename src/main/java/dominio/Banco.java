/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author lovera1290
 */
public class Banco {


    private static Banco instancia;
    private String codigo;

    //constructor privado, sólo accesible desde esta clase
    private Banco(String codigo) {
        this.codigo = codigo;
        }
//    public String getCodigo() {
//        return codigo;
//        }
//    public void setCodigo(String codigo) {
//        this.codigo = codigo;
//        }
    //metódo perteneciente a la clase
    public static Banco obtenerBanco () {
        if (instancia == null){
            instancia = new Banco("Saenz");
            return instancia;
        }else {
                return instancia;
            }
        }
    //metódo perteneciente a la clase
//    public static String convertirAString(){
//        return "Banco " + instancia.codigo;
//        }    
    public String toString (){
        return "Banco{" + "codigo = " + codigo +'}';
        }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    
}
