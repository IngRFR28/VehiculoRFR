/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Roberto Flores Reyes
 */
public class ejecutableV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Primero se hace la prueba con un taxi al menos
        Taxi taxi1 = new Taxi("Taxi Moderno", 50000, true, "Terrestre", true, "Publico",
                             "Asfalto","Nissan","5","4","4x2","lisas","123","CDMX",50,5,
                              true);
        
        
        taxi1.compraTransporte();
        taxi1.controlTaximetro(); //Esto es solo una funcion única para el taxi
        taxi1.llantasDisponibles(); //Este es una función única de vehiculos terrestres
        
        
        System.out.println("\n");
        
        
        
        Jet jet1 = new Jet("Jet A4500",1000000,true, "Aereo", true,"Privado",
                           "Nacional", "Necos voladores","10","Alas","Red Robin",
                            5,2,1,true);
        
        jet1.compraTransporte();
        jet1.encenderEntre();
        jet1.encenderMotores();
        jet1.mostrarSustencion();
        
        
        System.out.println("\n");
        
        
        
    }
    
}
