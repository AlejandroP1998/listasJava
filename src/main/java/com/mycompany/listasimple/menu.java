package com.mycompany.listasimple;
import java.util.Scanner;

public class menu {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bucle = true;
        lista l = new lista();
        do {
            System.out.println("------MENU PRINCIPAL------");
            System.out.println("1.  INSERTAR");
            System.out.println("2.  BUSCAR");
            System.out.println("3.  MODIFICAR");
            System.out.println("4.  ELIMINAR");
            System.out.println("5.  MOSTRAR");
            System.out.println("CUALQUIER OTRA OPCION SALDRA DEL PROGRAMA");
            int opcion = sc.nextInt();
            int dato;
            switch (opcion) {
                case 1:
                    System.out.println("INSERTAR");
                    System.out.println("Ingrese un numero entero");
                    dato = sc.nextInt();
                    l.insertar(dato);
                    break;
                case 2:
                    System.out.println("BUSCAR");
                    System.out.println("Ingrese el dato a buscar");
                    dato = sc.nextInt();
                    l.buscar(dato);
                    break;
                case 3:  
                    System.out.println("MODIFICAR");
                    System.out.println("Ingrese el dato a modificar");
                    dato = sc.nextInt();
                    l.modificar(dato);
                    break;
                case 4:   
                    System.out.println("ELIMINAR");
                    System.out.println("Ingrese el dato a eliminar");
                    dato = sc.nextInt();
                    l.eliminar(dato);
                    break;
                case 5:   
                    System.out.println("MOSTRAR");
                    l.mostrar();
                    break;    
                default:
                    bucle = false;
            }
        } while (bucle == true);
        
    
    }
    
}
