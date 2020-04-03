package data.view;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import data.controler.Ouvrir;
import data.controler.Save;

public class MenuEditeur extends JMenuBar{

  protected PanneauText pt;

  protected JMenu file = new JMenu("File");//elément menu
  protected JMenu edit = new JMenu("Edit");
  protected JMenu intero = new JMenu("?");

  protected Save savior;//action
  protected Ouvrir ouv;

  protected JMenuItem empty = new JMenuItem("cut");//item menu vide
  protected JMenuItem open = new JMenuItem("open");

  public MenuEditeur(PanneauText pt){
    this.pt=pt;
    this.savior=new Save("Sauvegarder",this.pt);
    this.ouv =new Ouvrir("Ouvrir",this.pt);

    //instentiation
    this.add(this.file);
    this.add(this.edit);
    this.add(this.intero);

    this.file.add(new JMenuItem(this.savior));
    this.file.add(new JMenuItem(this.ouv));

    //test
    this.edit.add(this.empty);
    this.edit.add(new JMenuItem("copy"));
  }

}
