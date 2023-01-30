/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteModelo;

import java.awt.Color;

/**
 *
 * @author matut
 */
public class FichaCadrada extends Ficha {

    //CONSTRUCTOR
    public FichaCadrada(Xogo xogo) {
        super(xogo);
        Cadrado cadrado1 = new Cadrado(150, 0, Color.RED);
        Cadrado cadrado2 = new Cadrado(cadrado1.getX() + xogo.LADO_CADRADO, cadrado1.getY(), Color.RED);
        Cadrado cadrado3 = new Cadrado(cadrado1.getX(), cadrado1.getY() + xogo.LADO_CADRADO, Color.RED);
        Cadrado cadrado4 = new Cadrado(cadrado3.getX() + xogo.LADO_CADRADO, cadrado2.getY() + xogo.LADO_CADRADO, Color.RED);
        cadrados.add(cadrado1);
        cadrados.add(cadrado2);
        cadrados.add(cadrado3);
        cadrados.add(cadrado4);

    }

    //METODOS
    @Override
    public boolean rotar() {
        return false;
    }

}
