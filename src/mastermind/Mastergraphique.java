/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mastermind;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author adrie
 */
public class Mastergraphique extends javax.swing.JFrame {
/* Dans cette partie nous initialisons les variables qui devront etre accessible dans l'ensemble du code*/
    int valeurcouleur = 0; // valeurcouleur nous permet d'aller chercher une chaine de caractères dans un tableau
    int nombredecoups = 12; // nous définissons un nombre de coups de base qui correspond aux 12 essais du master classique
    // Le but de pouvoir changer cette variable afin de d'augmenter ou diminuer le nombre d'essais 
    int nombredecouleur = 8; // nous définissons un nombre de couleurs de base qui correspond aux 8 couleurs du master classique
    // Le but de pouvoir changer cette variable afin de d'augmenter ou diminuer le nombre de couleurs 
    CouleurMastergraph couleurmaster = new CouleurMastergraph(0); //Nous definissons ici couleurmaster qui nous permettra 
    //d'accéder à la classe CouleurMastergraph
    String[] tabbase = new String[4]; // tabbase contient la combinaison que le joueur doit chercher sous forme de chaines de caractères
    GrilleMastergraph grillejeu; 
    int touractuel = 0; // on inititialise le tour de jeu à 0
    private Cellulegraphique[][] tableauBoutons; // nous créons un tableau de cellules
    BonnePlace [] tableauplace; // ce tableau répertori les résultats obtenue de chaque combinaisons proposees 
    // Il contient le nombre de pions à la bonne place dans la combinaison
    BonneCouleur [] tableaucouleur;// ce tableau répertori les résultats obtenue de chaque combinaisons proposees 
    // Il contient le nombre de pions à la bonne couleur dans la combinaison
    BonneCouleur bonc; // Cette classe nous permet de creer des label et de les inserer dans le panel prévu pour indiquer le nombre de bonne couleur
    BonnePlace bonp;// Cette classe nous permet de creer des label et de les inserer dans le panel prévu pour indiquer le nombre de pions a la bonne place
    JLabel labelgagnantplace; // Nous définissons labelgagnantplace comme étant un label ce qui permet de l'afficher dans notre fenetre de jeu
    JLabel labelgagnantcouleur;// Nous définissons labelgagnantcouleur comme étant un label ce qui permet de l'afficher dans notre fenetre de jeu
    ImageIcon img_regle = new javax.swing.ImageIcon(getClass().getResource("/images/Regle.png")); //nous importons l'image contenant les regle du jeu
    

    public Mastergraphique() {
/* Au depart plusieur panels ne sont pas affiché car le joueur n'en a pas besoin*/
        initComponents();
        nbbonneplace.setVisible(false);
        Solfinale.setVisible(false);
        GrilleJeugraph.setVisible(false);
        nbbonnecouleur.setVisible(false);
        Textecouleur.setVisible(false);
        buttonvalid.setVisible(false);
        couleurselec.setVisible(false);
        bienplace.setVisible(false);
        biencouleur.setVisible(false);
        boutonregle.setIcon(img_regle); // nous inserons l'image contenant les regles du jeu dans la zone prevu a cet effet
        nbessais.setText(nombredecoups + ""); //on initialise le texte contenue nbessais(une zone de texte), nous mettons des guillement afin de 
        // transformer nombredecoups en chaine de caractère.
        nbcoul.setText(nombredecouleur + "");//on initialise le texte contenue nbcoul(une zone de texte), nous mettons des guillement afin de 
        // transformer nombredecouleur en chaine de caractère.
        

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
        boutonregle = new javax.swing.JButton();
        couleurselec = new javax.swing.JLabel();
        biencouleur = new javax.swing.JLabel();
        bienplace = new javax.swing.JLabel();
        Solfinale = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GrilleJeugraph.setBackground(new java.awt.Color(0, 0, 0));
        GrilleJeugraph.setMinimumSize(new java.awt.Dimension(600, 200));
        GrilleJeugraph.setPreferredSize(new java.awt.Dimension(900, 200));
        GrilleJeugraph.setLayout(new java.awt.GridLayout(4, 12));
        getContentPane().add(GrilleJeugraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        nbbonnecouleur.setBackground(new java.awt.Color(255, 255, 255));
        nbbonnecouleur.setPreferredSize(new java.awt.Dimension(900, 60));
        nbbonnecouleur.setLayout(new java.awt.GridLayout());
        getContentPane().add(nbbonnecouleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, 30));

        buttonstart.setText("START");
        buttonstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonstartActionPerformed(evt);
            }
        });
        getContentPane().add(buttonstart, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        plusess.setText("+");
        plusess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusessActionPerformed(evt);
            }
        });
        getContentPane().add(plusess, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        pluscoul.setText("+");
        pluscoul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pluscoulActionPerformed(evt);
            }
        });
        getContentPane().add(pluscoul, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        moinsess.setText("-");
        moinsess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moinsessActionPerformed(evt);
            }
        });
        getContentPane().add(moinsess, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        moinscoul.setText("-");
        moinscoul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moinscoulActionPerformed(evt);
            }
        });
        getContentPane().add(moinscoul, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel1.setText("nombre essais");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        jLabel2.setText("nombre de couleurs");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        nbessais.setText("nombre");
        getContentPane().add(nbessais, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        nbcoul.setText("nb couleurs");
        getContentPane().add(nbcoul, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, -1, -1));

        nbbonneplace.setBackground(new java.awt.Color(204, 0, 0));
        nbbonneplace.setPreferredSize(new java.awt.Dimension(60, 60));
        nbbonneplace.setRequestFocusEnabled(false);
        nbbonneplace.setLayout(new java.awt.GridLayout());
        getContentPane().add(nbbonneplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        Panelcouleur.setPreferredSize(new java.awt.Dimension(900, 75));
        Panelcouleur.setLayout(new java.awt.GridLayout());
        getContentPane().add(Panelcouleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        buttonvalid.setText("Valider");
        buttonvalid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonvalidActionPerformed(evt);
            }
        });
        getContentPane().add(buttonvalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, -1, -1));

        Textecouleur.setText("aucune couleur sélectionnée");
        getContentPane().add(Textecouleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 170, 30));
        getContentPane().add(boutonregle, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));

        couleurselec.setText("Couleur sélectionée:");
        getContentPane().add(couleurselec, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, -1, 30));

        biencouleur.setText("La couleur de ton pion est dans la combinaison finale");
        getContentPane().add(biencouleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 330, -1));

        bienplace.setText("Ton pion est de la bonne couleur et il est bien placé");
        getContentPane().add(bienplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        Solfinale.setBackground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout SolfinaleLayout = new javax.swing.GroupLayout(Solfinale);
        Solfinale.setLayout(SolfinaleLayout);
        SolfinaleLayout.setHorizontalGroup(
            SolfinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        SolfinaleLayout.setVerticalGroup(
            SolfinaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        getContentPane().add(Solfinale, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 260, -1, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void initialiserPartie(int essais) {
        grillejeu = new GrilleMastergraph(essais);
        //Ici nous initialisons seleument une grille de jeu qui contiendra des cellules
        // Afin de crer une grille de la bonne taille nous donnons en parametre le nombre d'essais que le joueur aura au cours de la partie
    }
// Maintenant que nous initialisé la partie nous commencons la partie en appuyant sur le bouton start
    private void buttonstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonstartActionPerformed

        Random rdc = new Random();// cette méthode nous permet de faire des tirages alétoire
        // nous affichons les panel qui étaient jusqu'a maintenat caches car le joueur va en avoir besoin
        nbbonneplace.setVisible(true);
        GrilleJeugraph.setVisible(true);
        nbbonnecouleur.setVisible(true);
        Textecouleur.setVisible(true);
        buttonvalid.setVisible(true);
        couleurselec.setVisible(true);
        bienplace.setVisible(true);
        biencouleur.setVisible(true);
        
        int nbcoups = Integer.parseInt(nbessais.getText());//Integer.parseInt permet de transformer une chaine de caractères en entier
        initialiserPartie(nbcoups);
        //Ainsi nous initialisons une grille de jeu avec le bon nombre de colonnes

        
        // Afin d'améliorer nore affichage nous dimensionnons la grille de jeu affichee en fonction du nombre d'essais du joueur
        nbbonnecouleur.setPreferredSize(new Dimension(nbcoups * 50, 30));
        GrilleJeugraph.setPreferredSize(new Dimension(nbcoups * 50, 200));
        nbbonneplace.setPreferredSize(new Dimension(nbcoups * 50, 30));

        // Nous créons de la meme maniere les tableaux contenant les résultats obtenus en fonction du nombre d'essais
        tableaucouleur = new BonneCouleur[nbcoups];
        tableauplace = new BonnePlace[nbcoups];
        
        // cette bouble nous permet d'ajouter des label dans un gridlayout
        // ces labels contiendrons les resultats obtenus
        for (int place = 0; place < nbcoups; place++){
            bonp = new BonnePlace(place); // on creer bonp avec la classe BonnePlace et le parametre place
            nbbonneplace.add(bonp);// on ajoute notre label, bonp, au gridlayout nbbonneplace
            tableauplace[place] = bonp;//tableauplace contient les résultat obtenus
            bonc = new BonneCouleur(place);// on creer bonc avec la classe BonneCouleur et le parametre place
            nbbonnecouleur.add(bonc);// on ajoute notre label, bonc, au gridlayout nbbonnecouleur
            tableaucouleur[place] = bonc;//tableaucouleur contient les résultat obtenus
        }
        
        int nombrecoul = Integer.parseInt(nbcoul.getText());    
        // La variable nombrecoul permet de connaitre sous forme d'entier le nombre de couleur avec les quelles le joueur va jouer
       
        // Cette boucle nous permet de définir la combinaison secrete que le joueur va devoir chercher
        for (int i = 0; i <= 3; i++) {
            int nbcouleur; //Cette variable va nous permetre de tirer un entier aléatoire 
            nbcouleur = rdc.nextInt(nombrecoul); // nous tirons aleatoirement une valeure comprise dans le nombre de couleurs en jeu
            //nous envoyons ensuite la veleur tirée aleatoirement en parametre de couleurmaster
            tabbase[i] = couleurmaster.Tableaucouleur[nbcouleur];//Le tableau contenant la combinaison finale prend la 
            //resultat retouner par la methode couleurmaster     
            CouleurMastergraph pionfinal = new CouleurMastergraph(nbcouleur); //nous créons des bouton en appelant cette methode 
            Solfinale.add(pionfinal);//nous ajoutons ces boutons dans le panel Solfinale
            Solfinale.setPreferredSize(new Dimension(50, 200)); //nous donnons des dimensions au panel afin qu'il soit adapté a notre utilisation 
            Solfinale.setLayout(new GridLayout(4,1)); //Cette methode nous permet d'ordonner et de creer notre gridlayout
            Solfinale.repaint();
            
        }
        
        // cette boucle nous permet d'affciher les couleurs avec les quelles le koueur pourra jouer
        for (int v = 0; v < nombrecoul; v++) {
            //Carrecouleur de type Colors est un bouton d'une certaine couleur
            //cette couleur est donnée en parametre de la methode
            Colors Carrecouleur = new Colors(couleurmaster.Tableaucouleur[v]);
            //A chaque case nous associons un listener 
            Carrecouleur.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    //Lorsque l'on appuie sur un des boutons le texte de la couleur selectionnée prend comme valeur 
                    //la couleur qui est associée au bouton
                    Textecouleur.setText(Carrecouleur.couleurAssociee);
                }
            });
            Panelcouleur.add(Carrecouleur); //on ajoute le bouton dans le panel Panelcouleur

        }
       
        Textecouleur.repaint();
        
        String couleuraffiche = null;
        //couleuraffiche et une variable qui servira de parametre par la suite
        
        tableauBoutons = new Cellulegraphique[nbcoups][4];
        // nous créeons un tableau, tableauBoutons qui contient des objets Cellulegraphique
        //cela nous permetra de retrouver plus facilement les coordonées du bouton sur lequel nous avons cliqué
        for (int ligne = 0; ligne < 4; ligne++) {
            for (int col = 0; col < nbcoups; col++) {
                // chaque bouton créé sera identifié par la variable cellGraph et aura en parametre une ligne, une colonne et une couleur
                //Ainsi nous créons ces bouton de la manière suivante
                Cellulegraphique cellGraph = new Cellulegraphique(ligne,col, couleuraffiche);
                //tableauBoutons[col][ligne] nous permetra d'aller chercher plus rapidement les cellules sur les 
                //quelles nous souhaiterons faire de actions            
                tableauBoutons[col][ligne] = cellGraph;
                //Nous ajoutons au bouton un listener ce qui nous permetra d'effectuer des actions lorsque le joueur appuyra sur un de ces boutons
                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        // le joueur ne peut jouer que dans la colonne qui est en jeu
                        // ce test nous permet donc de vérifier si la colonne dans laquelle le joueur souhaite jouer est effectivement en jeu
                        //sinon le joueur ne peut pas jouer la case sur laquelle il clique
                        if (touractuel == cellGraph.colonne){
                            //Lorsque les conditions sont remplies la couleur de la case en question change et sont 
                            //apparence avec grace à la classe Cellulegraphique
                           cellGraph.couleurAssociee = Textecouleur.getText();
                        }
                     
                    }

                });
                //cette commande permet d'ajoutée les boutons dans le panel mais cette ligne n'est pas lue lorsque l'on appuie sur un bouton
                //si c'était le cas cela désorganiserai notre tableau
                GrilleJeugraph.add(cellGraph);
                GrilleJeugraph.repaint();

                //Enfin nous bloquons les cellules dans lesquelles le joueur ne peut pas jouer au début de la partie grace à cette condition
                if (col != touractuel) {
                    //Le bouton devient donc inactif
                    tableauBoutons[col][ligne].setEnabled(false);
                }

            }

        }

        //Une fois l'initialisation faite nous bloquons les boutons permetant au joueur de commencer la partie, et de choisir le nombre de 
        //d'essais et de couleur car le joueur n'en a plus besoin
        buttonstart.setEnabled(false);
        moinsess.setEnabled(false);
        moinscoul.setEnabled(false);
        plusess.setEnabled(false);
        pluscoul.setEnabled(false);
  

// TODO add your handling code here:
    }//GEN-LAST:event_buttonstartActionPerformed
    //Lorsque nous appuyons sur le bouton + le nombre d'essais va augmenter
    private void plusessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusessActionPerformed
        //nous bloquons le nombre d'essais à 20 de maniere à ce que la grille ne dépasse pas de la fenetre de jeu
        //donc lorsque le joueur atteint la valeur 20 le texte ne change plus 
        //Or ne maniere a déterminer la taille de la grille à créer nous utilisons ce texte 
        //Ainsi le joueur ne peut pas aller au dela des 20 essais
        if (Integer.parseInt(nbessais.getText()) == 20) {
            nbessais.setText(Integer.parseInt(nbessais.getText()) + "");
        } 
        //en revanche si le joueur n'a pas atteint les 20 essais alors peut encore augmenter le nombre d'essais
        // la variable qui repertorie ce nombre augmente alors de 1
        else {
            nbessais.setText(Integer.parseInt(nbessais.getText()) + 1 + "");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_plusessActionPerformed
    // De la meme maniere que précedement le joueur ne peut pas descendre en dessous des 2 essais 
    private void moinsessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moinsessActionPerformed
        if (Integer.parseInt(nbessais.getText()) == 2) {
            nbessais.setText(Integer.parseInt(nbessais.getText()) + "");
        } else {
            nbessais.setText(Integer.parseInt(nbessais.getText()) - 1 + "");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_moinsessActionPerformed
    // Les deux boutons suivant marche de la meme maniere que ceux pour augmenter et diminuer le nombre d'essais mais cette fois ils 
    //permettent d'augmenter et de diminuer le nombre de couleur
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
    // le bouton buttonvalid, valider à l'écran permet de valider la composition que l'on vient de poser
    private void buttonvalidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonvalidActionPerformed
        // le tableau que nous créons ici nous permet de déterminer quel est le statut de chaque pion de la proposition
        //J'expliquerai plus en détail dans la suite du code
        String [] tableauTest = new String [4];
        // dans cette partie nous avons besoin du nombre d'essais dont dispose le joueur, ce nombre est repertorié dans la variable nbcoups 
        int nbcoups = Integer.parseInt(nbessais.getText());
        // le joueur ne peut pas valider une combinaison si l'ensemble des case de la colonne en jeu n'est pas remplie
        //cette boucle nous permet de vérifier cela et d'annuler la validation du joueur
        //si une des cases est vide le joueur ne peut pas valider sa combinaison
        for (int li = 0; li < 4; li++) {
            for (int co = 0; co <= touractuel; co++) {
                if (tableauBoutons[co][li].couleurAssociee == null){
                    return;
                }
            }
        }
        
        // ces deux variables nous permettent de répertorier le nombre de bonnes places et de bonnes couleur dans la combinaison validée
        int nbplace = 0;
        int nbcouleur = 0;
        // dans un premier temps nous testons si le pion de la combianison est bien placé et de la bonne couleur par rapport à la combinaison finale
        // car si le pion est bien placé et de la bonne couleur nous ne compterons pas le fait qu'il soit de la bonne couleur
        for (int ligne = 0; ligne <= 3; ligne++) {
            if (tableauBoutons[touractuel][ligne].couleurAssociee.equals(tabbase[ligne])) {
                // la variable répertiriant le nombre de pions bien placé augmente alors de 1 si la condition est remplie
                //Et la case correspondant dans notre tableautest prend comme valeur bonne place
                // cela nous permetra d'identifier si la case a déja étée testée de manière 
                //à ne pas lui appliquer d'autre tests qui fausserai le comptage
                nbplace = nbplace + 1;
                tableauTest [ligne] = "bonne place";
            } 
        }
        
        //nous comptons ensuite grace à cette boucle le nombre de pions ayant seulement une couleur en commun avec ceux de la composition finale
        for (int position = 0; position <= 3; position++) {
            for (int ligne = 0; ligne <= 3; ligne++) {
                //la variable repertoriant le nombre de bonnes couleur, nbcouleur, augmente de 1 si et seulement si
                //sa couleur correspond à de celle de la composition finale
                //si le pion n'a pas été deja compté comme étant à la bonne place
                //si le pion n'a pas été deja compté comme étant à la bonne couleur
                //et enfin si le pion n'est pas de la bonne place et à la bonne couleur car dans ce cas la 
                //il aurait été compté comme étant à la bonne place
                if (tableauBoutons[touractuel][position].couleurAssociee.equals(tabbase[ligne]) && !"bonne place".equals(tableauTest [ligne]) && !"bonne couleur".equals(tableauTest [ligne]) && !tableauBoutons[touractuel][position].couleurAssociee.equals(tabbase[position])) {
                    nbcouleur = nbcouleur + 1;
                    tableauTest [ligne] = "bonne couleur";
                    break;
                }
            }
        }
        
        //a la fin des test nous récuperons la valeur des variables nbplace et nbcouleur et transformons en chaine de caractères
        String stringnbp = String.valueOf(nbplace);
        String stringnbc = String.valueOf(nbcouleur);
        
        // nous affichons avec cette boucle le résultat obtenu
        for (int place = 0; place < nbcoups; place++){
            //Nous cherchons donc la case du tableau répertoriant le résultat obtenu à l'essais en question
            // et nous affichons le score obtenu pour le nombre de pions à la bonne place
            if (tableauplace[place].place == touractuel){
                tableauplace[place].setText("        " + stringnbp);
            }
            // de la maniere que précedement nous affichons le score obtenu pour le nombre de pions à la bonne couleur
            if (tableaucouleur[place].place == touractuel){
                tableaucouleur[place].setText("        " + stringnbc);
            }
        }
        
        // Il y a deux conditions pour que la partie prenne fin
        //Si le joueur à trouvé la conbianison 
        //Si le joueur n'a plus d'essais
        // nous testons dans un premier temps si le joueur a trouvé la combinaison finale
        if (nbplace == 4){
            //Dans ce cas là nous enlevons toutes les case des tableaus des score et affichons ce message "Vous avez gagné"
            nbbonnecouleur.removeAll();
            nbbonneplace.removeAll();
            //nous créons ainsi des labels
            labelgagnantplace = new JLabel();
            labelgagnantcouleur = new JLabel();
            //que nous ajoutons dans les panels des scores
            nbbonneplace.add(labelgagnantplace);
            nbbonnecouleur.add(labelgagnantcouleur);
            //et leurs donnont la valeur "Vous avez gagné"
            labelgagnantplace.setText("Vous avez gagné");
            labelgagnantcouleur.setText("Vous avez gagné");
            
            
        }   
        // dans le cas ou le joueur n'a pas encore gagné le tour de jeu répertorié par la variable touractuel augmente de 1
        touractuel = touractuel + 1;
        
        // ainsi si le joueur n'a plus d'essais et qu'il n'a pas trouvé la combinaison nous affichons 
        //un message de défaite à la place de celui de victoire
        if (nbcoups == touractuel && nbplace != 4){
            //Dans ce cas là nous enlevons toutes les case des tableaus des score et affichons ce message "Vous avez perdu(vous avez utilisé tout vos coups"
            nbbonnecouleur.removeAll();
            nbbonneplace.removeAll();
            //nous créons ainsi des labels
            labelgagnantplace = new JLabel();
            labelgagnantcouleur = new JLabel();
            //que nous ajoutons dans les panels des scores
            nbbonneplace.add(labelgagnantplace);
            nbbonnecouleur.add(labelgagnantcouleur);
            //nous affichons la combinaison que le joueur devait trouver 
            Solfinale.setVisible(true);
            //et leurs donnont la valeur "Vous avez perdu(vous avez utilisé tout vos coups"
            labelgagnantplace.setText("Vous avez perdu(vous avez utilisé tout vos coups");
            labelgagnantcouleur.setText("Vous avez perdu(vous avez utilisé tout vos coups");
            
        }
        //Si c'est deux conditions ne sont pas vraie alors c'est qu'il reste des essais au joueur et qu'il n'a pas trouvé la solution
        //Les cases suivantes deviennent donc jouables  grace à la boucle suivante
        else{
            for (int li = 0; li<=3 ; li++){
                tableauBoutons[touractuel][li].setEnabled(true);
            }
        }
    }//GEN-LAST:event_buttonvalidActionPerformed

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
    private javax.swing.JPanel Solfinale;
    private javax.swing.JLabel Textecouleur;
    private javax.swing.JLabel biencouleur;
    private javax.swing.JLabel bienplace;
    private javax.swing.JButton boutonregle;
    private javax.swing.JButton buttonstart;
    private javax.swing.JButton buttonvalid;
    private javax.swing.JLabel couleurselec;
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
