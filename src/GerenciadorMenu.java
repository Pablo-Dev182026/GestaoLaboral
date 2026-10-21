import java.util.*;

public class GerenciadorMenu {
	Scanner tc = new Scanner(System.in);
	MenuAcoes acao = new MenuAcoes();
	
	ArrayList <Aluno> alunos = new ArrayList<Aluno>();
	ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	Set<Equipamento> equipamentos = new HashSet<Equipamento>();
	Map<Integer, Aluno> mapaAlunos = new HashMap<Integer,Aluno>();
	Map<Integer, Emprestimo> mapaEmprestimo = new HashMap<Integer, Emprestimo>();
	
	public void gerenciarMenu(){		
		
		int busca;
		int op;
		
		do {
		
			System.out.println("====== MENU DE GERENCIAMENTO ======");
			System.out.println();
			System.out.println("1- Cadastros");
			System.out.println("2- Buscar aluno");
			System.out.println("3- Buscar emprestimo");
			System.out.println("4- Listar alunos");
			System.out.println("5- Listar emprestimos");
			System.out.println("6- Listar equipamentos");
			System.out.println("0- Sair");
			System.out.printf("Escolha: ");
			op = tc.nextInt();
			
			switch(op){
			
				case 1:
					acao.cadastros();
					break;
					
				case 2:
					System.out.printf("Insira a matricula do aluno: ");
					busca = tc.nextInt();
					acao.buscaAluno(busca);
					break;
					
				case 3:
					System.out.printf("Insira ID do emprestimo: ");
					busca = tc.nextInt();
					acao.buscaEmprestimo(busca);
					break;
					
				case 4:
					System.out.println("----- Alunos -----");
					acao.listar(alunos);
					break;
					
				case 5:
					System.out.println("----- Emprestimos -----");
					acao.listar(emprestimos);
					break;
					
				case 6:
					System.out.println("----- Equipamentos -----");
					acao.listar(equipamentos);
					break;
					
				case 0:
					System.out.println("Saindo...");
					break;
					
				default: 
					System.out.println("Opcao invalida");
			}
		}while(op != 0);
		
	}
	
}
