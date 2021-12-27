/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author adrie
 */
public class Cellulegraphique extends JButton {

    int ligne;
    int colonne;
    String couleurAssociee;
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

    public Cellulegraphique(int ligneAssociee, int colonneAssociee, String couleur) {
        ligne = ligneAssociee;
        colonne = colonneAssociee;
        couleurAssociee = couleur;
    }
/*
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if ("rouge".equals(couleurAssociee)) {
            setBackground(Color.RED);
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
        else if ("gris".equals(couleurAssociee)) {
            setBackground(Color.GRAY);
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
    }*/
    
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

/*
    public Color convertColor(String color) {

        switch (color) {

            case "rouge":
                return (Color.RED);
            case "vert":
                return (Color.GREEN);
            case "jaune":
                return (Color.YELLOW);
            case "noir":
                return (Color.BLACK);
            case "bleu":
                return (Color.BLUE);
            case "gris":
                return (Color.GRAY);
            case "orange":
                return (Color.ORANGE);
            case "rose":
                return (Color.PINK);
            case "magenta":
                return (Color.MAGENTA);
            case "cyan":
                return (Color.CYAN);
            case "gris fonce":
                return (Color.DARK_GRAY);
            case "gris clair":
                return (Color.LIGHT_GRAY);
            default:
                return (Color.WHITE);
        }
    }
*/
}
