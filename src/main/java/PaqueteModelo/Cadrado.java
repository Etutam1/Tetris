/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteModelo;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author matut
 */
public class Cadrado {

    //ATRIBUTOS 
    public int x;
    public int y;
    public Color corRecheo;
    public JLabel lblCadrado;

    //CONSTRUCTOR
    public Cadrado(int x, int y, Color corRecheo) {
        this.x = x;
        this.y = y;
        this.corRecheo = corRecheo;
        this.lblCadrado = new JLabel();
        this.lblCadrado.setBackground(corRecheo);
        this.lblCadrado.setForeground(new java.awt.Color(204, 0, 0));
        this.lblCadrado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        this.lblCadrado.setMaximumSize(new java.awt.Dimension(Xogo.LADO_CADRADO, Xogo.LADO_CADRADO));
        this.lblCadrado.setMinimumSize(new java.awt.Dimension(Xogo.LADO_CADRADO, Xogo.LADO_CADRADO));
        this.lblCadrado.setOpaque(true);
        this.lblCadrado.setPreferredSize(new java.awt.Dimension(Xogo.LADO_CADRADO, Xogo.LADO_CADRADO));
        this.lblCadrado.setLocation(x, y);
    }

    //SETTERs AND GETTERs
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getCorRecheo() {
        return corRecheo;
    }

    public void setCorRecheo(Color corRecheo) {
        this.corRecheo = corRecheo;
    }

    public JLabel getLblCadrado() {
        return lblCadrado;
    }

    public void setLblCadrado(JLabel lblCadrado) {
        this.lblCadrado = lblCadrado;
    }

    //METODOS
    public String getCoordenadas() {
        return "coordenadas";
    }

}
