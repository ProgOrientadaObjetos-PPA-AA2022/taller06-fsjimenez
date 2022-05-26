/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author Usuario iTC
 */
public class Enfermero {
    private String nombre;
    private String tipo;
    private double sueldo;
    
    public Enfermero(String n, String t){
        nombre = n;
        tipo = t;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerTipo(String p){
        tipo = p;
    }
    
    public void establecerSueldo(double s){
        sueldo = s;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
}
