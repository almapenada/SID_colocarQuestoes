import java.util.ArrayList;


public class dQuestao {

	private DBConnection dbconn;

	public dQuestao(DBConnection dbconn) {
		this.dbconn=dbconn;
	}
	
	private ArrayList<Questao> getQuestao(String modulo, String subModulo, int nivelDificuldade) {
		return dbconn.getQuestao(modulo, subModulo, nivelDificuldade);
	}
	
	private String getExplicacao(int dQuestao) {
		return dbconn.getExplicacao(dQuestao);
	}
	
}
