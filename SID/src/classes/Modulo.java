package classes;

import java.util.ArrayList;

public class Modulo {
	private String DesignacaoModulo;
	private String DesignacaoSubModulo;
	

	
	
	public Modulo(String designacaoModulo, String designacaoSubModulo) {
		super();
		DesignacaoModulo = designacaoModulo;
		DesignacaoSubModulo = designacaoSubModulo;
	}

	public String getDesignacaoModulo() {
		return DesignacaoModulo;
	}

	public void setDesignacaoModulo(String designacaoModulo) {
		DesignacaoModulo = designacaoModulo;
	}

	public String getDesignacaoSubModulo() {
		return DesignacaoSubModulo;
	}

	public void setDesignacaoSubModulo(String designacaoSubModulo) {
		DesignacaoSubModulo = designacaoSubModulo;
	}

	public static ArrayList<Modulo> getModulos(String curso) {
		ArrayList<Modulo> m= new ArrayList<Modulo>();
		// TODO Auto-generated method stub
		return null;
	}

	public static ArrayList<Modulo> getSubModulos(String modulo) {
		// TODO Auto-generated method stub
		return null;
	}

	public static /*ArrayList<*/Questao/*>*/ getQuestao(String modulo,
			String submodulo, int nivelDificuldade) {
		// TODO Auto-generated method stub
		return null;
	}

}
