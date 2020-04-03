package data.controler;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

import data.view.PanneauText;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Save extends AbstractAction {

  protected PanneauText fiche;

	public Save(String texte, PanneauText pt){
		super(texte);
    this.fiche=pt;
	}

  public void sauver(){
    //String texte = this.fiche.getZoneTexte().getText();//zoneTexte.GetterText();
    //String question = this.fiche.getZoneQuestion().getText();
    try{
      String res = "";
      this.fiche.getLivre().getListe().get(this.fiche.getCurrent()).save(
      this.fiche.getZoneTexte().getText(), this.fiche.getZoneQuestion().getText());

      for (int i=0; i<this.fiche.getLivre().getListe().size();i++){

        res=res+
        "[text]\n" + this.fiche.getLivre().getListe().get(i).GetterText() +"\n[/text]\t"+
        "\n[question]\n" + this.fiche.getLivre().getListe().get(i).GetterQuestion()+"\n[/question]"
        +"\n\n==========\n\n";

      }

      FileWriter lu = new FileWriter("livre_"+/*this.fiche.getCurrent()*/"test"+".txt");
      // Créer un objet java.io.FileWriter avec comme argument le mon du fichier dans lequel enregsitrer
      BufferedWriter out = new BufferedWriter(lu);
      // Mettre le flux en tampon (en cache)
      out.write(res);
      //Balancer dans le flux le contenu de la zone de texte
      out.close(); // Fermer le flux (c'esttoujours mieux de le fermer explicitement)
    }
    catch (IOException er) {}
  }

  public void actionPerformed(ActionEvent e) {
    this.sauver();
  }
}
