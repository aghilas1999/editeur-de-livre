package data.view;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.BoxLayout;

import data.controler.ActionButton;
import data.controler.NextButton;
import data.controler.PreviousButton;
import data.view.PanneauText;


public class PanButton extends JPanel{

  public PanButton(PanneauText pan1){
    ActionButton button1 = new ActionButton();
    PreviousButton button2 = new PreviousButton(pan1);
    NextButton button3 = new NextButton(pan1);

    this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    this.add(button1);
    this.add(button2);
    this.add(button3);

  }

}
