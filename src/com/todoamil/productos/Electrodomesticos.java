package com.todoamil.productos;

public class Electrodomesticos {
   private String nombre;
   private Character consumo;
   private String procedencia;
   private  Double precio =0.0;

    public Electrodomesticos(String nombre, Character consumo, String procedencia) {
        this.nombre = nombre;
        this.consumo = consumo;
        this.procedencia = procedencia;
    }

    /*
        Calcular el precio del electrodomestico
     */
    public void precio(){
        preciobase(this.consumo, this.procedencia);
    }

    /*
        Calcular el precio base del electodomestico
     */
    private void preciobase(Character consumo, String procedencia){

        switch (consumo){
            case 'A':
                precio += 450000;
                break;
            case 'B':
                precio +=  350000;
                break;
            case 'C':
                precio += 250000;
            default:
                System.out.print("Por favor ingrese un consumo correcto en mayuscula (A, B, C)");
        }

        if (procedencia.equalsIgnoreCase("Importado")){
            precio += 350000;
        }else if(procedencia.equalsIgnoreCase("Nacional")){
            precio += 250000;
        }else {
            System.out.print("Por favor ingresar si el producto es Nacional o importado ");
        }

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

    @Override
    public String toString() {
        return "Electrodomesticos{" +
                "nombre='" + nombre + '\'' +
                ", consumo=" + consumo +
                ", procedencia='" + procedencia + '\'' +
                ", precio=" + precio +
                '}';
    }
}
