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
public abstract class ElaborarAlimento {
    IElaborar implementador;

    public ElaborarAlimento() {}

    public IElaborar getImplementador() {
        return implementador;
    }

    public void setImplementador(IElaborar implementador) {
        this.implementador = implementador;
    }
    
    //Metodo abstracto
    public abstract void obtener();
    
}
