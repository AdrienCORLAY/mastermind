/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind;

/**
 *
 * @author adrie
 */
// dans cette classe nous créons les cellules de la grille de jeu
public class CelluleMastergraph {
    
    String pionCourant;
    //la valeur de base de chaque cellule est une chaine de caractère contenant "vide"
    public CelluleMastergraph(){
        pionCourant = "vide" ;           
    }
    
    //lorsque cette methode est appelée on retourne la couleur du pionCourant
    public String lireCouleurPion(){
        return pionCourant;
    }
}
