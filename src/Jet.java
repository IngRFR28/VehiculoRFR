/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roberto Flores Reyes
 */
public class Jet extends Aereo{
    
    
    private String apodo;
    private int asientos;
    private int motoresN;
    private int banios;
    private int salidasEmer;
    private boolean entretenimiento;
    
    public Jet(){}
    
    public Jet(String nombreV, double precio, boolean garantia, String tipo,
            boolean disponibilidad,String funcion,String terreno, String compania,
            String aniosGarantia, String medioSustencion, String apodo, int motoresN,
            int banios, int salidasEmer, boolean entretenimiento){
            
        
            super(nombreV, precio, garantia, tipo, disponibilidad, funcion, terreno, compania, aniosGarantia,
                 medioSustencion);
            
            this.apodo = apodo;
            this.motoresN = motoresN;
            this.banios = banios;
            this.salidasEmer = salidasEmer;
            this.entretenimiento = entretenimiento;
                    
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getMotoresN() {
        return motoresN;
    }

    public void setMotoresN(int motoresN) {
        this.motoresN = motoresN;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public int getSalidasEmer() {
        return salidasEmer;
    }

    public void setSalidasEmer(int salidasEmer) {
        this.salidasEmer = salidasEmer;
    }

    public boolean isEntretenimiento() {
        return entretenimiento;
    }

    public void setEntretenimiento(boolean entretenimiento) {
        this.entretenimiento = entretenimiento;
    }
    
    public void encenderEntre(){
    
    
        if(entretenimiento != false){
        
            System.out.println("El entretenimiento esta encendido!");
        
        }else{
    
            System.out.println("No hay entretenimiento para este modelo.");
        }
    
    }
    
    public void encenderMotores(){
    
        for(int i = 0;i<this.motoresN;++i){
        
            System.out.println("Motor " + (i+1) + " encendido");
            
        }
        
        System.out.println("Motores encendidos.");
        
        
    }
    
   
    @Override
    public void compraTransporte(){
    
        if(this.isDisponibilidad() == true){
            super.compraTransporte();
            
            System.out.println(" se ha realizado con exito.");
            System.out.println("Aca su RESUMEN\n" +
                                "Apodo personalizado: " + this.apodo + "\n"
                                + "Entretenimiento: " + this.isDisponibilidad() +"\n"
                                + "Banios: " + this.getBanios() + "\n"
                                + "Salidas de Emergencia: " + this.getSalidasEmer() + "\n"
                                + "Compania: " + this.getCompania() + "\n"
                                + "Medio de sustencion: " + this.getMedioSustencion() + "\n"
                                + "TOTAL A PAGAR: " + this.getPrecio() +"\n");
                                
        
        }else{
        
            System.out.println("El vehiculo aereo que busca no esta disponible, favor de elegir otro modelo.");
        
        }
    
    
    }
    
    
    
}
