package classes;

import java.util.ArrayList;

public class NivelDificuldade {
private String designacaoNivel;



public NivelDificuldade(String designacaoNivel) {
	super();
	this.designacaoNivel = designacaoNivel;
}

public String getDesignacaoNivel() {
	return designacaoNivel;
}

public void setDesignacaoNivel(String designacaoNivel) {
	this.designacaoNivel = designacaoNivel;
}

public static ArrayList<NivelDificuldade> getNiveis() {
	// TODO Auto-generated method stub
	return null;
}

}
