public class Emprestimo {
	
	private int id_emprestimo;
	private String aluno;
	private String equipamento;
	private String data;
	
	public Emprestimo(String aluno, String equipamento, String data) {
		id_emprestimo++;
		setAluno(aluno);
		setEquipamento(equipamento);
		setData(data);
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getId_emprestimo() {
		return id_emprestimo;
	}

	@Override
	public String toString() {
		return "Emprestimo [getAluno()=" + getAluno() 
		+ ", getEquipamento()=" + getEquipamento() 
		+ ", getData()="+ getData() 
		+ ", getId_emprestimo()=" + getId_emprestimo() + "]";
	}

	
}
