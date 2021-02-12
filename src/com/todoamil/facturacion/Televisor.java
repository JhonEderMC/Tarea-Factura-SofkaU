package com.todoamil.facturacion;

public class Televisor extends Electrodomesticos {

    private Integer pulgadas;
    private boolean tdt;

    public Televisor(String nombre, Character consumo, String procedencia, Integer pulgadas, boolean tdt) {
        super(nombre, consumo, procedencia);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
}