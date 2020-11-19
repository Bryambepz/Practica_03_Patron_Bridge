/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.interfaz.IElaborar;

/**
 *
 * @author braya
 */
public class ElaborarComida extends ElaborarAlimento{

    public ElaborarComida(IElaborar implementador) {
        this.setImplementador(implementador);
    }

    @Override
    public void obtener() {
        System.out.println("Preparando comida. . .");
        this.getImplementador().procesar();
    }
    
}
