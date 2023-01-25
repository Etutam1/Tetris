/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteIU;

import PaqueteModelo.Xogo;
import java.util.Timer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;


public class VentanaPrincipal {

    //ATRIBUTOS
    private Timer timer;
    private JPanel panelXogo;
    private JToggleButton tglbtnPausa;
    private JLabel lblLblnumlinas;
    public Xogo xogo;

    //CONSTRUCTOR
    public VentanaPrincipal(Timer timer, JPanel panelXogo, JToggleButton tglbtnPausa, JLabel lblLblnumlinas) {
        this.timer = timer;
        this.panelXogo = panelXogo;
        this.tglbtnPausa = tglbtnPausa;
        this.lblLblnumlinas = lblLblnumlinas;
    }
    
    //METODOS
    public void pintarCadrado(JLabel lblCadrado){
        
    }
    public void borrarCadrado(JLabel lblCadrado){
        
    }
    public void mostrarNumeroLinas(int numeroLinas){
        
    }
    public void mostrarFinXogo(){
        
    }
    private void iniciarPartida(){
        
    }
    
    //GETTERs AND SETTERs 
    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public JPanel getPanelXogo() {
        return panelXogo;
    }

    public void setPanelXogo(JPanel panelXogo) {
        this.panelXogo = panelXogo;
    }

    public JToggleButton getTglbtnPausa() {
        return tglbtnPausa;
    }

    public void setTglbtnPausa(JToggleButton tglbtnPausa) {
        this.tglbtnPausa = tglbtnPausa;
    }

    public JLabel getLblLblnumlinas() {
        return lblLblnumlinas;
    }

    public void setLblLblnumlinas(JLabel lblLblnumlinas) {
        this.lblLblnumlinas = lblLblnumlinas;
    }

    public Xogo getXogo() {
        return xogo;
    }

    public void setXogo(Xogo xogo) {
        this.xogo = xogo;
    }
    
}
