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
// Cette classe nous permet d'initialiser la combinaison secrete ainsi que les image et d'afficher combinaison 
//finale a la fin du jeu si le joueur ne l'a pas trouvée
// pour cela nous créons des boutons qui contiendrons des images
public class CouleurMastergraph extends JButton{
    String Couleur ;
    // Ce tableau contient toutes les couleurs qu'il est possible d'avoir dans le jeu
    String [] Tableaucouleur = {"jaune","rouge","vert","bleu","rose","gris","orange","magenta","gris fonce","gris clair","noir","cyan"};
    
    //nous importons les images des pions
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
    
    public CouleurMastergraph(int nbcouleur){
        Couleur = Tableaucouleur[nbcouleur] ; 
        //Nous associons Couleur, une chaine de caratère à notre bouton crée, cette chaine de caracteres contient la couleur qui a été jouée
    }
    
    
    @Override
    // cette methode permet d'afficher les images dans les boutons que nous avons crée
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if ("rouge".equals(Couleur)) { // s le parametre envoyé est egale à "rouge" 
            setIcon(img_rouge);//on affiche le pion rouge
        } 
        else if ("jaune".equals(Couleur)) {
            setIcon(img_jaune);
        } 
        else if ("vert".equals(Couleur)) {
            setIcon(img_vert);
        } 
        else if ("bleu".equals(Couleur)) {
            setIcon(img_bleu);
        } 
        else if ("orange".equals(Couleur)) {
            setIcon(img_orange);
        } 
        else if ("gris".equals(Couleur)) {
            setIcon(img_gris);
        } 
        else if ("rose".equals(Couleur)) {
            setIcon(img_rose);
        } 
        else if ("magenta".equals(Couleur)) {
            setIcon(img_magenta);
        } 
        else if ("gris clair".equals(Couleur)) {
            setIcon(img_grisclair);
        } 
        else if ("noir".equals(Couleur)) {
            setIcon(img_noir);
        } 
        else if ("cyan".equals(Couleur)) {
            setIcon(img_cyan);
        } 
        else if ("gris fonce".equals(Couleur)) {
            setIcon(img_grisfonce);
        } 
        else {
            setIcon(img_vide);
        }
    }
    
}

