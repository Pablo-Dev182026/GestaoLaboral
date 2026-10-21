import java.util.Objects;

public class Equipamento {
	
	private String nome;
	private int status;
	private String descricao;
	private int codEquipamento;
		
	public Equipamento(String nome, String descricao, int status) {
		codEquipamento ++;
		setNome(nome);
		setStatus(status);
		setDescricao(descricao);		
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public int getCodEquipamento() {
		return codEquipamento;
	}
		

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipamento other = (Equipamento) obj;
		return Objects.equals(codEquipamento, other.codEquipamento);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codEquipamento);
	}
	
	
	
	@Override
	public String toString() {
		return "Equipamento [descricao=" + descricao 
				+ ", status=" + status 
				+ ", patrimonio=" + getCodEquipamento()
				+ "]";
	}	
}
