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
public class Ciudad {
    private String nombre;
    private String provincia;
    
    public Ciudad(String p){
        provincia = p;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerProvincia(String p){
        provincia = p;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerProvincia(){
        return provincia;
    }
}


