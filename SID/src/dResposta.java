
public class dResposta {
	
	private DBConnection dbconn;

	public dResposta(DBConnection dbconn) {
		this.dbconn=dbconn;
	}
	
	private void newResposta(int respostaUtilizador, int idQuestao, String mailUtilizador) {//nao devia retornar bool para garantir q foi feito com sucesso?
		dbconn.newResposta(respostaUtilizador, idQuestao, mailUtilizador);
	}
}
