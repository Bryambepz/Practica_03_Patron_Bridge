/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_03_patron_bridge;

import ec.edu.ups.modelo.ElaborarAlimento;
import ec.edu.ups.modelo.ElaborarComida;
import ec.edu.ups.modelo.Hamburguesa;
import ec.edu.ups.modelo.Pizza;

/**
 *
 * @author braya
 */
public class Patron_Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ElaborarAlimento prepararComida = new ElaborarComida(new Pizza());
        prepararComida.obtener();
        
        prepararComida.setImplementador(new Hamburguesa());
        prepararComida.obtener();
    }
    
}
