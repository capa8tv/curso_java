    
package tv.capa8.carpeta;



public class Ejemplo_1 
 {
     
     public static void main (String[] args)
     {
         int datoEntero = 4534543;
         byte datoByte= 127;
         short datoShort = 32000;
         long datoLong = 13000L;
         
         double datoDouble=123.4;
         float datoFloat =123.4f;
         boolean datoBooleano = false;
         
         String cadena="César";
         int largo =cadena.length();
         double rango1=Math.random();
         int rango2 = (int)(Math.random()*5); 
         
        // System.out.println("Hola mundo desde Java");
        // System.out.println("el valor entero = " + datoEntero);//concatenación
         //System.out.println("el valor byte es = "+ datoByte);
         System.out.println("el valor short es = "+ datoShort);
         //System.out.println("el valor long es = "+ datoLong);
         //System.out.println("el valor double es = "+ datoDouble);
         //System.out.println("el valor float es = "+ datoFloat);
         //System.out.println("el valor boolean es = "+ datoBooleano);
         System.out.println("el valor String = "+cadena);
         System.out.println("el largo de cadena ="+largo);
         System.out.println("el valor random1 = "+rango1);
         System.out.println("el valor random2 = "+rango2);
        
     }
     
 }

