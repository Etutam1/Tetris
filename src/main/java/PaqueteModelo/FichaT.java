/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteModelo;

/**
 *
 * @author matut
 */
public class FichaT extends Ficha {

    //CONSTRUCTOR
    public FichaT(Xogo xogo) {    
        super(xogo);
    }

    //METODOS
    @Override
    public boolean rotar() {
        return false;
    }

}
