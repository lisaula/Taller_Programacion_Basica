/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogramacionbasica;

import java.util.Scanner;

/**
 *
 * @author isaula
 */
public class TallerProgramacionBasica {

    /**
     * @param args the command line arguments
     */
    public void antes_main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        char uno = 'a';
        int dos = 'a';
        System.out.println(dos);
        
        int[] arreglo = new int[4];
        
        int sumadora=0;
        
        for(int i =0; i < arreglo.length;i++){
            System.out.print("Ingrese un numero: ");
            arreglo[i] = lea.nextInt();
            sumadora += arreglo[i];
        }
        System.out.println("Sumadora = "+sumadora);
    }
    
}
