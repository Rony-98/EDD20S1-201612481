/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneda;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Moneda {

    Scanner sn = new Scanner(System.in);
    ArrayList<String> p = new ArrayList<String>();
    String c = "";

    public static void main(String[] args) {
        Moneda mon = new Moneda();
        mon.usuarios();
        
    }

    public void met() {

        boolean salir = false;
        int op;
        // while (!salir) {
        System.out.println("SELECCIONE UNA OPCION");
        System.out.println("1.Ver Lista de usuarios");
        System.out.println("2.Intercambio de Moneda entre usuarios");
        System.out.println("3.Agregar desde el Banco");
        System.out.println("4.SALIR");

        try {
            op = sn.nextInt();
            switch (op) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("INTENTA DE NUEVO");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un numero");
            sn.next();
        }
        // }

    }

    
    public void usuarios(){
       int moneda = 100;
       
       String m [][] = new String[5][2];
      
       
        for (int i = 0; i < m.length ; i++) {
            System.out.println("");
            for (int j = 0; j < 2; j++) {
                System.out.print("[ ]");
                
            }
        }
        System.out.println("");
}
}