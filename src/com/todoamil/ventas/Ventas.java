package com.todoamil.ventas;

import java.util.Scanner;

public class Ventas {





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
            case 5:
                return false;
            default:
                System.out.print("\nPorfavor ingrese una opcion correcta");
                return true;
        }
    }

    private void gestionarTelevisor() {

    }


    private Integer inputInteger(){
        Scanner keyBoard = new Scanner(System.in);
        while(!keyBoard.hasNextInt()) keyBoard.next();
        return keyBoard.nextInt();
    }
}
