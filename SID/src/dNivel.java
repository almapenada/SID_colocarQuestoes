import java.util.ArrayList;


public class dNivel {

	private DBConnection dbconn;

	public dNivel(DBConnection dbconn) {
		this.dbconn=dbconn;
	}
	
	private ArrayList<Nivel> getNiveis() {
		return dbconn.getNiveis();
	}
}
