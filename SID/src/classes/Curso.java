package classes;

import java.util.ArrayList;

public class Curso {
	private String siglaCurso;
	private String designacaoCurso;
	
	
	public Curso(String siglaCurso, String designacaoCurso) {
		super();
		this.siglaCurso = siglaCurso;
		this.designacaoCurso = designacaoCurso;
	}
	
	
	public String getSiglaCurso() {
		return siglaCurso;
	}
	public void setSiglaCurso(String siglaCurso) {
		this.siglaCurso = siglaCurso;
	}
	public String getDesignacaoCurso() {
		return designacaoCurso;
	}
	public void setDesignacaoCurso(String designacaoCurso) {
		this.designacaoCurso = designacaoCurso;
	}


	public static ArrayList<Curso> getCursos() {
		// TODO Auto-generated method stub
		ArrayList<Curso> a= new ArrayList<Curso>();
		Curso lei= new Curso("LEI","LEI");
		Curso eti= new Curso("ETI","LEI");
		Curso ige= new Curso("IGE","LEI");
		a.add(ige);
		a.add(eti);
		a.add(lei);
		return a;
	}


}
