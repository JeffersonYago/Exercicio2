package main;

import controller.MenorVetController;

public class Main {

	public static void main(String[] args) {
		MenorVetController mvc = new MenorVetController();
		
		int[] vet = {1,2,0,4,-1,6,7} ;
		int tamanho = vet.length - 1;
		int ultima = vet[tamanho];
		System.out.println(mvc.menorVet(vet, tamanho, ultima));
	}

}
