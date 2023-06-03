
package com.mycompany.arbol_1;

public class NodoArbol {
    protected Object dato;
    NodoArbol izquierdo;
    NodoArbol derecho;
    
    public NodoArbol(Object valor){
        this.dato= valor;
        this.izquierdo = null;
        this.derecho = null;
    }
    
    public NodoArbol(NodoArbol ramaizq, Object valor, NodoArbol ramader){
        this.dato = valor;
        this.izquierdo = ramaizq;
        this.derecho = ramader;
    }
    
    public Object ValorNodo(){
        return dato;
    }
    
    public NodoArbol SubarbolIzq(){
        return izquierdo;
    }
    
    public NodoArbol SubArbolder(){
        return derecho;
    }
    
    public void nuevoValor(Object d){
        dato = d;
    }
    
    public void ramaIzq(NodoArbol n){
        izquierdo = n;
    }
    
    public void ramaDer(NodoArbol n){
        derecho = n;
    }
}
