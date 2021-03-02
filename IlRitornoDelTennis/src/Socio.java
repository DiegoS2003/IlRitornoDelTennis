
public class Socio {
	private String nome;
	private String cognome;
	private String nascita;
	private String pathFoto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNascita() {
		return nascita;
	}
	public void setNascita(String nascita) {
		this.nascita = nascita;
	}
	public String getPathFoto() {
		return pathFoto;
	}
	public void setPathFoto(String pathFoto) {
		this.pathFoto = pathFoto;
	}
	public Socio(String nome, String cognome, String nascita, String pathFoto) {
		this.nome = nome;
		this.cognome = cognome;
		this.nascita = nascita;
		this.pathFoto = pathFoto;
	}
	
	
}
