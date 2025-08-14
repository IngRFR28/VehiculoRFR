/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roberto Flores Reyes
 */
public class Barco extends Acuatico{
    
    private String apodo;
    private int motores;
    private int habitaciones;
    private int banios;
    private boolean piscina;
    private int botesSalva;
    private boolean salon;
    private boolean barraAlcohol;
    private boolean salaInfantil;
    
    public Barco(){}
    
    
    public Barco(String nombreV, double precio, boolean garantia, String tipo,
            boolean disponibilidad,String funcion,String terreno, String compania,
            String aniosGarantia, String propulsion,String aguaTipo,
            String apodo,int motores,int habitaciones,int banios,boolean piscina,
            int botesSalva,boolean salon, boolean barraAlcohol,boolean salaInfantil){
            
            super(nombreV, precio, garantia, tipo, disponibilidad, funcion, terreno, 
                    compania, aniosGarantia, propulsion,aguaTipo);
    
            this.apodo = apodo;
            this.motores = motores;
            this.habitaciones = habitaciones;
            this.banios = banios;
            this.piscina = piscina;
            this.botesSalva = botesSalva;
            this.salon = salon;
            this.barraAlcohol = barraAlcohol;
            this.salaInfantil = salaInfantil;
            
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public int getBotesSalva() {
        return botesSalva;
    }

    public void setBotesSalva(int botesSalva) {
        this.botesSalva = botesSalva;
    }

    public boolean isSalon() {
        return salon;
    }

    public void setSalon(boolean salon) {
        this.salon = salon;
    }

    public boolean isBarraAlcohol() {
        return barraAlcohol;
    }

    public void setBarraAlcohol(boolean barraAlcohol) {
        this.barraAlcohol = barraAlcohol;
    }

    public boolean isSalaInfantil() {
        return salaInfantil;
    }

    public void setSalaInfantil(boolean salaInfantil) {
        this.salaInfantil = salaInfantil;
    }
    
    public void verificaPiscina(){
    
        
        if(this.piscina == true){
        
            System.out.println("Este yate cuenta con una piscina.");
        }else{
        
            System.out.println("No hay piscina en este yate");
        }
    
    }
    
    @Override
    public void compraTransporte(){
    
        if(this.isDisponibilidad() == true){
            
            System.out.print(" se ha realizado con exito.");
            
            System.out.println("Aca su RESUMEN  \n"+ 
                                "Apodo: " + this.apodo +"\n" 
                                + "Motores: " + this.motores + "\n"
                                + "Habitaciones: " + this.habitaciones + "\n"
                                + "Banios: " + this.banios + "\n"
                                + "Botes salva vidas: " + this.botesSalva + "\n"
                                + "Propulsion: " + this.getPropulsion() + "\n"
                                + "Tipo de agua para navegacion: " +this.getAguaTipo() + "\n"
                                + "Compania: " + this.getCompania() + "\n"
                                + "PRECIO A PAGAR: " + this.getPrecio() + "\n");
        
        }else{
        
        
            System.out.println("Este vehiculo acuatico no esta disponible.");
        
        
        }
    
    }
    
}
