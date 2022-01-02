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
// dans cette classe nous créons le tableau de bouton où le joueur choisi la couleur qu'il veut jouer
public class Colors extends JButton {

    String couleurAssociee;
    
    //cette methode permet d'associer une couleur au bouton créé
    //cette couleur associée sera répertoriée par la variable couleurAssociee
    public Colors(String couleur) {
        couleurAssociee = couleur;
    }

    // en fonction de la valeur de la couleur associee le bouton sera d'une couleur différente
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
        

    }
}
