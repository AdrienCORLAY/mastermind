/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author adrie
 */
public class Cellulegraphique extends JButton {

    int ligne;
    int colonne;
    String couleurAssociee;

    public Cellulegraphique(int ligneAssociee, int colonneAssociee, String couleur) {
        ligne = ligneAssociee;
        colonne = colonneAssociee;
        couleurAssociee = couleur;
    }

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
