/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind;

/**
 *
 * @author adrie
 */
public class CouleurMastergraph {
    String Couleur ;
    String [] Tableaucouleur = {"jaune","rouge","vert","bleu","rose","gris","orange","magenta","gris fonce","gris clair","noir","cyan"};
    
    public CouleurMastergraph(int nbcouleur){
        Couleur = Tableaucouleur[nbcouleur] ;
    }
    public int AttribuerNbACouleur(String lacouleur){
        int vreturn;
        for (int i = 0; i<=7;i++){
            if (Tableaucouleur[i].equals(lacouleur)){
                vreturn = i;
                return vreturn;
            }
        }
        return 13;
    }
    
}

