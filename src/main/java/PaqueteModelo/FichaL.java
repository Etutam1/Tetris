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
public class FichaL extends Ficha {

    public Cadrado cadrado1 = new Cadrado(160, 0, Color.ORANGE);
    public Cadrado cadrado2 = new Cadrado(cadrado1.getX() + xogo.LADO_CADRADO, cadrado1.getY(), Color.ORANGE);
    public Cadrado cadrado3 = new Cadrado(cadrado2.getX() + xogo.LADO_CADRADO, cadrado2.getY(), Color.ORANGE);
    public Cadrado cadrado4 = new Cadrado(cadrado3.getX(), cadrado3.getY() + xogo.LADO_CADRADO, Color.ORANGE);

    //CONSTRUCTOR
    public FichaL(Xogo xogo) {
        super(xogo);
        xogo.ventanaPrincipal.pintarCadrado(cadrado1.lblCadrado);
        xogo.ventanaPrincipal.pintarCadrado(cadrado2.lblCadrado);
        xogo.ventanaPrincipal.pintarCadrado(cadrado3.lblCadrado);
        xogo.ventanaPrincipal.pintarCadrado(cadrado4.lblCadrado);
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
