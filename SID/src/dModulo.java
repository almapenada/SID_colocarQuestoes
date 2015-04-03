import java.util.ArrayList;


public class dModulo {

	private DBConnection dbconn;
	
	public dModulo(DBConnection dbconn) {
		this.dbconn=dbconn;
	}
	
	private ArrayList<Modulo> getModulos(String curso) {
		return dbconn.getModulos(curso);
	}
	private ArrayList<SubModulo> getSubModulos() {
		return dbconn.getSubModulos();//nao precisa de argumentos?
	}
}
