package com.mycompany.arbol_1;

public class ListaArbol {

    NodoArbol raiz;

    public ListaArbol() {
        raiz = null;
    }

    public ListaArbol(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public NodoArbol RaizArbol() {
        return raiz;
    }

    public boolean vacio() {
        return raiz == null;
    }

    public NodoArbol nuevoArbol(NodoArbol ramaizq, Object dato, NodoArbol ramader) {
        return new NodoArbol(ramaizq, dato, ramader);
    }

    public void mostrarArbolRecursivo(NodoArbol nodo, String prefijo) {
        if (nodo != null) {
            System.out.println(prefijo + "|-- " + nodo.dato);

            // Calcular el prefijo para los hijos
            String prefijoHijos = prefijo + "|   ";
           

            mostrarArbolRecursivo(nodo.izquierdo, prefijoHijos + "|-- ");
            mostrarArbolRecursivo(nodo.derecho, prefijoHijos + "--- ");
        }
    }
}
