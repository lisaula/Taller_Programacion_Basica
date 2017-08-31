/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioClase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author isaula
 */
public class java {
    
    public static void main(String[] args){
        ArrayList<String> alumnos_nombre = new ArrayList<String>();
        ArrayList<Integer> alumnos_nota = new ArrayList<Integer>();
        Scanner lea = new Scanner(System.in);
        boolean exit = false;
        while(exit == false){
            
            System.out.println("1. Ingresar Alumno");
            System.out.println("2. Buscar Alumno");
            System.out.println("3. Modificar nota Alumno");
            System.out.println("4. Realizar la media de todas las notas.");
            System.out.println("5. Realizar la media menores de 5 las notas.");
            System.out.println("6. Mejor Alumno.");
            System.out.println("7. Peor Alumno.");
            System.out.println("8. Cerrar programa.");
            int opcion = lea.nextInt();
            
            switch(opcion){
                case 8: 
                    System.out.println("Adios");
                    exit = true;
                break;
                case 1:
                    int limite = 3;
                    System.out.println("Debe ingresar "+limite+" alumnos");
                    for(int i = 0; i < limite; i++){
                        System.out.println("Ingresando alumno "+(i+1));
                        System.out.print("Nombre: ");
                        String nombre = lea.next();
                        System.out.print("Nota: ");
                        int nota = lea.nextInt();
                        alumnos_nombre.add(nombre);
                        alumnos_nota.add(nota);
                    }
                break;
                case 2:
                    System.out.print("Nombre: ");
                    String nombre = lea.next();
                    if(alumnos_nombre.contains(nombre)){
                        System.out.println(nombre);
                        int index = alumnos_nombre.indexOf(nombre);
                        System.out.println(alumnos_nota.get(index));
                    }else{
                        System.out.println("No existe.");
                    }
                break;
                case 3:
                    System.out.print("Nombre: ");
                    String n = lea.next();
                    if(alumnos_nombre.contains(n)){
                        int index = alumnos_nombre.indexOf(n);
                        System.out.print("Nota: ");
                        int nueva_nota = lea.nextInt();
                        alumnos_nota.set(index, nueva_nota);
                    }else
                        System.out.println("No existe");
                break;
                case 5:
                    int sumadora = 0;
                    int contador =0;
                    for(int i =0; i < alumnos_nota.size(); i++){
                        int nota = alumnos_nota.get(i);
                        if(nota < 5){
                            sumadora += nota;
                            contador++;
                        }
                    }
                    System.out.println("Suma de todos: "+sumadora);
                    int media = sumadora / contador;
                    System.out.println("La media de alumnos con nota menor a 5 es: "+media);
                break;
                case 6:
                    int nota=0;
                    int index=0;
                    for(int i =0; i < alumnos_nota.size();i++){
                        if(nota < alumnos_nota.get(i)){
                            nota = alumnos_nota.get(i);
                            index = i;
                        }
                    }
                    System.out.println("Alumno: "+alumnos_nombre.get(index)+" con nota: "+nota+" es el mejor.");;
                break;
            }   
        }
        System.out.println("Hola mundo");
    }
}
