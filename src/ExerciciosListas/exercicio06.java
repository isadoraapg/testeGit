package ExerciciosListas;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//06) Desafio: Fazer um programa que simula uma lista de tarefas. O programa deve permitir adicionar,
		//remover e exibir tarefas, bem como marcar tarefas como concluídas. As tarefas concluídas devem ser
		//removidas da lista e inseridas em outra (lista de tarefas concluidas)

		       
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> tarefas = new ArrayList<>();
        ArrayList<String> tarefasConcluidas = new ArrayList<>();
        
        int opcao = 0;
        
        do {
            System.out.println("Lista de Tarefas");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Exibir tarefas");
            System.out.println("5. Exibir tarefas concluídas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    scanner.nextLine(); // Limpar o buffer do teclado
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa a ser removida: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < tarefas.size()) {
                        String tarefaRemovida = tarefas.remove(indice);
                        System.out.println("Tarefa removida: " + tarefaRemovida);
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                case 3:
                    System.out.print("Digite o índice da tarefa a ser marcada como concluída: ");
                    int indiceConcluida = scanner.nextInt();
                    if (indiceConcluida >= 0 && indiceConcluida < tarefas.size()) {
                        String tarefaConcluida = tarefas.remove(indiceConcluida);
                        tarefasConcluidas.add(tarefaConcluida);
                        System.out.println("Tarefa marcada como concluída: " + tarefaConcluida);
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                case 4:
                    System.out.println("Tarefas");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(i + ". " + tarefas.get(i));
                    }
                    break;
                case 5:
                    System.out.println("Tarefas Concluídas");
                    for (int i = 0; i < tarefasConcluidas.size(); i++) {
                        System.out.println(i + ". " + tarefasConcluidas.get(i));
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            
            System.out.println();
        } 
        
        while (opcao != 0);
        
        scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
