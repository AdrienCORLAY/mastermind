/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind;

import javax.swing.JLabel;

/**
 *
 * @author adrie
 */
// le but de cette classe et de créer des label qui contendrons par la suite le nombre de pion de la bonne couleur pour un essais donné
public class BonneCouleur extends JLabel {
    int place;
    
    public BonneCouleur(int placeAssociee){
        place = placeAssociee;// cet entier nous permet de retrouver l'emplacement du label dans le tableau
    }
    
}
