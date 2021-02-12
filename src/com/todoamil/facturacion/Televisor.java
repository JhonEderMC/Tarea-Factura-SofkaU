package com.todoamil.facturacion;

public class Televisor extends Electrodomesticos {

    private Integer pulgadas;
    private Boolean tdt;

    public Televisor(String nombre, Character consumo, String procedencia, Integer pulgadas, boolean tdt) {
        super(nombre, consumo, procedencia);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
        super.precio();
        precio();
    }

    /**
     * Calcular precio del televisor
     */
    @Override
    public void precio() {
       Double pre = getPrecio();
       if (pulgadas > 40){ // >40 pulgadas
           pre +=pre*0.3;
       }
       if(tdt){ //si tiene tdt
           pre +=250000;
       }
       setPrecio(pre);
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
