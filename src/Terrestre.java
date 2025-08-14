/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roberto Flores Reyes
 */
public class Terrestre extends Transporte{
    
    private String llantasN;
    private String traccion;
    private String neumaticos;
    
    public Terrestre(){}

    public Terrestre(String nombreV, double precio, boolean garantia, String tipo, boolean disponibilidad, 
            String funcion, String terreno, String compania, String aniosGarantia,
            String llantasN, String traccion, String neumaticos) {
        super(nombreV, precio, garantia, tipo, disponibilidad, funcion, terreno, compania, aniosGarantia);
        this.llantasN = llantasN;
        this.traccion = traccion;
        this.neumaticos = neumaticos;
    }

    public String getLlantasN() {
        return llantasN;
    }

    public void setLlantasN(String llantasN) {
        this.llantasN = llantasN;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public String getNeumaticos() {
        return neumaticos;
    }

    public void setNeumaticos(String neumaticos) {
        this.neumaticos = neumaticos;
    }
    
    
    //A partir de acá están las funciones de mi código
    
    public void llantasDisponibles(){
    
    
        System.out.println("Usted cuenta con " + this.llantasN + " llantas.");
    
    
    }
   
    @Override
    public void compraTransporte(){
        super.compraTransporte();
        
        if( this.isDisponibilidad() == true){
        
            System.out.print(" - " + this.getNombreV() + " con " + this.traccion + " de traccion");
        
        }else{
        
            super.compraTransporte();
        
        }
    
    }
    

    
}   
