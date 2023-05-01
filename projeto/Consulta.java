package ProjetoJavaFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Consulta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Paciente> usuario = new ArrayList();
		
		boolean run = true;
		
		while(run) {
			
		
		System.out.println(" _________________________________________________ ");
		System.out.println("|                                                 |");
		System.out.println("|************* Cadastro de Pacientes *************|");
		System.out.println("|                                                 |");
		System.out.println("|             1- Marcar uma Consulta              |");
		System.out.println("|             2- Consultas Marcadas               |");
		System.out.println("|             3- Buscar sua Consulta              |");
		System.out.println("|             4- Atualizar dados da Consulta      |");
		System.out.println("|             5- Desmarcar Consulta               |");
		System.out.println("|             6- Sair                             |");
		System.out.println("|                                                 |");
		System.out.println("|*************************************************|");
		System.out.println("|                                                 |");
		System.out.println("|_________________________________________________|");
		System.out.println("                                                   ");
		System.out.println("Digite sua Opção:                                  ");
		int op = sc.nextInt();
		sc.nextLine();
		
		switch(op) {
			case 1: {
				System.out.println("\n********** Marcar Consulta **********");
				System.out.println("\nDigite seu Nome: ");
				String nome = sc.nextLine();
				System.out.println("\nDigite sua Idade: ");
				String idade = sc.nextLine();
				System.out.println("\nDigite seu CPF: ");
				String cpf = sc.nextLine();
				System.out.println("\nDigite seu E-mail: ");
				String email = sc.nextLine();
				System.out.println("\nDigite a especialidade que deseja atendimento: ");
				String especialidade = sc.nextLine();
				Paciente u = new Paciente();
				
				u.setNome(nome);
				u.setIdade(idade);
				u.setCpf(cpf);
				u.setEmail(email);
				u.setEspecialidade(especialidade);
				usuario.add(u);
				System.out.println("\nConsulta Cadastrada!!!");
				
				break;
				
			}
			case 2:{
				System.out.println("\n*** Listar Consultas Marcadas  ***");
				for (int i = 0; i < usuario.size(); i++) {
				
				Paciente uTemp = usuario.get(i);
				System.out.println("\nPaciente "+(i));
				System.out.println("\tNome: " + usuario.get(i).getNome());
				System.out.println("\tIdade: " + usuario.get(i).getIdade());
				System.out.println("\tCPF: " + usuario.get(i).getCpf());
				System.out.println("\tEmail: " + usuario.get(i).getEmail());
				System.out.println("\tEspecialidade: " + usuario.get(i).getEspecialidade());
				}
				
				break;
			}
			case 3:{
				System.out.println("\n****** Buscar sua consulta ******");
				System.out.println("\nDigite seu CPF: ");
				String cpf = sc.nextLine();
				
				boolean encontrado = false;
				for (int i = 0; i < usuario.size(); i++) {
					
					Paciente uTemp = usuario.get(i);
					if(cpf.equals(uTemp.getCpf())) {
						System.out.println("Consulta encontrada...");
						System.out.println("\n\tNome: "+uTemp.getNome());
						System.out.println("\tIdade: "+uTemp.getIdade());
						System.out.println("\tCPF: "+uTemp.getCpf());
						System.out.println("\tEmail: "+uTemp.getEmail());
						System.out.println("\tEspecialidade: "+uTemp.getEspecialidade());
						encontrado = true;
						break;
					} 
					//Aqui está rodando essa opção mesmo encontrando
					if (encontrado==false) {
						System.out.println("\nUsuario com esse CPF, não foi encontrado!!!");	
					}
				}
				break;
			}
			case 4:{
				System.out.println("\n****** Atualizar dados da Consulta ******");
				for (int i = 0; i < usuario.size(); i++) {
					Paciente uTemp = usuario.get(i);
					System.out.println(+ (i) + uTemp.getNome());
				}
				
				System.out.println("\nDigite a posição da sua consulta...");
				int posicao = sc.nextInt();
				sc.nextLine();
				
				System.out.println("\nDigite novo Nome: ");
				String newNome = sc.nextLine();
				System.out.println("\nDigite nova Idade: ");
				String newIdade = sc.nextLine();
				System.out.println("\nDigite novo CPF: ");
				String newCpf = sc.nextLine();
				System.out.println("\nDigite novo E-mail: ");
				String newEmail = sc.nextLine();
				System.out.println("\nDigite uma nova especialidade que deseja atendimento: ");
				String newEspecialidade = sc.nextLine();
				
				Paciente u = usuario.get(posicao);
				u.setNome(newNome);
				u.setIdade(newIdade);
				u.setCpf(newCpf);
				u.setEmail(newEmail);
				u.setEspecialidade(newEspecialidade);
				
				break;
			}
			case 5:{
				
				System.out.println("\n****** Desmarcar Consulta ******");
				for (int i = 0; i < usuario.size(); i++) {
					Paciente uTemp = usuario.get(i);
					System.out.println( + (i) + uTemp.getNome());
				}
				
				System.out.println("\nDigite a posição da sua consulta...");
				int posicao = sc.nextInt();
				sc.nextLine();
				
				usuario.remove(posicao);
				
				break;
			}
			case 6:{
				run = false;{
					System.out.println("\n******* Obrigado, volte sempre!!! *******");
				}
				break;
				}
			}
			
		}

	}

}
