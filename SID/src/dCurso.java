import java.util.ArrayList;


public class dCurso {

	private DBConnection dbconn;

	public dCurso(DBConnection dbconn) {
		this.dbconn=dbconn;
	}
	
	private ArrayList<Curso> getCursos() {
		return dbconn.getCursos();
	}
}
