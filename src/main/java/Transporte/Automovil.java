/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

import com.mycompany.factorymethod.Transporte;

/**
 *
 * @author ce.christian
 */
public class Automovil implements Transporte {

    @Override
    public void arrancar() {
        System.out.println("Arrancando automovil");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo automovil");
    }

    @Override
    public String tipo() {
        return "Automovil";
    }

    
}
