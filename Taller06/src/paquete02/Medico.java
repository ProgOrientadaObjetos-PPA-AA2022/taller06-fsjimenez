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
public class Medico {
    private String nombre;
    private String especialidad;
    private double sueldo;
    
    public Medico(String n, String e){
        nombre = n;
        especialidad = e;
        sueldo = 1200;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerEsp(String p){
        especialidad = p;
    }
    
    public void establecerSueldo(double s){
        sueldo = s;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerEsp(){
        return especialidad;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
}
