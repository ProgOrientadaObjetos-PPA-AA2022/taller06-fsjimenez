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
        boolean bandera = true;
        String direccion;
        String ciudad;
        String provincia;
        int esp;

        
        
        Medico med1 = new Medico("Lionel Messi", "Ginecólogo");
        Medico med2 = new Medico("Felipe Jiménez", "Oftalmologo");
        Medico med3 = new Medico("Antonio Valencia", "Dermatologo");

        Enfermero enf1 = new Enfermero("Lionel Messi", "Practicante");
        Enfermero enf2 = new Enfermero("Felipe Jiménez", "Contratado");
        Enfermero enf3 = new Enfermero("Antonio Valencia", "Nombramiento");
        
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
        //do {
            //System.out.println("");
        //} while (bandera);
        
        
        
        
        Medico[] medico = {med1, med2, med3};
        Enfermero[] enfermero = {enf1, enf2, enf3};

        Hospital hospital1 = new Hospital(medico, enfermero);
        Ciudad ciudad1 = new Ciudad("Loja");
        
        ciudad1.establecerNombre(ciudad);
        ciudad1.establecerProvincia(provincia);
        
        hospital1.establecerCiudad(ciudad1);
        hospital1.establecerNumeroEsp(esp);
        hospital1.establecerDireccion(direccion);
        hospital1.establecerNombre(nombreH);
        hospital1.establecerMedico(medico);
        hospital1.establecerEnfermero(enfermero);
        
        
        System.out.printf("%s", hospital1);

    }

}
