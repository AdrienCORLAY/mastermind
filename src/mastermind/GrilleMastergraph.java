/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind;

/**
 *
 * @author adrie
 */
//dans cette classe nous créons une grille de jeu qui contiendra des cellules
public class GrilleMastergraph {
    CouleurMastergraph couleurmaster;
    
    CelluleMastergraph [][] grilleJeu;
    //Nous ajoutons dans chaque case de notre grille une cellule 
    public GrilleMastergraph(int NB){ 
        grilleJeu = new CelluleMastergraph [NB][4];
        for (int i=0;i<=3;i++){
            for (int j=0;j<NB;j++){
                grilleJeu[j][i] = new CelluleMastergraph();
            }
        } 
    }
    
   
}
