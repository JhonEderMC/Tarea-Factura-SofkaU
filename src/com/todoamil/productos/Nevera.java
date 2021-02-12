

package com.todoamil.productos;

public class Nevera extends Electrodomesticos {

    private Integer capacidad=0;

    public Nevera(String nombre, Character consumo, String procedencia, Integer capacidad) {
        super(nombre, consumo, procedencia);
        this.capacidad = capacidad;
        super.precio();
        precio();
    }

    /**
        Calcular el precio de la nevera segun el numero de listros
     */
    @Override
    public void precio(){
        if (capacidad>120){
            Integer listros= capacidad-120; //cantidad de listros demas que tiene
            Integer cantidad = listros/10;  //veces demas a caborar
            Double prec = getPrecio() + cantidad*getPrecio()*0.05;
            setPrecio(prec);
        }
    }


    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Nevera{" +
                "capacidad=" + capacidad +
                '}';
    }
}
