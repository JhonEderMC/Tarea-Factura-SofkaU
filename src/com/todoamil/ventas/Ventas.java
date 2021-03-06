package com.todoamil.ventas;

import com.todoamil.productos.Electrodomesticos;
import com.todoamil.productos.Nevera;
import com.todoamil.productos.Televisor;

import java.util.ArrayList;
import java.util.Scanner;

public class Ventas {

    private ArrayList<Electrodomesticos> productos;

    public Ventas() {
        productos = new ArrayList<Electrodomesticos>();
    }

    public void menu(){
        Boolean parar = Boolean.TRUE;
        do {
            menuLCD();
            Integer opcion = inputInteger();
            parar = menuSwitch(opcion);
        }while(parar);
    }

    public void menuLCD(){

        System.out.println("\n\tTiendas todo a mil");
        System.out.println("Bienvenido al sistema de facturación:");
        System.out.println("1. Gestionar televisor \n2.Gestionar nevera\n3. Gestionar eletrodomestico\n4. Mostrar Factura" +
                "\n5. sair");
    }

    public Boolean menuSwitch(Integer opcion){
        switch (opcion){
            case 1:
                gestionarTelevisor();
                return true;
            case 2:
                gestionarNevera();
                return true;
            case 3:
                gestionarElectrodomestico();
                return true;
            case 4:
               mostrarFactura();
                return true;
            case 5: //salir
                return false;
            default:
                System.out.print("\nPorfavor ingrese una opcion correcta");
                return true;
        }
    }

    public void gestionarTelevisor() {
       Electrodomesticos electrodomestico = electrodomesticobasico();
       System.out.println("\nIngrese las pulgadas(entero):");
       Integer pulgadas = inputInteger();
       System.out.println("\nIngrese Si tiene TDT[Si o No]");
       String tieneTdt = inputString();
       boolean tdt = false;
       if(tieneTdt.equalsIgnoreCase("Si")){
           tdt = true;
       }
       Televisor televisor = new Televisor(electrodomestico.getNombre(), electrodomestico.getConsumo(), electrodomestico.getProcedencia(), pulgadas, tdt);
       productos.add(televisor);
    }

    public void gestionarNevera(){
        Electrodomesticos electrodomestico = electrodomesticobasico();
        System.out.println("Ingrese la capacidad: ");
        Integer capacidad = inputInteger();
        Nevera nevera = new Nevera(electrodomestico.getNombre(), electrodomestico.getConsumo(), electrodomestico.getProcedencia(),capacidad);
        productos.add(nevera);

    }

    public void gestionarElectrodomestico(){
        Electrodomesticos electrodomestico = electrodomesticobasico();
    }

    public void mostrarFactura(){
        Double totalElectro=0.0,totalNevera=0.0, totalTelevi=0.0;
        Double totalElectro2=0.0,totalNevera2=0.0, totalTelevi2=0.0;
        for(Electrodomesticos electro: productos){
            if (electro instanceof  Nevera){
                totalNevera +=electro.getPrecio();
            } else if(electro instanceof  Televisor){
                totalTelevi += electro.getPrecio();
            }else{
                totalElectro +=electro.getPrecio();
            }
        }
        for (int i=0; i<productos.size();i++){
            if(productos.get(i).getClass().equals(Nevera.class)){
                totalNevera2 +=productos.get(i).getPrecio();
            } if(productos.get(i).getClass().equals(Televisor.class)){
                totalTelevi2 +=productos.get(i).getPrecio();
            }else {
                totalElectro +=productos.get(i).getPrecio();
            }
        }
        System.out.print("\nNevera: "+totalNevera+"\nTelevisor: "+totalTelevi+"\nElectro: "+totalElectro);
        System.out.print("\nNevera: "+totalNevera2+"\nTelevisor: "+totalTelevi2+"\nElectro: "+totalElectro2);

    }

    public Electrodomesticos electrodomesticobasico(){
        System.out.println("Ingrese el nombre: ");
        String nombre = inputString();
        System.out.println("Ingrese el consumo [A, B o C]: ");
        Character consumo = inputCharacter();
        System.out.print("Ingre la procedencia [Nacional o Importado]: ");
        String procedencia = inputString();
       Electrodomesticos electrodomestico = new Electrodomesticos(nombre, consumo, procedencia);
       return electrodomestico;
    }


    private Integer inputInteger(){
        Scanner keyBoard = new Scanner(System.in);
        while(!keyBoard.hasNextInt()) keyBoard.next();
        return keyBoard.nextInt();
    }

    private String inputString(){
        Scanner keyBoard = new Scanner(System.in);
        return keyBoard.nextLine();
    }

    private Character inputCharacter(){
        Scanner keyBoard = new Scanner(System.in);
        return (Character) keyBoard.next().charAt(0);//return first character
    }
}
