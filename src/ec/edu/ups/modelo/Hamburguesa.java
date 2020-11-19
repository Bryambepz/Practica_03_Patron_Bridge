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
public class Hamburguesa implements IElaborar{

    public Hamburguesa() {}
    
    @Override
    public void procesar() {
        System.out.println("Hamburguesa elaborada");
    }
    
}
