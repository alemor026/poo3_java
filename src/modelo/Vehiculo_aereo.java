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
public class Vehiculo_aereo extends Vehiculo{
    private String tren_aterrizaje, tipo_transporte,altitud_maxima;

    public String getTren_aterrizaje() {
        return tren_aterrizaje;
    }

    public void setTren_aterrizaje(String tren_aterrizaje) {
        this.tren_aterrizaje = tren_aterrizaje;
    }

    public String getTipo_transporte() {
        return tipo_transporte;
    }

    public void setTipo_transporte(String tipo_transporte) {
        this.tipo_transporte = tipo_transporte;
    }

    public String getAltitud_maxima() {
        return altitud_maxima;
    }

    public void setAltitud_maxima(String altitud_maxima) {
        this.altitud_maxima = altitud_maxima;
    }
         @Override
  public void agregar(){
  System.out.println("Tren de aterrizaje: " + getTren_aterrizaje() );
  System.out.println("Tipo de Transporte: " + getTipo_transporte() );
  System.out.println("Altitud Maxima: " + getAltitud_maxima() ); 
  System.out.println("Marca: " + this.getMarca() );
  System.out.println("Modelo: " + this.getModelo() );
  System.out.println("Color: " + this.getColor() );
  System.out.println("Precio: " + this.getPrecio() );
  System.out.println("Motor: " + this.getMotor() );
  System.out.println("Tipo de Gasolina: " + this.getGasolina() );
  System.out.println("Peso: " + this.getPeso() );
  }
}
