package com.todoamil.ventas;

import java.util.Scanner;

public class Ventas {



    public void menu(){
        Boolean parar = Boolean.TRUE;
        do {

        }while(parar);
    }

    public void menuLCD(){
        Scanner scanner = new Scanner()
        System.out.println("\tTiendas todo a mil");
        System.out.println("Bienvenido al sistema de facturación:");
        System.out.println("1. Gestionar televisor \n2.Gestionar nevera\n3. Gestionar eletrodomestico\n4. Mostrar Factura" +
                "\n5. sair");
    }

    private Integer inputInteger(){
        Scanner keyBoard = new Scanner(System.in);
        return keyBoard.nextInt();
    }
}
