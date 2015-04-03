package classes;

public class Questao {
	private String texto;
	private int resposta;
	private String explicacao;
	private String linkFich;
	private int id;
	
	
	
	public Questao(String texto, int resposta, String explicacao,
			String linkFich, int id) {
		super();
		this.texto = texto;
		this.resposta = resposta;
		this.explicacao = explicacao;
		this.linkFich = linkFich;
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getResposta() {
		return resposta;
	}
	public void setResposta(int resposta) {
		this.resposta = resposta;
	}
	public String getExplicacao() {
		return explicacao;
	}
	public void setExplicacao(String explicacao) {
		this.explicacao = explicacao;
	}
	public String getLinkFich() {
		return linkFich;
	}
	public void setLinkFich(String linkFich) {
		this.linkFich = linkFich;
	}
	

}
