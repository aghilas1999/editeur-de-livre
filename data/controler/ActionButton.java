package data.controler;

import javax.swing.JButton;
import javax.swing.UnsupportedLookAndFeelException;

import data.view.SaveFenetre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionButton extends JButton implements ActionListener {

	public ActionButton () {
		this.addActionListener(this);
		this.setText("Action");
	}

  public void actionPerformed(ActionEvent e) {
		try {
			SaveFenetre buttsave = new SaveFenetre();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
