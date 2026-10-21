import java.util.Objects;

public class Aluno {

	private String nome;
	private String curso;
	private static int matricula;
	
	
	
	public Aluno(String nome, String curso){
		matricula ++;
		setNome(nome);
		setCurso(curso);
	}
	
		


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public int getMatricula() {
		return matricula;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(matricula));
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}




	@Override
	public String toString() {
		return "Aluno [getNome()=" + getNome() 
		+ ", getCurso()=" + getCurso() 
		+ ", getMatricula()=" + getMatricula()
				+ "]";
	}



	
}
