/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package ejercicioaprendizaje8;

import java.util.Scanner;

public class EjercicioAprendizaje8 {
    public static void main(String[] args) {
        String frase;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa una palabra ofrase: ");
        frase = entrada.nextLine();
        
        if(frase.length()>8){
            System.out.println("INCORRECTO");
        }else{
            System.out.println("CORRECTO");
        }
    }
    
}
