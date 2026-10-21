import java.util.*;

public class MenuAcoes {
	Scanner tc = new Scanner(System.in);
		
	ArrayList <Aluno> alunos = new ArrayList<Aluno>();
	List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	Set<Equipamento> equipamentos = new HashSet<Equipamento>();
	Map<Integer, Aluno> mapaAlunos = new HashMap<Integer,Aluno>();
	Map<Integer, Emprestimo> mapaEmprestimo = new HashMap<Integer, Emprestimo>();
	
	public void cadastros(){
			
			String nome;
			String curso;
			
			String data;
		
			String descricao;
			String equipamento;
			int disponibilidade;
			
			
			int op;
			
			System.out.printf("---- OPCOES DE CADASTRO ----");
			System.out.println("");
			System.out.println("1- Cadastrar Aluno");
			System.out.println("2- Cadastrar Equipamento");
			System.out.println("3- Cadastrar Emprestimo");
			System.out.println("0- Sair");
			op = tc.nextInt();
			
			tc.nextLine();
					
			switch(op){
				case 1:
					
					System.out.printf("Nome Aluno: ");
					nome = tc.nextLine();
					
					System.out.printf("Curso: ");
					curso = tc.nextLine();
		
					Aluno a = new Aluno(nome, curso);
					alunos.add(a);
					mapaAlunos.put(a.getMatricula(), a);
					break;
					
				case 2:
					
					System.out.printf("Nome Equipamento: ");
					nome = tc.nextLine();
					
					System.out.printf("Descricao: ");	
					descricao = tc.nextLine();
					
					System.out.printf("Disponibilidade: 1- Disponivel\n2- Indisponivel");
					disponibilidade = tc.nextInt();
					
					tc.nextLine();
					
					if(disponibilidade != 1 && disponibilidade != 2){
						System.out.println("Escolha uma opcao valida");
						break;
					}
					else {
						Equipamento eq1 = new Equipamento(nome, descricao, disponibilidade);
						equipamentos.add(eq1);
					}
					break;
				case 3:
					
					System.out.printf("Nome do dono do emprestimo: ");
					nome = tc.nextLine();
					
					System.out.printf("Data: ");
					data = tc.nextLine();
					
					System.out.printf("Equipamento: ");
					equipamento = tc.nextLine();
					if(data.isEmpty() || nome.isEmpty()){
						System.out.println("Coloque uma data/nome");
						break;
					}
					else{
						Emprestimo emp1 = new Emprestimo(nome, equipamento, data);	
						mapaEmprestimo.put(emp1.getId_emprestimo(),emp1);
					}
					break;
					
				case 0:
					System.out.println("Saindo....");
					break;
				
				default: 
					System.out.println("Opcao invalida");
					break;
				}	
			}	
		
	public void listar(List<Aluno> alunos) {
	    if (alunos.isEmpty()) {
	        System.out.println("Nenhum aluno cadastrado.");
	        return;
	    }
	
	    for (Aluno aluno : alunos) {
	        System.out.println(aluno);
	    }
	}
	
	public void listar(Set<Equipamento> equipamentos) {
	    if (equipamentos.isEmpty()) {
	        System.out.println("Nenhum equipamento cadastrado.");
	        return;
	    }
	
	    for (Equipamento equipamento : equipamentos) {
	        System.out.println(equipamento);
	    }
	}
	
	public void listar(ArrayList<Emprestimo> emprestimos) {
    if (emprestimos.isEmpty()) {
        System.out.println("Nenhum emprestimo cadastrado.");
        return;
    }

    for (Emprestimo emprestimo : emprestimos) {
        System.out.println(emprestimo);
    }
}

	public void buscaAluno(int matricula){		
		Aluno a = mapaAlunos.get(matricula);
		
		if(a != null) System.out.println(a);
			
		else System.out.println("Aluno nao encontrado");		
	}
	
	public void buscaEmprestimo(int id){
		Emprestimo emp = mapaEmprestimo.get(id);
		
		if(emp != null) System.out.println(emp);
	
		else System.out.println("Emprestimo nao localizado");
	}

}















