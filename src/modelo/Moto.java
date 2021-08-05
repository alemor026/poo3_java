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
public class Moto extends Vehiculo_terrestre {

    private String velocidades, tipo_moto, capacidad;

    public String getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(String velocidades) {
        this.velocidades = velocidades;
    }

    public String getTipo_moto() {
        return tipo_moto;
    }

    public void setTipo_moto(String tipo_moto) {
        this.tipo_moto = tipo_moto;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void agregar() {
        System.out.println("Velocidades: " + getVelocidades());
        System.out.println("Tipo de moto: " + getTipo_moto());
        System.out.println("Capacidad: " + getCapacidad());
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Chasis: " + this.getChasis());
        System.out.println("Serie: " + this.getSerie());
        System.out.println("Cilindros: " + this.getCilindros());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Color: " + this.getColor());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Motor: " + this.getMotor());
        System.out.println("Tipo de Gasolina: " + this.getGasolina());
        System.out.println("Peso: " + this.getPeso());

    }
}
