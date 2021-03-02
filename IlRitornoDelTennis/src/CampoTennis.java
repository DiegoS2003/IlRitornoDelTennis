
public class CampoTennis extends PrenotazioneCampoGenerico{
	private int superficie;

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public CampoTennis(String ora, String giorno, String nome, int superficie) {
		super(ora, giorno, nome);
		this.superficie=superficie;
	}

}
