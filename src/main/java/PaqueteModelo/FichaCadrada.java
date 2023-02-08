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

    public Cadrado cadrado1 = new Cadrado(xogo.MAX_X/2, xogo.MIN_Y, Color.RED);
    public Cadrado cadrado2 = new Cadrado(cadrado1.getX() + xogo.LADO_CADRADO, cadrado1.getY(), Color.RED);
    public Cadrado cadrado3 = new Cadrado(cadrado1.getX(), cadrado1.getY() + xogo.LADO_CADRADO, Color.RED);
    public Cadrado cadrado4 = new Cadrado(cadrado3.getX() + xogo.LADO_CADRADO, cadrado2.getY() + xogo.LADO_CADRADO, Color.RED);

    //CONSTRUCTOR
    public FichaCadrada(Xogo xogo) {
        super(xogo);
      
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
