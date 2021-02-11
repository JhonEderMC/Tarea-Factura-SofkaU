package com.todoamil.facturacion;

public abstract class Electrodomesticos {
   private String nombre;
   private Character consumo;
   private String procedencia;
   private  Double precio;

    public Electrodomesticos(String nombre, Character consumo, String procedencia) {
        this.nombre = nombre;
        this.consumo = consumo;
        this.procedencia = procedencia;
    }

    /*
        Calcular el precio del electrodomestico
     */
    public void precio(){
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
