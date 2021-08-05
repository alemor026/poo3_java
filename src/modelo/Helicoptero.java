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
public class Helicoptero extends Vehiculo_aereo {
    private String no_helices;

    public String getNo_helices() {
        return no_helices;
    }

    public void setNo_helices(String no_helices) {
        this.no_helices = no_helices;
    }
    
    @Override
  public void agregar(){
  System.out.println("No. de helices: " + getNo_helices());
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
