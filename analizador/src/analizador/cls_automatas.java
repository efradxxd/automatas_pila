
package analizador;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 *
 * @author efralerma
 */
public class cls_automatas {
   public Stack<Character> letras = new Stack<Character>();
    Stack<Character> pila = new Stack<Character>();
    public boolean automata1(String palabra)
    { 
        boolean comprobador = true;
        char resultado = '\0';
        for (int i=(palabra.length())-1; i>=0; i--)
        {
            //char caracter_palabra=palabra.charAt(i); 
            letras.push(palabra.charAt(i));
        }
        pila.push('Z'); 
        
        
        try
        {
            if(letras.peek().equals('a')&& pila.peek().equals('Z'))
            {
                letras.pop();
                pila.pop();
                pila.push('A');
            }
            while(letras.peek().equals('a') && pila.peek().equals('A'))
            {
                letras.pop();
                pila.pop();
                pila.push('A');
                pila.push('A');
            }
           if(letras.peek().equals('b') && pila.peek().equals('A'))
            {
                letras.pop();
                pila.pop();
            }
            while(letras.peek().equals('b') && pila.peek().equals('A'))
            {
                letras.pop();
                pila.pop();
            }
        }catch(Exception e)
        {
            
            System.out.println(" aqui ta "+e);

        } finally{
            System.out.println(" finaliza");
            resultado = '✘';
        }   
            
        if (pila.size() == 0 && letras.size() == 0)
            {
                resultado = '✔';
                comprobador=true;
            }
            else
            {
                resultado = '✘';
                comprobador=false;
            }
                
            pila.clear();
            letras.clear();
        
        return comprobador;
    }
    
    public boolean automata2(String palabra)
    {
        boolean comprobador = true;
        char resultado = '\0';
        if ((palabra.length())>0)
        {
            for (int i = palabra.length() - 1; i >= 0; i--)
                letras.push(palabra.charAt(i));
        }
        else
        {
            letras.push('\0');
        }
        pila.push('Z');
        
        while (pila.size() > 0 && resultado != '✘')
        {
            try
            {
                if (letras.peek().equals('\0') && pila.peek().equals('Z'))
                {
                    letras.pop();
                    pila.pop();
                }
                else if (letras.peek().equals('a') && pila.peek().equals('Z'))
                {
                    letras.pop();
                    pila.pop();
                    pila.push('A');
                }
                else if (letras.peek().equals('a') && pila.peek().equals('A'))
                {
                    letras.pop();
                    pila.pop();
                    pila.push('A');
                    pila.push('A');
                }
                else if (letras.peek().equals('b') && pila.peek().equals('A'))
                {
                    letras.pop();
                    pila.pop();
                }
                else
                {
                    resultado = '✘';
                }
            }
            catch (Exception e)
            {
                System.out.println(" "+e);
                resultado = '✘';
            }
        }

        if (pila.size() == 0 && letras.size() == 0)
        {
            resultado = '✔';
            comprobador=true;
        }
        else
        {
            resultado = '✘';
            comprobador = false;
        }

        pila.clear();
        letras.clear();
        
        return comprobador;
    }
    
    public boolean automata3(String palabra)
    {
        boolean comprobador = true;
        
        char resultado = '\0';
        for (int i = palabra.length() - 1; i >= 0; i--)
        {
            letras.push(palabra.charAt(i));
        }
            
        pila.push('Z');

        while (pila.size() > 0 && resultado != '✘')
        {
            try
            {
                if (letras.peek().equals('a') && pila.peek().equals('Z'))
                {
                    letras.pop();
                    pila.pop();
                    pila.push('A');
                    pila.push('A');
                }
                else if (letras.peek().equals('a') && pila.peek().equals('A'))
                {
                    letras.pop();
                    pila.pop();
                    pila.push('A');
                    pila.push('A');
                    pila.push('A');
                }
                else if (letras.peek().equals('b') && pila.peek().equals('A'))
                {
                    letras.pop();
                    pila.pop();
                }
                else
                {
                    resultado = '✘';
                }
            }
            catch (Exception e)
            {
                System.out.println(" "+e);
                resultado = '✘';
            }
        }

        if (pila.size() == 0 && letras.size() == 0)
        {
            resultado = '✔';
            comprobador=true;
        }
        else
        {
            resultado = '✘';
            comprobador = false;
        }

        pila.clear();
        letras.clear();
        
        return comprobador;
    }
    public boolean automata4(String palabra){
        boolean comprobador = true;
        
        if(palabra=="b"){
            comprobador=true;
            
        }
        else{
            char resultado = '\0';
            for (int i = palabra.length() - 1; i >= 0; i--){
                letras.push(palabra.charAt(i));
            }
            pila.push('Z');

            try
            {
                if (letras.peek().equals('a') && pila.peek().equals('Z'))
                {
                    letras.pop();
                    pila.pop();
                    pila.push('A');
                }

                while (letras.size() > 1 && letras.peek().equals('a'))
                {
                    if (pila.peek().equals('A'))
                    {
                        letras.pop();
                        pila.pop();
                        pila.push('B');
                    }else if (pila.peek().equals('B'))
                    {
                        letras.pop();
                        pila.pop();
                        pila.push('B');
                        pila.push('A');
                    }
                }

                if (pila.size() > 0 && letras.size() > 0 && letras.peek().equals('b') && pila.peek().equals('Z'))
                {
                    letras.pop();
                    pila.pop();
                }

                if (pila.size() > 0 && letras.size() > 0 && letras.peek().equals('b') && pila.peek().equals('B'))
                {
                    letras.pop();
                    pila.pop();
                }

                while (letras.size() == 0 && pila.peek().equals('B'))
                {
                    pila.pop();
                }

            }
            catch (Exception e)
            {
                System.out.println(" error en "+e);
            }
            finally
            {
                if (pila.size() == 0 && letras.size() == 0)
                {
                    resultado = '✔';
                    comprobador=true;
                }
                else
                {
                    resultado = '✘';
                    comprobador = false;
                }

                pila.clear();
                letras.clear();
            } 
        }
               
        return comprobador;
    }
    
    public boolean automata5(String palabra){
        boolean comprobador = true;
        char resultado = '\0';
        for (int i = palabra.length() - 1; i >= 0; i--)
            letras.push(palabra.charAt(i));

        pila.push('Z');

        try
        {
            if (letras.peek().equals('a') && pila.peek().equals('Z'))
            {
                letras.pop();
                pila.pop();
                pila.push('A');
            }

            while (letras.size()>0 && letras.peek().equals('a'))
            {
                if (pila.peek().equals('A'))
                {
                    letras.pop();
                    pila.pop();
                    pila.push('B');
                }
                else if (pila.peek().equals('B'))
                {
                    letras.pop();
                    pila.pop(); 
                    pila.push('B');
                    pila.push('A');
                }
            }

            if (pila.size() > 0 && letras.size() > 0 && letras.peek().equals('b') && pila.peek().equals('B'))
            {
                letras.pop();
                pila.pop();
            }

            while (letras.peek().equals('b') && pila.peek().equals('B'))
            {
                letras.pop();
                pila.pop();
            }
        }
        catch (Exception e)
        {
            System.out.println("error aqui "+e);
        }
        finally
        {
            if (pila.size() == 0 && letras.size() == 0)
            {
                resultado = '✔';
                comprobador=true;
            }
            else
            {
                resultado = '✘';
                comprobador = false;
            }
        }
        pila.clear();
        letras.clear();
        return comprobador;
    }
    
    public boolean automata6(String palabra){
        boolean comprobador=true;
        
        char resultado = '\0';
            for (int i = palabra.length() - 1; i >= 0; i--)
                letras.push(palabra.charAt(i));

            pila.push('Z');
            try
            {
                if (letras.peek().equals('a') && pila.peek().equals('Z'))
                {
                    letras.pop();
                    pila.pop();
                    pila.push('A');
                    pila.push('A');
                    pila.push('A');
                    pila.push('A');
                }
                while (letras.peek().equals('a') && pila.peek().equals('A'))
                {
                    letras.pop();
                    pila.pop();
                    pila.push('A');
                    pila.push('A');
                }
                if (letras.peek().equals('b') && pila.peek().equals('A'))
                {
                    letras.pop();
                    pila.pop();
                }
                while (letras.peek().equals('b') && pila.peek().equals('A'))
                {
                    letras.pop();
                    pila.pop();
                }
            }catch(Exception e)
            {
                System.out.println(" "+e);
            }
            finally
            {
                if (pila.size() == 0 && letras.size() == 0)
                {
                    resultado = '✔';
                    comprobador=true;
                }
                else
                {
                    resultado = '✘';
                    comprobador = false;
                }
            }
            pila.clear();
            letras.clear();
        
        return comprobador;
    }
}
