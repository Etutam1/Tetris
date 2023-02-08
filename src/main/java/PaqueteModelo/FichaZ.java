/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteModelo;

import java.awt.Color;

/**
 *
 * @author maste
 */
public class FichaZ  extends Ficha{
    public Cadrado cadrado1 = new Cadrado(160, 0, Color.YELLOW);
    public Cadrado cadrado2 = new Cadrado(cadrado1.getX() + Xogo.LADO_CADRADO, cadrado1.getY(), Color.YELLOW);
    public Cadrado cadrado3 = new Cadrado(cadrado1.getX() + Xogo.LADO_CADRADO, cadrado2.getY() + xogo.LADO_CADRADO, Color.YELLOW);
    public Cadrado cadrado4 = new Cadrado(cadrado1.getX() + 2*Xogo.LADO_CADRADO, cadrado1.getY() + Xogo.LADO_CADRADO, Color.YELLOW);

    //CONSTRUCTOR
    public FichaZ(Xogo xogo) {
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
            if(xogo.fichaActual.posicion > 1){
                xogo.fichaActual.posicion = 0;
            }
            if(xogo.fichaActual.posicion == 0){
                cadrado1.getLblCadrado().setLocation(cadrado2.getX() - Xogo.LADO_CADRADO , cadrado2.getY());
                cadrado3.getLblCadrado().setLocation(cadrado2.getX() , cadrado2.getY() + Xogo.LADO_CADRADO);
                cadrado4.getLblCadrado().setLocation(cadrado2.getX() + Xogo.LADO_CADRADO , cadrado2.getY() + Xogo.LADO_CADRADO);
                }
            if(xogo.fichaActual.posicion == 1){
                cadrado1.getLblCadrado().setLocation(cadrado2.getX(), cadrado2.getY() - Xogo.LADO_CADRADO);
                cadrado3.getLblCadrado().setLocation(cadrado2.getX() + Xogo.LADO_CADRADO , cadrado2.getY());
                cadrado4.getLblCadrado().setLocation(cadrado2.getX() + Xogo.LADO_CADRADO , cadrado2.getY() + Xogo.LADO_CADRADO);
                }
            return true;
        }
    }