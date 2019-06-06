package model;

public class Professor extends Funcionario {
	
	private String []disciplina;
	private String []cursos;
	
	// Disciplina
	
	public String [] getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String [] disciplina) {
		this.disciplina = disciplina;
	}
	
	// Cursos
	
	public String [] getCursos() {
		return cursos;
	}
	public void setCursos(String [] cursos) {
		this.cursos = cursos;
	}
	
	
}
