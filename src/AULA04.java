import java.util.ArrayList;
import java.util.List;

public class AULA04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> frutas = new ArrayList<>();
		frutas.add("Maçã");
		frutas.add("Banana");
		
		
		String elementoBuscado = "Banana";
		
		int posicao = frutas.indexOf(elementoBuscado);
		
		if (posicao != 1) {
			System.out.println("O elemento \"" + elementoBuscado + "\" está na posição" + posicao);
		}else {
			System.out.println("O elemento \"" + elementoBuscado + "\" não foi encontrado");
		}
		
		
		int index = 0; 
		
		
		
		
	}

}
