import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Window extends JFrame implements ActionListener, MouseListener{
	private JComboBox box;
	private JTable tab;
	private DefaultTableModel dft;
	private JScrollPane pane;
	private ImageIcon icon;
	private JLabel label;
	private JButton importa, esporta, aggiungi;
	private ElencoSoci els;
	private ElencoPrenotazioni elp;
	
	public void initComponents() {
		box=new JComboBox();
		box.addItem("Socio");;
		box.addItem("Tennis");
		box.addItem("Paddle");
		box.addActionListener(this);
		
		Object data[][]= {};
		String [] nomeColonne = {"1","2","3","4"};
		dft=new DefaultTableModel(data,nomeColonne);
		tab=new JTable(dft);
		pane=new JScrollPane(tab);
	}
	
	public void updateTabella() {
		dft.setRowCount(0);
		for(int j=0;j<elp.size();j++) {
			if(box.getSelectedItem().equals("Tennis")) {
				Object [] row = {""};
				dft.addRow(row);
			}
		}
	}
	public Window() {
		initComponents();
	}
	
	public static void main(String args[]) {
		Window w=new Window();
		w.setSize(600,800);
		w.setVisible(true);
	}
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
