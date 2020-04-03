package data.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;

public class SaveFenetre extends JFrame {


private JPanel pan= new JPanel();
  private JLabel label = new JLabel();

  public SaveFenetre() throws UnsupportedLookAndFeelException{

    pan.setLayout(new BorderLayout());
    this.setTitle("Fenetre d'action");

    this.setSize(300,300);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setLocationRelativeTo(this);
    this.setVisible(true);

  }
}
