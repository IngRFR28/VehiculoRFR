/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roberto Flores Reyes
 */
public class Taxi extends Terrestre{
    
    private String nLicencia;
    private String ciudad;
    private double tarifa;
    private double costoKM;
    private boolean taximetro;
    
    
    public Taxi(){}
    
    
    public Taxi(String nombreV, double precio, boolean garantia, String tipo, boolean disponibilidad, 
            String funcion, String terreno, String compania, String aniosGarantia,
            String llantasN, String traccion, String neumaticos, String nLicencia,
            String ciudad, double tarifa,double costoKM,boolean taximetro){
            
            super(nombreV, precio, garantia, tipo, disponibilidad, funcion, terreno, compania, aniosGarantia,
                  llantasN, traccion, neumaticos);
            
            this.nLicencia = nLicencia;
            this.ciudad = ciudad;
            this.tarifa = tarifa;
            this.costoKM = costoKM;  
            this.taximetro = taximetro;
                    
            
    }

    public String getnLicencia() {
        return nLicencia;
    }

    public void setnLicencia(String nLicencia) {
        this.nLicencia = nLicencia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getCostoKM() {
        return costoKM;
    }

    public void setCostoKM(double costoKM) {
        this.costoKM = costoKM;
    }

    public boolean isTaximetro() {
        return taximetro;
    }

    public void setTaximetro(boolean taximetro) {
        this.taximetro = taximetro;
    }
    
    
    public void controlTaximetro(){
    
    
        if(this.taximetro == true && this.isDisponibilidad() == true){
        
            System.out.println("Su taximetro esta encendido!");
      
            
        }else{
            System.out.println("Su taximetro esta apagado!");
        }
    
    }
    
    
    
    @Override
    public void compraTransporte(){
    
        if(this.isDisponibilidad() == true){
            super.compraTransporte();
            System.out.print(" se ha realizado con exito\n");
            System.out.println("Aca su RESUMEN " + "\n" +
                                "No Licencia: " + this.nLicencia + "\n" +
                                "Ciudad a operar: " + this.ciudad + "\n" +
                                "Tarifa: " + this.tarifa + "\n" +
                                "Compania: " + this.getCompania() + "\n" +
                                "Traccion: " + this.getTraccion() + "\n" +
                                "Tipo de llantas: " + this.getNeumaticos() + "\n" +
                                "TOTAL A PAGAR: " + this.getPrecio()  + "\n");
                               
        }else if(this.isDisponibilidad() == false){
                
            System.out.println("El vehiculo no esta disponible, favor de elegir otro del catalogo.");
            
        }
    
    }
    
}
