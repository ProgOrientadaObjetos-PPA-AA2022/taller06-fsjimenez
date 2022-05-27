/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;
import paquete02.*;

/**
 *
 * @author Usuario iTC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreH;
        String direccion;
        String ciudad;
        String provincia;
        Medico[] medico;
        Enfermero[] enfermero;
        int esp;
        int numeroMed;
        int numeroEnf;
        String nombreM;
        String especialidad;
        double sueldo;
        String tipo;
        
        
        System.out.println("Ingrese el nombre del hospital");
        nombreH = entrada.nextLine();
        System.out.println("Ingrese la direccion");
        direccion = entrada.nextLine();
        System.out.println("Ingrese la ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la provincia");
        provincia = entrada.nextLine();
        System.out.println("Ingrese el número de especialidades");
        esp = entrada.nextInt();
        System.out.println("Ingrese el número de médicos");
        numeroMed = entrada.nextInt();
        
        medico = new Medico[numeroMed];
        
        int j = 1;
        double sumaSueldos = 0;
        
        for (int i = 0; i < numeroMed; i++) {
            System.out.println("Ingrese el nombre del médico " + j);
            entrada.nextLine();
            nombreM = entrada.nextLine();
            System.out.println("Ingrese la especialidad del médico " + j);
            especialidad = entrada.nextLine();
            System.out.println("Ingrese el sueldo del médico " + j);
            sueldo = entrada.nextDouble();
            
            sumaSueldos += sueldo;
            
            Medico medic = new Medico(nombreM, especialidad);
            medic.establecerSueldo(sueldo);
            
            medico[i] = medic;
            
            j++;
        }
        
        System.out.println("Ingrese el numero de enfermeros");
        numeroEnf = entrada.nextInt();
        
        enfermero = new Enfermero[numeroEnf];      
        j = 1;
        
        for (int i = 0; i < numeroEnf; i++) {

            System.out.println("Ingrese el nombre del enfermero " + j);
            entrada.nextLine();
            nombreM = entrada.nextLine();
            System.out.println("Ingrese el tipo del enfermero " + j);
            tipo = entrada.nextLine();
            System.out.println("Ingrese el sueldo del enfermero " + j);
            sueldo = entrada.nextDouble();
            
            sumaSueldos += sueldo;
            
            Enfermero enf = new Enfermero(nombreM, tipo);
            enf.establecerSueldo(sueldo);
            
            enfermero[i] = enf;
            
            j++;
        }
        
        //do {
            //System.out.println("");
        //} while (bandera);
        
        
        
        
        //Medico[] medico = {med1, med2, med3};
        //Enfermero[] enfermero = {enf1, enf2, enf3};

        Ciudad ciudad1 = new Ciudad(provincia); 
        ciudad1.establecerNombre(ciudad);
        
        Hospital hospital1 = new Hospital(medico, enfermero);
        //ciudad1.establecerProvincia(provincia);
        hospital1.establecerSumaSueldos(sumaSueldos);
        hospital1.establecerCiudad(ciudad1);
        hospital1.establecerNumeroEsp(esp);
        hospital1.establecerDireccion(direccion);
        hospital1.establecerNombre(nombreH);
        
        System.out.printf("%s", hospital1);

    }

}
