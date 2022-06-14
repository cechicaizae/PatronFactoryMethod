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
public class Motocicleta implements Transporte{

    @Override
    public void arrancar() {
        System.out.println("Arrancando motocicleta");
    }
    
    @Override
    public void detener() {
        System.out.println("Deteniendo motocicleta");
    }

    @Override
    public String tipo() {
        return "Motocicleta";
    }


    
}
