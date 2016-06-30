import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.jgoodies.forms.layout.FormLayout;

public class FinestraMare
{
	private ImageIcon icon;
	JDialog dialog = new JDialog();
	private EsercizioMio esercizioMio;
	

	public FinestraMare(EsercizioMio esercizioMio)
	{
		icon = new ImageIcon("files/mare.bmp");
		this.esercizioMio = esercizioMio;
		dialog.setSize(440, 370);  
		dialog.setLocation(600, 400);  
		dialog.setModal(true);  //non posso spostarmi sulle altre finestre se prima non finisco su questa
		dialog.setLayout(new FormLayout("30px, 150px, 20px, 50px, 30px, 30px, 30px, 50px, min", "30px, 100px, 30px, 100px, 80px, min"));
		dialog.setTitle("PIANO MARE");
		dialog.setVisible(true);
	}

	public void paintComponent(Graphics g)
	{
		icon.paintIcon(dialog, g, 5, 5);
	}
	
	
}
