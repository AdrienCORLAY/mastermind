/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mastermind;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JButton;

/**
 *
 * @author adrie
 */
public class Mastergraphique extends javax.swing.JFrame {

    int valeurcouleur = 0;
    int nombredecoups = 12;
    int nombredecouleur = 8;
    String[] Listepions = new String[96];
    CouleurMastergraph couleurmaster = new CouleurMastergraph(0);
    String[] tabbase = new String[4];
    Scanner scanner = new Scanner(System.in);
    GrilleMastergraph grillejeu;

    public Mastergraphique() {

        initComponents();
        nbbonneplace.setVisible(false);
        GrilleJeugraph.setVisible(false);
        nbbonnecouleur.setVisible(false);
        Textecouleur.setVisible(false);
        buttonvalid.setVisible(false);
        nbessais.setText(nombredecoups + "");
        nbcoul.setText(nombredecouleur + "");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrilleJeugraph = new javax.swing.JPanel();
        nbbonnecouleur = new javax.swing.JPanel();
        buttonstart = new javax.swing.JButton();
        plusess = new javax.swing.JButton();
        pluscoul = new javax.swing.JButton();
        moinsess = new javax.swing.JButton();
        moinscoul = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nbessais = new javax.swing.JLabel();
        nbcoul = new javax.swing.JLabel();
        nbbonneplace = new javax.swing.JPanel();
        Panelcouleur = new javax.swing.JPanel();
        buttonvalid = new javax.swing.JButton();
        Textecouleur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GrilleJeugraph.setBackground(new java.awt.Color(0, 0, 0));
        GrilleJeugraph.setMinimumSize(new java.awt.Dimension(600, 200));
        GrilleJeugraph.setPreferredSize(new java.awt.Dimension(900, 200));
        GrilleJeugraph.setLayout(new java.awt.GridLayout(4, 12));
        getContentPane().add(GrilleJeugraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        nbbonnecouleur.setBackground(new java.awt.Color(0, 255, 0));
        nbbonnecouleur.setPreferredSize(new java.awt.Dimension(900, 60));

        javax.swing.GroupLayout nbbonnecouleurLayout = new javax.swing.GroupLayout(nbbonnecouleur);
        nbbonnecouleur.setLayout(nbbonnecouleurLayout);
        nbbonnecouleurLayout.setHorizontalGroup(
            nbbonnecouleurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        nbbonnecouleurLayout.setVerticalGroup(
            nbbonnecouleurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(nbbonnecouleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        buttonstart.setText("START");
        buttonstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonstartActionPerformed(evt);
            }
        });
        getContentPane().add(buttonstart, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        plusess.setText("+");
        plusess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusessActionPerformed(evt);
            }
        });
        getContentPane().add(plusess, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        pluscoul.setText("+");
        pluscoul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pluscoulActionPerformed(evt);
            }
        });
        getContentPane().add(pluscoul, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        moinsess.setText("-");
        moinsess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moinsessActionPerformed(evt);
            }
        });
        getContentPane().add(moinsess, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        moinscoul.setText("-");
        moinscoul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moinscoulActionPerformed(evt);
            }
        });
        getContentPane().add(moinscoul, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jLabel1.setText("nb essais");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 25, -1, -1));

        jLabel2.setText("nombre de couleurs");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 75, -1, -1));

        nbessais.setText("mode");
        getContentPane().add(nbessais, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 25, -1, -1));

        nbcoul.setText("nb couleurs");
        getContentPane().add(nbcoul, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 75, -1, -1));

        nbbonneplace.setBackground(new java.awt.Color(204, 0, 0));
        nbbonneplace.setPreferredSize(new java.awt.Dimension(60, 60));
        nbbonneplace.setRequestFocusEnabled(false);

        javax.swing.GroupLayout nbbonneplaceLayout = new javax.swing.GroupLayout(nbbonneplace);
        nbbonneplace.setLayout(nbbonneplaceLayout);
        nbbonneplaceLayout.setHorizontalGroup(
            nbbonneplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        nbbonneplaceLayout.setVerticalGroup(
            nbbonneplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(nbbonneplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        Panelcouleur.setPreferredSize(new java.awt.Dimension(900, 75));
        Panelcouleur.setLayout(new java.awt.GridLayout());
        getContentPane().add(Panelcouleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));

        buttonvalid.setText("Valider");
        getContentPane().add(buttonvalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, -1));

        Textecouleur.setText("aucune couleur sélectionnée");
        getContentPane().add(Textecouleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 170, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void initialiserPartie(int essais) {

        grillejeu = new GrilleMastergraph(essais);
        Random rdc = new Random();
        for (int i = 0; i <= 3; i++) {
            int nbcouleur;
            nbcouleur = rdc.nextInt(7);
            tabbase[i] = couleurmaster.Tableaucouleur[nbcouleur];
        }
    }

    private void buttonstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonstartActionPerformed
        nbbonneplace.setVisible(true);
        GrilleJeugraph.setVisible(true);
        nbbonnecouleur.setVisible(true);
        Textecouleur.setVisible(true);
        buttonvalid.setVisible(true);
        initialiserPartie(Integer.parseInt(nbessais.getText()));

        int nbcoups = Integer.parseInt(nbessais.getText());
        nbbonnecouleur.setPreferredSize(new Dimension(nbcoups * 50, 60));
        GrilleJeugraph.setPreferredSize(new Dimension(nbcoups * 50, 200));
        nbbonneplace.setPreferredSize(new Dimension(nbcoups * 50, 60));

        int nombrecoul = Integer.parseInt(nbcoul.getText());
        for (int v = 0; v < nombrecoul; v++) {
            Colors Carrecouleur = new Colors(couleurmaster.Tableaucouleur[v]);
            Carrecouleur.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Textecouleur.setText(Carrecouleur.couleurAssociee);
                }
            });
            Panelcouleur.add(Carrecouleur);

        }
        Cellulegraphique[][] tableauBoutons = new Cellulegraphique[nbcoups][4];
        Textecouleur.repaint();
        String couleuraffiche = null;
        couleuraffiche = Textecouleur.getText();
        int tourjouer = 0;
        for (int z = 0; z < nbcoups; z++) {
            for (int y = 0; y < 4; y++) {
                Cellulegraphique cellGraph = new Cellulegraphique(grillejeu.grilleJeu[z][y], couleuraffiche);
                tableauBoutons[z][y] = cellGraph;
                cellGraph.addActionListener(new java.awt.event.ActionListener() {

                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if ("aucune couleur sélectionnée".equals(Textecouleur.getText())) {
                        } 
                        else {
                            cellGraph.setBackground(cellGraph.convertColor(Textecouleur.getText()));
                            GrilleJeugraph.repaint();
                        }

                    }

                });

                GrilleJeugraph.add(cellGraph);
                GrilleJeugraph.repaint();

            }
        }
        /*       if (z > tourjouer){
                   cellGraph.setEnabled(false);               
                }
                if (z <= tourjouer){
                   cellGraph.setEnabled(true);               
                }
                GrilleJeugraph.repaint();
        tourjouer = tourjouer + 1;
         */
        buttonstart.setEnabled(false);
        moinsess.setEnabled(false);
        moinscoul.setEnabled(false);
        plusess.setEnabled(false);
        pluscoul.setEnabled(false);
    }

    /*public void afficherGrilleSurConsole(int nb){
        GrilleJeugraph.removeAll();
        for( int i=0; i<nb; i++){
            for( int j=0; j<=3; j++){
                if ("rouge".equals(couleurAssociee)) {
                    Cellulegraphique Cellgraph = new Cellulegraphique(grillejeu.grilleJeu[i][j], couleuraffiche);
                }
                else if ("jaune".equals(couleurAssociee)) {
                    setBackground(Color.YELLOW);
                }
                else if ("vert".equals(couleurAssociee)) {
                    setBackground(Color.GREEN);
                }
                else if ("bleu".equals(couleurAssociee)) {
                    setBackground(Color.BLUE);
                }
                else if ("orange".equals(couleurAssociee)) {
                    setBackground(Color.ORANGE);
                }
                else if ("blanc".equals(couleurAssociee)) {
                    setBackground(Color.WHITE);
                }
                else if ("noir".equals(couleurAssociee)) {
                    setBackground(Color.BLACK);
                }
                else if ("rose".equals(couleurAssociee)) {
                    setBackground(Color.PINK);
                }
                else if ("magenta".equals(couleurAssociee)) {
                    setBackground(Color.MAGENTA);
                }
                else if ("gris clair".equals(couleurAssociee)) {
                    setBackground(Color.LIGHT_GRAY);
                }
                else if ("noir".equals(couleurAssociee)) {
                    setBackground(Color.BLACK);
                }
                else if ("cyan".equals(couleurAssociee)) {
                    setBackground(Color.CYAN);
                }
                else if ("gris fonce".equals(couleurAssociee)) {
                    setBackground(Color.DARK_GRAY);
                }
                else {
                    setBackground(Color.WHITE);
                }
                GrilleJeugraph.add(Cellgraph);
                GrilleJeugraph.repaint();
            }
        }
        

// TODO add your handling code here:
    }//GEN-LAST:event_buttonstartActionPerformed
*/
    private void plusessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusessActionPerformed
        if (Integer.parseInt(nbessais.getText()) == 17) {
            nbessais.setText(Integer.parseInt(nbessais.getText()) + "");
        } else {
            nbessais.setText(Integer.parseInt(nbessais.getText()) + 1 + "");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_plusessActionPerformed

    private void moinsessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moinsessActionPerformed
        if (Integer.parseInt(nbessais.getText()) == 2) {
            nbessais.setText(Integer.parseInt(nbessais.getText()) + "");
        } else {
            nbessais.setText(Integer.parseInt(nbessais.getText()) - 1 + "");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_moinsessActionPerformed

    private void pluscoulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pluscoulActionPerformed
        if (Integer.parseInt(nbcoul.getText()) == 12) {
            nbcoul.setText(Integer.parseInt(nbcoul.getText()) + "");
        } else {
            nbcoul.setText(Integer.parseInt(nbcoul.getText()) + 1 + "");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_pluscoulActionPerformed

    private void moinscoulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moinscoulActionPerformed
        if (Integer.parseInt(nbcoul.getText()) == 2) {
            nbcoul.setText(Integer.parseInt(nbcoul.getText()) + "");
        } else {
            nbcoul.setText(Integer.parseInt(nbcoul.getText()) - 1 + "");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_moinscoulActionPerformed

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
            java.util.logging.Logger.getLogger(Mastergraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mastergraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mastergraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mastergraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mastergraphique().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GrilleJeugraph;
    private javax.swing.JPanel Panelcouleur;
    private javax.swing.JLabel Textecouleur;
    private javax.swing.JButton buttonstart;
    private javax.swing.JButton buttonvalid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton moinscoul;
    private javax.swing.JButton moinsess;
    private javax.swing.JPanel nbbonnecouleur;
    private javax.swing.JPanel nbbonneplace;
    private javax.swing.JLabel nbcoul;
    private javax.swing.JLabel nbessais;
    private javax.swing.JButton pluscoul;
    private javax.swing.JButton plusess;
    // End of variables declaration//GEN-END:variables
}
