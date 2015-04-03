package controlador;

import java.util.ArrayList;

import classes.Curso;
import classes.Modulo;
import classes.NivelDificuldade;
import classes.Questao;

public class ctrlResponderQuestao {

	public ctrlResponderQuestao() {
	}

	public ArrayList<Curso> obterCursos() {
		ArrayList<Curso> listaCursos = Curso.getCursos();
		return listaCursos;
	}

	public ArrayList<Modulo> obterModulos(String curso) {
		ArrayList<Modulo> listaModulos = Modulo.getModulos(curso);
		return listaModulos;
	}

	public ArrayList<NivelDificuldade> obterNiveis() {
		ArrayList<NivelDificuldade> listaNiveis = NivelDificuldade.getNiveis();
		return listaNiveis;
	}

	public ArrayList<Modulo> obterSubModulos(String modulo) {
		ArrayList<Modulo> listaSubModulos = Modulo.getSubModulos(modulo);
		return listaSubModulos;
	}

	public Questao /* ArrayList<Questao> */obterQuestao(String modulo,
			String submodulo, int nivelDificuldade) {
		Questao /* ArrayList<Questao> */listaObterQuestao = Modulo.getQuestao(
				modulo, submodulo, nivelDificuldade);
		listaObterQuestao = new Questao("Pimba", 1, "Porque boy", "C/cansei-me",1);
		return listaObterQuestao;
	}

	public void responder(int respostaUtilizador, int idQuestao,
			String mailUtilizador) {
		// Resposta.newResposta(respostaUtilizador, idQuestao, mailUtilizador);
	}

}