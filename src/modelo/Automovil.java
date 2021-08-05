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
public class Automovil extends Vehiculo_terrestre{
  private String  capacidad;

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
     @Override
  public void agregar(){
  System.out.println("Capacidad: " + getCapacidad() );    
  System.out.println("Placa: " + this.getPlaca() );
  System.out.println("Chasis: " + this.getChasis() );
  System.out.println("Serie: " + this.getSerie() );
  System.out.println("Cilindros: " + this.getCilindros() );
  System.out.println("Tipo: " + this.getTipo() );
  System.out.println("Marca: " + this.getMarca() );
  System.out.println("Modelo: " + this.getModelo() );
  System.out.println("Color: " + this.getColor() );
  System.out.println("Precio: " + this.getPrecio() );
  System.out.println("Motor: " + this.getMotor() );
  System.out.println("Tipo de Gasolina: " + this.getGasolina() );
  System.out.println("Peso: " + this.getPeso() );
  
  }  
}
