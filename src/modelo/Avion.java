/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuaria
 */
public class Avion extends Vehiculo_aereo {
    private String aereolinea, alas;
    
    public String getAereolinea() {
        return aereolinea;
    }

    public void setAereolinea(String aerolinea) {
        this.aereolinea = aereolinea;
    }

    public String getAlas() {
        return alas;
    }

    public void setAlas(String alas) {
        this.alas = alas;
    }
    
          @Override
  public void agregar(){
  System.out.println("Aerolinea: " + getAereolinea() );    
  System.out.println("Alas: " + getAlas() );
  System.out.println("Tren de aterrizaje: " + this.getTren_aterrizaje() );
  System.out.println("Tipo de Transporte: " + this.getTipo_transporte() );
  System.out.println("Altitud Maxima: " + this.getAltitud_maxima() ); 
  System.out.println("Marca: " + this.getMarca() );
  System.out.println("Modelo: " + this.getModelo() );
  System.out.println("Color: " + this.getColor() );
  System.out.println("Precio: " + this.getPrecio() );
  System.out.println("Motor: " + this.getMotor() );
  System.out.println("Tipo de Gasolina: " + this.getGasolina() );
  System.out.println("Peso: " + this.getPeso() );
  }
}
