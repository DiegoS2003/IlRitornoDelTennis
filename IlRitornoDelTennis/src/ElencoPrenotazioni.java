import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;



public class ElencoPrenotazioni extends ArrayList<PrenotazioneCampoGenerico>{
	public ElencoPrenotazioni() {
		super();
	}
	public String creaCsv() {
		String csv=null;
		for(int i=0;i<this.size();i++) {
			if(this.get(i) instanceof CampoTennis) {
				CampoTennis a = (CampoTennis) this.get(i);
				csv+="CampoTennis:"+";"+a.getOra()+";"+a.getGiorno()+";"+a.getNome()+";"+ String.valueOf(a.getSuperficie())+"\n";
			}
			if(this.get(i) instanceof CampoPaddle) {
				CampoPaddle b=(CampoPaddle)this.get(i);
				csv+="CampoPaddle"+b.getOra()+";"+b.getGiorno()+";"+b.getNome()+";"+String.valueOf(b.getnPartecipanti())+"\n";
			}
		}
		return csv;
	}
	
	public void SaveTxt(JFrame finestra) throws IOException {
		JFileChooser jfc=new JFileChooser();
		jfc.setFileFilter(new TxtFileFilter());
		int n = jfc.showOpenDialog(finestra);
		if(n==JFileChooser.APPROVE_OPTION) {
			File f=jfc.getSelectedFile();
			FileWriter fw=new FileWriter(f);
			fw.write(this.creaCsv());
			fw.flush();
			fw.close();
		}
	}
	
	public void readTxt(JFrame finestra) throws IOException {
		JFileChooser jfc=new JFileChooser();
		jfc.setFileFilter(new TxtFileFilter());
		int n=jfc.showOpenDialog(finestra);
		if(n==JFileChooser.APPROVE_OPTION) {
			File f=jfc.getSelectedFile();
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String line=null;
			while((line=br.readLine()) !=null) {
				String cells[]=line.split(";");
				if(cells[0].equals("CampoTennis")) {
					this.add(new CampoTennis(cells[1],cells[2],cells[3], Integer.parseInt(cells[4])));
				}
				if(cells[0].equals("CampoPaddle")) {
					this.add(new CampoPaddle(cells[1],cells[2],cells[3], Integer.parseInt(cells[4])));
				}
			}
		}
	}
	
	public ElencoPrenotazioni readBin(JFrame finestra) throws IOException, ClassNotFoundException {
		JFileChooser jfc=new JFileChooser();
		int n=jfc.showOpenDialog(finestra);
		if(n==JFileChooser.APPROVE_OPTION) {
			File f=jfc.getSelectedFile();
			FileInputStream fis= new FileInputStream (f);
			ObjectInputStream ois=new ObjectInputStream(fis);
			return (ElencoPrenotazioni) ois.readObject();
		}
		return null;
	}
	
	public void writeBin(JFrame finestra, ElencoPrenotazioni p) throws IOException {
		JFileChooser jfc=new JFileChooser();
		int n=jfc.showSaveDialog(finestra);
		if(n==JFileChooser.APPROVE_OPTION) {
			File f=jfc.getSelectedFile();
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream (fos);
			oos.writeObject(p);
			oos.close();
		}
	}

}
