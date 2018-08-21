
package login_seguridad_informatica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author efralerma
 */
public class Login_seguridad_informatica {

    public static void main(String[] args) {
        INTERFAZ_LOGIN formulario = new INTERFAZ_LOGIN();
        formulario.setVisible(true);
        
        cls_encriptamiento objeto = new cls_encriptamiento();
        
        //System.out.println(""+objeto.metodo_encriptamiento("abc"));
        String cadena="a9Pb";
//        char [] cadena_palabra = cadena.toCharArray();
//        
//        for(int i=0; i< cadena_palabra.length; i++){
//            System.out.println(""+cadena_palabra[i]);
//        }
//        
//        System.out.println(String.valueOf(cadena_palabra));
        
        //String m = objeto.metodo_encriptamiento("apya");
//        System.out.println(""+cadena);
//        String resultado = objeto.metodo_encriptamiento(cadena);
//        System.out.println(" "+resultado);
//        System.out.println(" "+objeto.metodo_desencriptamiento(resultado));
//        System.out.println(" "+objeto.reverse(cadena));
    }
    
}
