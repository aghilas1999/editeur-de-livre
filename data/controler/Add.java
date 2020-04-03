package data.controler;

import data.model.Livre;
import data.model.Paragraph;
import data.view.PanneauText;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;


public class Add extends AbstractAction{

  protected Livre fiche;

  public Add(String texte, Livre l){
  	super(texte);
    this.fiche=l;
  }
  public void actionPerformed(ActionEvent e) {
    this.fiche.ajoutP(new Paragraph());
  }

}
