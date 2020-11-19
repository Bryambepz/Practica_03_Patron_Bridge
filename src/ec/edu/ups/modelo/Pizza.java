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
public class Pizza implements IElaborar{

    public Pizza() {}
    
    @Override
    public void procesar() {
        System.out.println("Pizza elaborada");
    }
    
}
