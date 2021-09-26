package br.edu.infnet.projetos;
		
import java.util.Scanner;

import br.edu.infnet.auxiliar.Constante;
import br.edu.infnet.dominio.RhEscola;
import br.edu.infnet.dominio.Pessoa;
import br.edu.infnet.dominio.Professor;
		
public class TP3_Controle_Academico {
		
	private static Pessoa[] pessoas;
	
	private static void impressao(int posicao){
		
		pessoas[posicao].impressao(); 
		}	
		
	public static void main(String[] args) {
		
		pessoas = new Pessoa[Constante.QTDE];
		
		Scanner in = new Scanner(System.in);
		
		String opcao = null;
		
		int index = 0;
		
		do {
			System.out.println("[1] Cadastrar Professor");
			System.out.println("[2] Cadastrar Aluno");
			System.out.println("[3] Consultar situa��o de um docente/discente");
			System.out.println("[4] Sair");
			System.out.println("Informe a op��o desejada: ");
		
			opcao = in.next();
			
			switch (opcao) {
			case "1":
				if(index < Constante.QTDE) {				
					
					RhEscola dadosRh = new RhEscola();
					
					
					System.out.println("Informe o seu Nome: ");
					dadosRh.setNome(in.next());
					
					System.out.println("Informe a sua idade: ");
					dadosRh.setIdade(in.nextInt());
					
					System.out.println("Informe o seu Salario: ");
					dadosRh.setSalario(in.nextFloat());
					
					System.out.println("Informe o seu bonus: ");
					dadosRh.setBonus(in.nextFloat());
					
					System.out.println("Informe o seu desconto: ");
					dadosRh.setDesconto(in.nextFloat());
					
					pessoas[index] = dadosRh;
					
					System.out.println("------------------------------------");
					System.out.println("Funcio�rio cadastrado com sucesso:");
					impressao(index);
					System.out.println("------------------------------------");
					System.out.println("");
				
					index++;
				} else {
					System.out.println("------------------------------------");
					System.out.println("Imposs�vel realizar o cadastro!");
					System.out.println("------------------------------------");
					System.out.println("");
				}
				
				break;
				
			case "2":
				if(index < Constante.QTDE) {				
					
					Professor prog = new Professor();
					
					
					System.out.println("Informe o seu Nome: ");
					prog.setNome(in.next());
					
					System.out.println("Informe a sua idade: ");
					prog.setIdade(in.nextInt());
					
					System.out.println("Informe o seu Salario: ");
					prog.setSalario(in.nextFloat());
					
					System.out.println("Informe se vc � fullstack: ");
					prog.setFullstack(in.nextBoolean());
					
					System.out.println("Informe a sua linguagem: ");
					prog.setLinguagem(in.next());
					
					pessoas[index] = prog;
					
					System.out.println("------------------------------------");
					System.out.println("Funcio�rio cadastrado com sucesso:");
					impressao(index);
					System.out.println("------------------------------------");
					System.out.println("");
				
					index++;
				} else {
					System.out.println("------------------------------------");
					System.out.println("Imposs�vel realizar o cadastro!");
					System.out.println("------------------------------------");
					System.out.println("");
				}
				
				
				break;
			
			
			case "3":
				System.out.println("Informe o c�digo do funcionario: ");
				int codigo = in.nextInt();
				
				if(codigo < index) {
					impressao(codigo);
				} else {
					System.out.println("------------------------------------");
					System.out.println("Este c�digo n�o existe!");
					System.out.println("------------------------------------");
					System.out.println("");
				}
				
				break;	
			
			
			case "4":
				System.out.println("Saindo....");
				
				break;		
				
			default:
				System.out.println("Opcao inv�lida!!!");
				
				break;
			}
					
		} while(!"4".equals(opcao));
		
		System.out.println("Terminou!");
			
		in.close();
		
	}	
		
}		
		
		