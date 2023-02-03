/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PaqueteIU;

import PaqueteModelo.Cadrado;
import PaqueteModelo.Xogo;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

import javax.swing.JPanel;

/**
 *
 * @author a22lucastf
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    //ATRIBUTOS
    public Timer timer;
    public Xogo xogo;
    private Iterator<Cadrado> iterator3;

    /**
     * Creates new form VentanaPrincipalFrame
     */
    public VentanaPrincipal() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        levels = new javax.swing.JFrame();
        labelTituloLevel = new javax.swing.JLabel();
        easyButton = new javax.swing.JButton();
        hardButton = new javax.swing.JButton();
        normalButton = new javax.swing.JButton();
        frameJuego = new javax.swing.JFrame();
        panelJuego = new javax.swing.JPanel();
        scoreLabel = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        levelLabel = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        pauseButton = new javax.swing.JToggleButton();
        exitButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        labelTituloTetris = new javax.swing.JLabel();

        labelTituloLevel.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        labelTituloLevel.setText("SELECT DIFFICULTY");

        easyButton.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        easyButton.setContentAreaFilled(false);
        easyButton.setSelected(true);
        easyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyButtonActionPerformed(evt);
            }
        });

        hardButton.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        hardButton.setContentAreaFilled(false);
        hardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardButtonActionPerformed(evt);
            }
        });

        normalButton.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        normalButton.setContentAreaFilled(false);
        normalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout levelsLayout = new javax.swing.GroupLayout(levels.getContentPane());
        levels.getContentPane().setLayout(levelsLayout);
        levelsLayout.setHorizontalGroup(
            levelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(levelsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(levelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hardButton)
                    .addComponent(easyButton)
                    .addComponent(normalButton))
                .addGap(70, 70, 70))
            .addGroup(levelsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloLevel)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        levelsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {easyButton, hardButton, normalButton});

        levelsLayout.setVerticalGroup(
            levelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(levelsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelTituloLevel)
                .addGap(30, 30, 30)
                .addComponent(easyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(normalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        frameJuego.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frameJuego.setTitle("Tetris");
        frameJuego.setBackground(new java.awt.Color(204, 204, 204));
        frameJuego.setForeground(java.awt.Color.gray);
        frameJuego.setMinimumSize(new java.awt.Dimension(700, 850));
        frameJuego.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                frameJuegoPropertyChange(evt);
            }
        });
        frameJuego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                frameJuegoKeyPressed(evt);
            }
        });
        frameJuego.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelJuego.setBackground(new java.awt.Color(0, 0, 0));
        panelJuego.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelJuego.setNextFocusableComponent(playButton);
        panelJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        frameJuego.getContentPane().add(panelJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 400, 800));

        scoreLabel.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        scoreLabel.setText("Score:");
        frameJuego.getContentPane().add(scoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 24, -1, -1));

        score.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score.setText("0");
        frameJuego.getContentPane().add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 94, 150, -1));

        levelLabel.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        levelLabel.setText("Level:");
        frameJuego.getContentPane().add(levelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 191, -1, -1));

        level.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        level.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        level.setText("1");
        frameJuego.getContentPane().add(level, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 261, 150, -1));

        pauseButton.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        pauseButton.setText("PAUSE");
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });
        frameJuego.getContentPane().add(pauseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 601, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tetris");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(102, 102, 102));

        exitButton.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        exitButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\a22lucastf\\Pictures\\Saved Pictures\\EXIT_STOPPED.png")); // NOI18N
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\a22lucastf\\Pictures\\Saved Pictures\\EXIT.gif")); // NOI18N
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        playButton.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        playButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\a22lucastf\\Pictures\\Saved Pictures\\PLAY_STOPPED.png")); // NOI18N
        playButton.setContentAreaFilled(false);
        playButton.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\a22lucastf\\Pictures\\Saved Pictures\\PLAY.gif")); // NOI18N
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        settingsButton.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        settingsButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\a22lucastf\\Pictures\\Saved Pictures\\Levels-1.png.png")); // NOI18N
        settingsButton.setContentAreaFilled(false);
        settingsButton.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\a22lucastf\\Pictures\\Saved Pictures\\Levels.gif")); // NOI18N
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        labelTituloTetris.setIcon(new javax.swing.ImageIcon("C:\\Users\\a22lucastf\\Pictures\\Saved Pictures\\The_Tetris_Company_logo.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTituloTetris, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {exitButton, playButton, settingsButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelTituloTetris)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {exitButton, playButton, settingsButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed

        this.iniciarPartida();

    }//GEN-LAST:event_playButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        levels.setVisible(rootPaneCheckingEnabled);
        levels.setSize(260, 340);
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitButtonMouseClicked

    private void easyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_easyButtonActionPerformed

    private void hardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hardButtonActionPerformed

    private void normalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_normalButtonActionPerformed

    private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseButtonActionPerformed
        timer.cancel();
        System.out.println("");
    }//GEN-LAST:event_pauseButtonActionPerformed

    private void frameJuegoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_frameJuegoPropertyChange
        this.setSize(1000, 1000);
    }//GEN-LAST:event_frameJuegoPropertyChange

    private void frameJuegoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_frameJuegoKeyPressed
        //         if (KeyEvent.getKeyText(evt.getKeyCode()).equals("A")) {
        if (KeyEvent.getKeyText(evt.getKeyCode()).equals("A")) {
            System.out.println("A");
            xogo.moverFichaEsquerda();
        }
        if (KeyEvent.getKeyText(evt.getKeyCode()).equals("D")) {
            System.out.println("D");
            xogo.moverFichaDereita();
        }
        if (KeyEvent.getKeyText(evt.getKeyCode()).equals("S")) {
            System.out.println("S");
            xogo.moverFichaAbaixoConTecla();
        }
        
    }//GEN-LAST:event_frameJuegoKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    private void iniciarPartida() {

        this.setVisible(false);      //ESCONDE EL FRAME DE LA VENTANA PRINCIPAL
        frameJuego.setVisible(rootPaneCheckingEnabled);   // MUESTRA EL FRAME DEL JUEGO 
        //frameJuego.setSize(660, 830);       //MEDIDAS FRAME JUEGO
        frameJuego.setFocusable(true);
        panelJuego.setFocusable(true);
        xogo = new Xogo(false, 0, this);
        movimientoAbajo();

    }

    public void movimientoAbajo() {
        timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                try {
                    xogo.moverFichaAbaixo();

                } catch (InterruptedException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        timer.schedule(task, 500, 1000);
    }

    public void actualizarPanel() {
        this.panelJuego.updateUI();

    }

    public void pintarCadrado(JLabel lblCadrado) {
        this.panelJuego.add(lblCadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(lblCadrado.getX(), lblCadrado.getY(), -1, -1)); //PINTA LA LABEL ASOCIADA A CADA OBJETO CUADRADO EN EL PANEL DEL JUEGO
        actualizarPanel();
    }

    public void borrarCadrado() {

    }

    public JPanel getPanelJuego() {
        return panelJuego;
    }

    public void setPanelJuego(JPanel panelJuego) {
        this.panelJuego = panelJuego;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton easyButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JFrame frameJuego;
    private javax.swing.JButton hardButton;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelTituloLevel;
    private javax.swing.JLabel labelTituloTetris;
    private javax.swing.JLabel level;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JFrame levels;
    private javax.swing.JButton normalButton;
    private javax.swing.JPanel panelJuego;
    private javax.swing.JToggleButton pauseButton;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel score;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JButton settingsButton;
    // End of variables declaration//GEN-END:variables
}
