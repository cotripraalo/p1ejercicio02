/*
 * Ejercicio2
  */
package p1ejercicio02;

import java.util.Scanner;
/**
 *
 * @author ALONDRA COTRINA
 */
public class P1ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creando Scanner
      Scanner input=new Scanner(System.in);
        System.out.println("INGRESE UN TEXTO:");
        String text=input.nextLine();
        int espacios=0,letras=0,signos=0,numero=0;
            
        for (int i = 0; i < text.length(); i++) 
        {
           if(text.charAt(i)==' ')
           {
               espacios++;               
           }
           letras=text.length();
           if(text.charAt(i)=='/'||text.charAt(i)=='+'||text.charAt(i)=='-'||text.charAt(i)=='*')
           {
               signos++;
           }
           if(Character.isDigit(text.charAt(i)) == true)
           {
               numero++; 
           }
        }
        int palabras =espacios + 1;
        System.out.println("PALABRAS: "+ palabras);
        System.out.println("LETRAS: "  + (letras - espacios));
        System.out.println("NUMEROS: " + numero);
        System.out.println("SIMBOLOS: " + signos);
        System.out.println("ESPACIOS: " + espacios);
    }
    
}
