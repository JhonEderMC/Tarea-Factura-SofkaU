package com.todoamil;

import com.todoamil.productos.Electrodomesticos;
import com.todoamil.productos.Nevera;
import com.todoamil.productos.Televisor;
import com.todoamil.ventas.Ventas;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*
        Nevera nevera = new Nevera("Mavel",'A', "Importado", 170);
        System.out.println(nevera.getPrecio());
        Televisor televisor = new Televisor("Kalley", 'A', "Importado", 50,true);
        System.out.println(televisor.getPrecio());
        ArrayList<Electrodomesticos> array = new ArrayList<Electrodomesticos>();
        array.add(nevera);
        array.add(televisor);
        //System.out.println(nevera instanceof Televisor);
        System.out.println(televisor instanceof Televisor);
        System.out.println(nevera.getClass());
        System.out.println(televisor.getClass());
        System.out.println(televisor.getClass());
        System.out.println(nevera.getClass().equals(Nevera.class));

        for (int i=0; i<array.size();i++){
            array.get(i).getNombre();
            System.out.println(array.get(i));
        }

         */
        Ventas ventas = new Ventas();
        ventas.menu();

    }
}
