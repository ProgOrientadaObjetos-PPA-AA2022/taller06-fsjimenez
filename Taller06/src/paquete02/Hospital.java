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
public class Hospital {
    private String nombre;
    private Ciudad ciudad;
    private Medico[] medico;
    private Enfermero[] enfermero;
    private double sueldoTotal;
    private String direccion;
    private int numeroEsp;
    private double sumaSueldos;
    
    public Hospital(Medico[] medic, Enfermero[] enf){
        medico = medic;
        enfermero = enf;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerCiudad(Ciudad c){
        ciudad = c;
    }
    
    public void establecerMedico(Medico[] c){
        medico = c;
    }
    
    public void establecerEnfermero(Enfermero[] e){
        enfermero = e;
    }
    
    public void establecerNumeroEsp(int c){
        numeroEsp = c;
    }
    /*public void calcularSueldo(){
        sueldoTotal = obtenerMedico().obtenerSueldo() + 
                obtenerEnfermero().obtenerSueldo();
    }*/
    
    public void establecerDireccion(String d){
        direccion = d;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerNumeroEsp(){
        return numeroEsp;
    }
    
    public Ciudad obtenerCiudad(){
        return ciudad;
    }
    
    public Medico[] obtenerMedico(){
        return medico;
    }
    
    public Enfermero[] obtenerEnfermero(){
        return enfermero;
    }
    
    public double obtenerSueldo(){
        return sueldoTotal;
    }
    
    public String obtenerDireccion(){
        return direccion;
    }
    
    public void establecerSumaSueldos(double s){
        sumaSueldos = s;
    }
    
    
    @Override
    
    public String toString(){
        String cadena = String.format("%s\nDirección: %s\nCiudad: %s\nProvincia"
                + ": %s\nNúmero de Especialidades: %s\nListado de Médicos\n", 
                obtenerNombre().toUpperCase(),
                obtenerDireccion(),
                obtenerCiudad().obtenerNombre(),
                obtenerCiudad().obtenerProvincia(),
                obtenerNumeroEsp());
        
        for (int i = 0; i < obtenerMedico().length; i++) {
            cadena = String.format("\n%s - %s - sueldo: %s - %s\n", cadena,
                                           obtenerMedico()[i].obtenerNombre(),
                                           obtenerMedico()[i].obtenerSueldo(),
                                           obtenerMedico()[i].obtenerEsp());
        }
        cadena = String.format("%sListado de enfermeros: \n", cadena);
        for (int i = 0; i < obtenerEnfermero().length; i++) {
            cadena = String.format("\n%s - %s - sueldo: %s - %s\n", cadena,
                                           obtenerEnfermero()[i].obtenerNombre(),
                                           obtenerEnfermero()[i].obtenerSueldo(),
                                           obtenerEnfermero()[i].obtenerTipo());
        }
        cadena = String.format("%sSuma de sueldos a pagar: %s", cadena,
                                                        sumaSueldos);
        return cadena;
    }
    
}
