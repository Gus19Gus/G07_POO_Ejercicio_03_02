
package com.mycompany.g07_poo_ejercicio_03_02;

/**
 *
 * @author Gus-Gus
 */
public class Principal {

    public static void main(String[] args) {
       var v1 = new Ventana1("INSCRIBETE");
       v1.setVisible(true);
       var v2 = new Ventana2("DATOS PERSONALES");
       v2.setVisible(true);
       var v3 = new Ventana3("INFORMACION DE CARRERA");
       v3.setVisible(true);
       var v4 = new Ventana4("VENTANA CREAR GRUPO");
       v4.setVisible(true);
       var v5 = new Ventana5("VENTANA SEDE");
       v5.setVisible(true);
    }
}
