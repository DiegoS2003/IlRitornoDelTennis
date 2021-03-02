
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JDialog;
import javax.swing.*;

public class AddSocioDialog extends JDialog implements ActionListener{
	private JLabel nome, cognome, nascita;
	private JTextField fieldNome, fieldCognome, fieldNascita;
	private JButton aggiungi;
	private ElencoSoci el;
	
	public void initComponents() {
		this.setLayout(new GridLayout(2,3));
		nome=new JLabel("Nome");
		cognome=new JLabel("Cognome");
		nascita=new JLabel("Nascita");
		
		fieldNome=new JTextField(15);
		fieldCognome=new JTextField(15);
		fieldNascita=new JTextField(15);
		
		aggiungi=new JButton("Aggiungi");
		aggiungi.addActionListener(this);
		
		this.add(nome);
		this.add(fieldNome);
		this.add(cognome);
		this.add(fieldCognome);
		this.add(nascita);
		this.add(fieldNascita);
		this.add(aggiungi);
		
		
		
	}
	
	public AddSocioDialog(JFrame f, Boolean modal, ElencoSoci el) {
		super(f,modal);
		this.el=el;
		initComponents();
	}
	
	public String getImagePath() {
		JFileChooser jfc=new JFileChooser();
		int n=jfc.showOpenDialog(this);
		if(n==JFileChooser.APPROVE_OPTION) {
			File f= jfc.getSelectedFile();
			return f.getAbsolutePath();
		}
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(aggiungi)){
			el.add(new Socio(fieldNome.getText(),fieldCognome.getText(),fieldNascita.getText(), getImagePath()));
			this.dispose();
		}
		
	}

}