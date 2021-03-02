
public class PrenotazioneCampoGenerico {
	private String ora;
	private String giorno;
	private String nome;
	
	public String getOra() {
		return ora;
	}
	public void setOra(String ora) {
		this.ora = ora;
	}
	public String getGiorno() {
		return giorno;
	}
	public void setGiorno(String giorno) {
		this.giorno = giorno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public PrenotazioneCampoGenerico(String ora, String giorno, String nome) {
		this.ora = ora;
		this.giorno = giorno;
		this.nome = nome;
	}
	
}
