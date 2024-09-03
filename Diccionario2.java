
package com.mycompany.diccionario;

import java.util.HashMap;
import java.util.Scanner;


public class Diccionario2 {

    public static HashMap<String, String> Bitextos(String idioma) {
        HashMap<String, String> mensajesESP = new HashMap<>();
        mensajesESP.put("Saludo", "Hola");
        mensajesESP.put("PreguntaNumero1", "Ingrese el primer número:");
        mensajesESP.put("PreguntaNumero2", "Ingrese el segundo número:");
        mensajesESP.put("Suma", "La suma de ");
        mensajesESP.put("Mas", " más ");
        mensajesESP.put("Es", " es ");
        
        HashMap<String, String> mensajesENG = new HashMap<>();
        mensajesENG.put("Saludo", "Hi");
        mensajesENG.put("PreguntaNumero1", "Enter the first number:");
        mensajesENG.put("PreguntaNumero2", "Enter the second number:");
        mensajesENG.put("Suma", "The sum of ");
        mensajesENG.put("Mas", " plus ");
        mensajesENG.put("Es", " is ");
        
        switch (idioma) {
            case "Espanol":
                return mensajesESP;
            case "English":
                return mensajesENG;
        }
        return null;
    }
    public static String NumLetrasEs(int numero){
        String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] decenas = {"diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta","noventa"};
            if (numero < 10) {
        return unidades[numero];
    } else if (numero < 100) {
        int decena = numero / 10;
        int unidad = numero % 10;
        return decenas[decena] + (unidad == 0 ? "" : " " + unidades[unidad]);
    }
        return null;
    }        
    public static String NumLetrasIn(int numero){
        String[] unidades = {"cero", "one", "two", "trhee", "four", "five", "six", "seven", "eight", "nine"};
        String[] decenas = {"ten", "twenty", "thirdty", "forty", "fifty", "sixty", "seventy", "eighty","ninenty"};
            if (numero < 10) {
        return unidades[numero];
    } else if (numero < 100) {
        int decena = numero / 10;
        int unidad = numero % 10;
        return decenas[decena] + (unidad == 0 ? "" : " " + unidades[unidad]);
    }         
        return null;
    }
   public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("Selecciona el idioma / Select the language");
    String idioma = lector.next();
    
    HashMap<String, String> textos = Bitextos(idioma);
    System.out.println(textos.get("saludo"));
    System.out.println(textos.get("PreguntaNumero1"));
    int PreguntaNumero1 = lector.nextInt();
    System.out.println(textos.get("PreguntaNumero2"));
    int PreguntaNumero2 = lector.nextInt();
    
    String num1InWords = idioma.equals("English") ? NumLetrasIn(PreguntaNumero1) : NumLetrasEs(PreguntaNumero1);
    String num2InWords = idioma.equals("English") ? NumLetrasIn(PreguntaNumero2) : NumLetrasEs(PreguntaNumero2);
    int sum = (PreguntaNumero1 + PreguntaNumero2);
    String sumInWords = idioma.equals("English") ? NumLetrasIn(sum) : NumLetrasEs(sum);
    
    System.out.println(textos.get("Suma") + num1InWords + textos.get("Mas") + num2InWords + textos.get("Es") + sumInWords);
}
        
        
    }
    
   
        
    
    
        

    
         
    
       



