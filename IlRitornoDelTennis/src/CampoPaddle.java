
public class CampoPaddle extends PrenotazioneCampoGenerico {
	private int nPartecipanti;
	
	public int getnPartecipanti() {
		return nPartecipanti;
	}

	public void setnPartecipanti(int nPartecipanti) {
		this.nPartecipanti = nPartecipanti;
	}

	public CampoPaddle(String ora, String giorno, String nome, int nPartecipanti) {
		super(ora,giorno,nome);
		this.nPartecipanti=nPartecipanti;
	}
}
