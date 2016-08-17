/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_2;
import java.util.Scanner;
/**
 *
 * @author Daniel Salinas
 */
public class Actividad_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0; int val;   //Declarando variables     
        Scanner lee = new Scanner(System.in); //se inicia el Scanner 
        System.out.println("¿De cuantos elementos es tu arreglo?"); 
           n =  lee.nextInt(); //Aqui se determina el tamaño del arreglo
           int x[] = new int [n];
            for (int i = 0; i< x.length; i++){ //se pide al usuario rellenar el arreglo
                System.out.println("introduce un numero");
                x[i] =  lee.nextInt();
            }
            System.out.println("Que numero buscas?"); //Aqui se pregunta que valor se busca
            val = lee.nextInt();
          MetodosDeBusqueda.Buscar(x, val); //Se manda a llamar al metodo que buscara el valor
            
        
    }
    
}
