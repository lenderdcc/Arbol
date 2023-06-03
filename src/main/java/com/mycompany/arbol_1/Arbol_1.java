package com.mycompany.arbol_1;

import java.util.Stack;

public class Arbol_1 {

    static Stack pila = new Stack();
    static ListaArbol arbol = new ListaArbol();
    static NodoArbol a1, a2, a;

    public static void main(String[] args) {
        a1 = arbol.nuevoArbol(null, "Kewin", null);
        a2 = arbol.nuevoArbol(null, "Stiv", null);
        a = arbol.nuevoArbol(a1, "Martha", a2);
        pila.push(a);

        a1 = arbol.nuevoArbol(null, "Pipo", null);
        a2 = arbol.nuevoArbol(null, "Vidi", null);
        a = arbol.nuevoArbol(a1, "Chela", a2);
        pila.push(a);

        a1 = (NodoArbol)pila.pop();
        a2 = (NodoArbol)pila.pop();
        a = arbol.nuevoArbol(a1, "Ortencia", a2);
        pila.push(a);
        
        arbol = new ListaArbol(a);
        
        arbol.mostrarArbolRecursivo(a, "");
    }
}
