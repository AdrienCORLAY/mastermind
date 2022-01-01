/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind;


import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author adrie
 */
// cette classe nous permet de créer des boutons qui correspondrons aux cellules de notre grille de jeu et de leur afecter une image et des coordonnées
// ces coordonnées nous permtrons d'identifier le bouton dans notre grille
public class Cellulegraphique extends JButton {

    int ligne; // on initialise ligne colonne et couleurAssociee qui seront en parametre de notre bouton a
    int colonne;
    String couleurAssociee;
    
    //On initialise également le images dont nous allons avoir besoin
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/blanc.png"));
    ImageIcon img_rouge = new javax.swing.ImageIcon(getClass().getResource("/images/rouge.png"));
    ImageIcon img_jaune = new javax.swing.ImageIcon(getClass().getResource("/images/jaune.png"));
    ImageIcon img_vert = new javax.swing.ImageIcon(getClass().getResource("/images/vert.png"));
    ImageIcon img_orange = new javax.swing.ImageIcon(getClass().getResource("/images/orange.png"));
    ImageIcon img_rose = new javax.swing.ImageIcon(getClass().getResource("/images/rose.png"));
    ImageIcon img_magenta = new javax.swing.ImageIcon(getClass().getResource("/images/magenta.png"));
    ImageIcon img_bleu = new javax.swing.ImageIcon(getClass().getResource("/images/bleu.png"));
    ImageIcon img_grisclair = new javax.swing.ImageIcon(getClass().getResource("/images/gris_clair.png"));
    ImageIcon img_gris = new javax.swing.ImageIcon(getClass().getResource("/images/gris.png"));
    ImageIcon img_grisfonce = new javax.swing.ImageIcon(getClass().getResource("/images/gris_foncé.png"));
    ImageIcon img_cyan = new javax.swing.ImageIcon(getClass().getResource("/images/cyan.png"));
    ImageIcon img_noir = new javax.swing.ImageIcon(getClass().getResource("/images/noir.png"));

    //cette methode permet d'associer des coordonées et une couleur au bouton créé
    public Cellulegraphique(int ligneAssociee, int colonneAssociee, String couleur) {
        ligne = ligneAssociee;
        colonne = colonneAssociee;
        couleurAssociee = couleur;
    }

    // en fonction de la valeur de la couleur associee le bouton contiendra une image
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if ("rouge".equals(couleurAssociee)) {
            setIcon(img_rouge);
        } 
        else if ("jaune".equals(couleurAssociee)) {
            setIcon(img_jaune);
        } 
        else if ("vert".equals(couleurAssociee)) {
            setIcon(img_vert);
        } 
        else if ("bleu".equals(couleurAssociee)) {
            setIcon(img_bleu);
        } 
        else if ("orange".equals(couleurAssociee)) {
            setIcon(img_orange);
        } 
        else if ("gris".equals(couleurAssociee)) {
            setIcon(img_gris);
        } 
        else if ("rose".equals(couleurAssociee)) {
            setIcon(img_rose);
        } 
        else if ("magenta".equals(couleurAssociee)) {
            setIcon(img_magenta);
        } 
        else if ("gris clair".equals(couleurAssociee)) {
            setIcon(img_grisclair);
        } 
        else if ("noir".equals(couleurAssociee)) {
            setIcon(img_noir);
        } 
        else if ("cyan".equals(couleurAssociee)) {
            setIcon(img_cyan);
        } 
        else if ("gris fonce".equals(couleurAssociee)) {
            setIcon(img_grisfonce);
        } 
        else {
            setIcon(img_vide);
        }
    }
}
