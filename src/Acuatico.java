/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roberto Flores Reyes
 */
public class Acuatico extends Transporte{
    
    
    private String propulsion;
    private String aguaTipo;
    
    public Acuatico(){}
    
    public Acuatico(String nombreV, double precio, boolean garantia, String tipo,
            boolean disponibilidad,String funcion,String terreno, String compania,
            String aniosGarantia, String propulsion,String aguaTipo){
    
            super(nombreV, precio, garantia, tipo, disponibilidad, funcion, terreno, compania, aniosGarantia);
            this.propulsion = propulsion;
            this.aguaTipo = aguaTipo;
            
    }

    public String getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    public String getAguaTipo() {
        return aguaTipo;
    }

    public void setAguaTipo(String aguaTipo) {
        this.aguaTipo = aguaTipo;
    }
    
    public void verificaAgua(){
    
        if(this.aguaTipo == "Salada" || this.aguaTipo == "salada"){
        
            System.out.println("Este vehiculo acuatico se encuentra en aguas saladas.");
        
        }else if(this.aguaTipo == "dulce" || this.aguaTipo == "Dulce"){
            
            System.out.println("Este vehiculo acuatico se encuentra en aguas dulces.");
        
        
        }else{
        
            System.out.println("ERROR: Agua desconocida para este vehiculo.");
            
        }
        
    
    }
    
    @Override
    public void compraTransporte(){
        super.compraTransporte();
        if(this.isDisponibilidad() == true){
            System.out.print(" - " + this.getNombreV() + " con una propulsion "
                            + this.propulsion + " integrada");
        }
        
    
    }
    
    
}
