//Java AWT (Abstract Window Toolkit). 

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

public class FinestraMare
{
	private static final long serialVersionUID = 1L;

	private CellConstraints cc = new CellConstraints();
	JDialog dialog = new JDialog();
	private EsercizioMio esercizioMio;

	private BufferedImage image;
    private int x;
    private int y;

	private Toolkit toolkit;

	private MediaTracker tracker;

    public static String getPathImmagine(){
		String currentDir = System.getProperty("user.dir");
        return currentDir+"\\files\\spongi.gif";
	}
	
	public FinestraMare(EsercizioMio esercizioMio)
	{
		this.esercizioMio = esercizioMio;
		dialog.setSize(440, 370);  
		dialog.setLocation(600, 400);  
		dialog.getContentPane().setBackground(Color.cyan);  //per poter settare il colore dello sfondo bisogna prima mettere .getContentPane, sennò non cambia colore
		dialog.setModal(true);  //non posso spostarmi sulle altre finestre se prima non finisco su questa
		dialog.setLayout(new FormLayout("30px, 150px, 20px, 50px, 30px, 30px, 30px, 50px, min", "30px, 100px, 30px, 100px, 80px, min"));
		dialog.setTitle("PIANO MARE");
		
		aggiuntaImmagine();
		
		
		
		
		
		
		dialog.setVisible(true);
	}

	
	private void aggiuntaImmagine()  
	{
		 toolkit = Toolkit.getDefaultToolkit();
		 tracker = new MediaTracker(dialog);
		 Image image = toolkit.getImage(getPathImmagine());
		 tracker.addImage(image, 0);
		 try {
			tracker.waitForAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
	
	
	
}
