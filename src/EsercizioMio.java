import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;


public class EsercizioMio extends JFrame
{
	private CellConstraints cc = new CellConstraints();
	private JRadioButton pianoMare = new JRadioButton("Visualizza piano mare");
	private JRadioButton pianoCasa = new JRadioButton("Visualizza piano casa");
	private JRadioButton pianoPalestra = new JRadioButton("Visualizza piano palestra");
	
	public EsercizioMio()
	{
		super("INVENTO IO");
		setSize(700, 300);
		setLocation(300, 300);
		setLayout(new FormLayout("40px, 200px, 15px, 150px, 15px, 200px, 15px, 150px, min" , "30px, 20px,  20px, 20px, 200px, 20px, min "));

		creazioneRadioButton();
		
		
		
		
		
		
		
		
		setVisible(true);
	}

	private void creazioneRadioButton()
	{	
		add(pianoMare, cc.xyw(2, 2, 1));
		add(pianoCasa, cc.xyw(4, 2, 1));
		add(pianoPalestra, cc.xyw(6, 2, 1));
		
		ButtonGroup gruppoBottoni = new ButtonGroup();
		gruppoBottoni.add(pianoMare);
		gruppoBottoni.add(pianoCasa);
		gruppoBottoni.add(pianoPalestra);
		controllaRadioButtonSelezionato();
	}


	private void controllaRadioButtonSelezionato()  //inizio metodo
	{
		pianoMare.addActionListener(new ActionListener()  //bisogna aggiungere l'ActionListener se si vuole che accada qualcosa quando si clicca il radioButton 
		{
			@Override
			public void actionPerformed(ActionEvent e) //dentro poi scrivo cosa deve accadere quando clicco
			{
				if(pianoMare.isSelected())   //se il radioButton è selezionato
				{
					FinestraMare finestrinaMare = new FinestraMare(EsercizioMio.this);  //apre il dialog della classe FinestraMare
				}
			}
		});
	}  //fine metodo


	public static void main(String[] args) {
		
		new EsercizioMio();

	}

}
