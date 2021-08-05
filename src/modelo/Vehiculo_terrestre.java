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
public class Vehiculo_terrestre extends Vehiculo {
 private String placa,chasis,serie,cilindros,tipo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
     @Override
  public void agregar(){
  System.out.println("Placa: " + getPlaca() );
  System.out.println("Chasis: " + getChasis() );
  System.out.println("Serie: " + getSerie() );
  System.out.println("Cilindros: " + getCilindros() );
  System.out.println("Tipo: " + getTipo() );
  System.out.println("Marca: " + this.getMarca() );
  System.out.println("Modelo: " + this.getModelo() );
  System.out.println("Color: " + this.getColor() );
  System.out.println("Precio: " + this.getPrecio() );
  System.out.println("Motor: " + this.getMotor() );
  System.out.println("Tipo de Gasolina: " + this.getGasolina() );
  System.out.println("Peso: " + this.getPeso() );
  
  }
}