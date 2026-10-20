import java.util.*;

public class GestaoLaboralMain {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		List<Aluno>	alunos = new ArrayList<Aluno>();
		Set<Equipamento> equipamentos = new HashSet<Equipamento>();
		Map<Integer, Aluno> mapaAlunos = new HashMap<Integer,Aluno>();
		List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
		
		
		Aluno a1 = new Aluno ("Pablo", "Desenvolvimento de Sistemas", 1);
		Aluno a2 = new Aluno ("Montenegro", "Desenvolvimento de Sistemas", 2);
		Equipamento emp1 = new Equipamento("Indisponivel", "Projetor X55", "E001");
		Equipamento emp2 = new Equipamento("Disponivel", "Projetor X44", "E002");
		Equipamento emp3 = new Equipamento("Indisponivel", "Projetor X55", "E001");
		Emprestimo E1 = new Emprestimo("Pablo","Projetor X55","2026-10-20");
		
		alunos.add(a1);
		equipamentos.add(emp1);
		emprestimos.add(E1);
		equipamentos.add(emp2);
		equipamentos.add(emp3);
		
		mapaAlunos.put(1,a1);
		mapaAlunos.put(2, a2);
		
		for (Equipamento equipamento : equipamentos) {			
			System.out.println(equipamento);
		}
		
		for (Emprestimo emprestimo : emprestimos) {
			System.out.println(emprestimo);
		}
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		
		int busca_aluno;
		int matricula;
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("Escolha a matricula para procurar o aluno");
		matricula = tc.nextInt();
		
		
		Aluno aluno =  mapaAlunos.get(matricula);
		
		if(aluno != null) 
			System.out.println(aluno);
		
		else 
			System.out.println("Aluno nao encontrado");
		
	}

}
