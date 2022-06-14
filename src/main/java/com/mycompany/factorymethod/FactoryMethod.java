/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.factorymethod;
/**
 *
 * @author ce.christian
 */
public class FactoryMethod {

    public static void main(String[] args) {
        Transporte t1 = Fabrica.construir( tipo: "Automovil");
        t1.arrancar();
        t1.detener();
        System.out.println(t1.tipo());
    }
}
