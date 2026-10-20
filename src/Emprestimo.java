public class Emprestimo {
	
	private String aluno;
	private String equipamento;
	private String data;
	
	public Emprestimo(String aluno, String equipamento, String data) {
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

	@Override
	public String toString() {
		return "Emprestimo [aluno=" + aluno 
				+ ", equipamento=" + equipamento 
				+ ", data=" + data 
				+ "]";
	}
}
