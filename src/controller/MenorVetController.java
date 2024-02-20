package controller;

public class MenorVetController {

	public MenorVetController() {
		super();
	}
	public int menorVet(int[] vet, int tamanho, int ultima) {
		if (tamanho == 0) {
//assim que tamanho chega a zero, a chamada é interrompida pois não há posição negativa num vetor
			return ultima;
		}else {
			if(vet[tamanho - 1] < ultima) {
				ultima = vet[tamanho - 1];
			}
			return menorVet(vet, tamanho - 1, ultima);
//se subtrai 1 de tamanho afim de percorrer o vetor à cada nova chamada 
		}
	}
}
