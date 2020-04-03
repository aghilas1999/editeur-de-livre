package data.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import data.model.Livre;

public class PanneauText extends JPanel {

  private JTextArea Texte=new JTextArea();
  private JTextArea Question=new JTextArea();
  private JLabel ETIQUETTE= new JLabel();
  private Livre liv;
  private int current;
  //private Paragraph para;

  public PanneauText(Livre l){
    this.current=0;
    //Paragraph associé
    this.liv=l;
    //modifiable=true
    Texte.setLineWrap(true);
    //texte de base
    ETIQUETTE.setText("Paragraphe "+this.liv.getListe().get(0).GetterId());
    Texte.setText(this.liv.getListe().get(0).GetterText());
    Question.setText(this.liv.getListe().get(0).GetterQuestion());
    //position
    this.setLayout(new BorderLayout());
    this.add(ETIQUETTE,BorderLayout.NORTH);
    this.add(Texte,BorderLayout.CENTER);
    this.add(Question,BorderLayout.SOUTH);
    this.setBackground(Color.yellow);

  }

  public JTextArea getZoneTexte(){
    return this.Texte;
  }
  public JTextArea getZoneQuestion(){
    return this.Question;
  }
  public Livre getLivre(){
    return this.liv;
  }
  public int getCurrent(){
    return this.current;
  }
  public JLabel getLab(){
    return this.ETIQUETTE;
  }

  public void setLivre(Livre l){
    this.liv=l;
  }

  public void rewrite(int i){
    this.current=i;
    Texte.setText(this.liv.getListe().get(i).GetterText());
    Question.setText(this.liv.getListe().get(i).GetterQuestion());
  }
}
