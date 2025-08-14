/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roberto Flores Reyes
 */
public class Aereo extends Transporte{
    
    
    private String medioSustencion;
    
    
    public Aereo(){}
    
    public Aereo(String nombreV, double precio, boolean garantia, String tipo,
            boolean disponibilidad,String funcion,String terreno, String compania,
            String aniosGarantia, String medioSustencion){
    
            super(nombreV, precio, garantia, tipo, disponibilidad, funcion, terreno, compania, aniosGarantia);
            
            this.medioSustencion = medioSustencion;
    }

    public String getMedioSustencion() {
        return medioSustencion;
    }

    public void setMedioSustencion(String medioSustencion) {
        this.medioSustencion = medioSustencion;
    }
    
    
    
    
    public void mostrarSustencion(){
    
    
        System.out.println("Este transporte aereo posee " + this.medioSustencion
                           + " como sustecion.");
    
    }
    
    @Override
    public void compraTransporte(){
        if(this.isDisponibilidad() == true){
            super.compraTransporte();
            System.out.print(" - " + this.getNombreV() + " con " + this.medioSustencion
                             + " de sustencion ");
            
            
        }
    
    }
    
    
}
