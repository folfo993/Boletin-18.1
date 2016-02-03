/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18.pkg1;

/**
 *
 * @author FOLFO
 */
public class Metodos {
    int[] numeros = new int[6];
    
    public void crearArray(){
        for (int i = 0; i < 6; i++) {
            double random = Math.random() * 50 + 1;
            numeros[i] = (int) random;           
            System.out.println("Elemento " + (i + 1) + "-->" + numeros[i]);
        }
         System.out.println("\n");                          
    }
    
    public void mostrarArray(){
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Elemento " + (i + 1) + "-->" + numeros[i]);
        }
    }
}
