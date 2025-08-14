/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roberto Flores Reyes
 */
public class Transporte {
    private String nombreV;
    private double precio;
    private boolean garantia;
    private String tipo;
    private boolean disponibilidad;
    private String funcion;
    private String terreno;
    private String compania;
    private String aniosGarantia;
    
    public Transporte(){
    }
    public Transporte(String nombreV, double precio, boolean garantia, String tipo,
            boolean disponibilidad,String funcion,String terreno, String compania,
            String aniosGarantia){
    
            this.nombreV = nombreV;
            this.precio = precio;
            this.garantia = garantia;
            this.tipo = tipo;
            this.disponibilidad = disponibilidad;
            this.funcion = funcion;         
            this.terreno = terreno;
            this.compania = compania;
            this.aniosGarantia = aniosGarantia;
    
    }

    public String getNombreV() {
        return nombreV;
    }

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getAniosGarantia() {
        return aniosGarantia;
    }

    public void setAniosGarantia(String aniosGarantia) {
        this.aniosGarantia = aniosGarantia;
    }
    
    public void compraTransporte(){
    
        if(this.disponibilidad == true){
        
            System.out.print("Felicidades! La compra del vehiculo " + tipo);
        
        }
    
    }
    
    
    
    
    
    
    
    
}
