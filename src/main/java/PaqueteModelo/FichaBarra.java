/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteModelo;

/**
 *
 * @author matut
 */
public class FichaBarra extends Ficha {

    //CONSTRUCTOR
    public FichaBarra(Xogo xogo) {    
        super(xogo);
    }

    //METODOS
    @Override
    public boolean rotar() {
        return false;
    }

}
