package data.view;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import data.model.Livre;


public class Unfault extends DefaultMutableTreeNode{
  Livre live;

  public Unfault(Livre l){
    this.live=l;
    for(int i = 0; i <l.getListe().size(); i++){
       DefaultMutableTreeNode rep = new DefaultMutableTreeNode("Noeud n°"+(i+1));
       this.add(rep);
     }

     this.addTreeSelectionListener(new TreeSelectionListener() {
         public void valueChanged(TreeSelectionEvent e) {
             DefaultMutableTreeNode node = (DefaultMutableTreeNode)this.getLastSelectedPathComponent();
             if (node == null) return;
         }

		private DefaultMutableTreeNode getLastSelectedPathComponent() {
			// TODO Auto-generated method stub
			return null;
		}
     });

    //Nous allons ajouter des branches et des feuilles à notre racine
     //for(int i = 1; i <5 /*(this.p.getListe().size()+1); i++){
       DefaultMutableTreeNode rep = new DefaultMutableTreeNode("Noeud n°");

       //S'il s'agit d'un nombre pair, on rajoute une branche
       //if((i%2) == 0){
         //Et une branche en plus ! Une !
         for(int j = 1; j < 5; j++){
           DefaultMutableTreeNode rep2 = new DefaultMutableTreeNode("Fichier enfant n°" + j);
           //Cette fois, on ajoute les feuilles
           for(int k = 1; k < 5; k++)
             rep2.add(new DefaultMutableTreeNode("Sous-fichier enfant n°" + k));
           rep.add(rep2);
         }
       
       //On ajoute la feuille ou la branche à la racine
       this.add(rep);
     }

private void addTreeSelectionListener(TreeSelectionListener treeSelectionListener) {
	// TODO Auto-generated method stub
	
}
  }

