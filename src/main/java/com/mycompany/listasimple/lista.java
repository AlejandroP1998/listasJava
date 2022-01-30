package com.mycompany.listasimple;

import java.util.Scanner;

public class lista {
    nodo primero;
    nodo ultimo;
    Scanner sc = new Scanner(System.in);
    public lista(){
        primero = null;
        ultimo = null;
    }
    public void insertar(int dato){
        nodo nuevo = new nodo();
        nuevo.dato = dato;
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = null;
            ultimo = primero;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
    }
    public void buscar(int dato){
        nodo actual = new nodo();
        actual = primero;
        while (actual != null) {
            if (actual.dato == dato) {
                System.out.println("El elemento "+dato+" existe en la lista");
                break;
            }
            actual = actual.siguiente;
            if (actual == null){
                System.out.println("No se encontro el elemento en la lista");
            }
        }
    }
    
    public void modificar(int dato){
        nodo actual = new nodo();
        actual = primero;
        while (actual != null) {
            if (actual.dato == dato) {
                System.out.println("El elemento "+dato+" existe en la lista");
                System.out.println("Ingrese el nuevo valor");
                actual.dato = sc.nextInt();
                System.out.println("Dato modificado correctamente");
                break;
            }
            actual = actual.siguiente;
            if (actual == null){
                System.out.println("No se encontro el elemento en la lista");
            }
        }
    }
    
    public void eliminar(int dato){
        nodo actual = new nodo();
        nodo anterior = new nodo();
        actual = primero;
        while (actual != null) {
            if (actual.dato == dato) {
                System.out.println("El elemento "+dato+" existe en la lista");
                if(actual == primero){
                    primero = primero.siguiente;
                }else{
                    anterior.siguiente = actual.siguiente;
                }
                break;
            }
            anterior = actual;
            actual = actual.siguiente;
            if (actual == null){
                System.out.println("No se encontro el elemento en la lista");
            }
        }
    }
    
    public void mostrar(){
        nodo actual = new nodo();
        actual = primero;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
    
}
