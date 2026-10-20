import java.util.Objects;

public class Equipamento {

	private String descricao;
	private String status;
	private String codEquipamento;
	private String complementacao;
	
	public Equipamento(String descricao, String status, String codEquipamento) {
		this.codEquipamento = codEquipamento;
		setStatus(status);
		setDescricao(descricao);
		this.complementacao =  codEquipamento;
		
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getCodEquipamento() {
		return this.complementacao;
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
