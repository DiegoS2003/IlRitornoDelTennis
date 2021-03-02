import javax.swing.JDialog;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddTennisDialog extends JDialog implements ActionListener{
	private JLabel ora, giorno, nome, superficie;
	private JTextField insOra, insGiorno, insNome, insSuperficie;
	private JButton add;
	private ElencoPrenotazioni el;
	
	public AddTennisDialog(JFrame finestra, boolean modal, ElencoPrenotazioni el ) {
		super(finestra,modal);
		this.el=el;
		initComponents();
	}
	
	public void initComponents() {
		this.setLayout(new GridLayout(2,4));
		ora=new JLabel("Ora");
		giorno=new JLabel("Giorno");
		nome=new JLabel("Nome");
		superficie=new JLabel("Superficie");
		
		insOra=new JTextField(15);
		insGiorno=new JTextField(15);
		insNome=new JTextField(15);
		insSuperficie=new JTextField(15);
		
		add=new JButton("add");
		add.addActionListener(this);
		
		this.add(ora);
		this.add(insOra);
		this.add(giorno);
		this.add(insGiorno);
		this.add(nome);
		this.add(insNome);
		this.add(superficie);
		this.add(insSuperficie);
		this.add(add);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(add)) {
			el.add(new CampoTennis(insOra.getText(),insGiorno.getText(),insNome.getText(),Integer.parseInt(insSuperficie.getText())));
			this.dispose();
		}
	}
}
