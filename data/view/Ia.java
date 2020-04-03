package data.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;

import data.controler.Add;
import data.model.Livre;

public class Ia extends JFrame{

  Livre p = new Livre(5);
  PanneauText pan1 = new PanneauText(p);
  JPanel pan2 = new JPanel();
  PanButton pan3 = new PanButton(pan1);
  MenuEditeur men = new MenuEditeur(pan1);
  Unfault un = new Unfault(p);
 // JButton addP = new JButton(new Add("add", p));
   //   JPanel pan4 = new JPanel();


  public Ia(){
   
    //panel1
   pan2.add(new JScrollPane(new JTree(un)));
    pan2.setPreferredSize(new Dimension(130,300));


   this.setJMenuBar(men);

    //fenetre setting
    this.setTitle("Editeur de livres");
    this.setSize(555, 555);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setLayout(new BorderLayout());
    this.setVisible(true);


    //position panel
    this.getContentPane().add(new JScrollPane(pan1), BorderLayout.CENTER);
    this.getContentPane().add(pan2, BorderLayout.WEST);
    this.getContentPane().add(pan3, BorderLayout.SOUTH);
  }
}
