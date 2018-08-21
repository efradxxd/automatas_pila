
package analizador;

import java.util.Stack;

/**
 *
 * @author efralerma
 */
public class Analizador {


    public static void main(String[] args) {
     
        cls_automatas automata = new cls_automatas();
        interfaz2 formulario = new interfaz2();
        
        Stack<Character> letras = new Stack<Character>();
        String palabra = "abb";
        Character cara = palabra.charAt(2);
        
        if(automata.automata1(palabra)==true){
            System.out.println(" se armo la gorda");
        }else{
            System.out.println("nel bro :v");
        }
        
        formulario.setVisible(true);           
        
    }
    
}
