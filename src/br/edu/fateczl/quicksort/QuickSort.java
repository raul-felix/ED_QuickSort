package br.edu.fateczl.quicksort;

public class QuickSort {
	
	public QuickSort() {
		super();
	}
	
	public int[] sort(int[] vet, int inicio, int fim) {
		if (fim > inicio) {
			int posicaoPivoFixo = dividir(vet, inicio, fim);
			sort(vet, inicio, posicaoPivoFixo - 1);
			sort(vet, posicaoPivoFixo + 1, fim);
		}
		return vet;
	}
	
	private int dividir(int[] vet, int inicio, int fim) {
		int pivo = vet[inicio];
		int ponteiroEsquerda = inicio + 1;
		int ponteiroDireita = vet.length - 1;
		
		while (ponteiroEsquerda <= ponteiroDireita) {
			while (ponteiroEsquerda <= ponteiroDireita && vet[ponteiroEsquerda] <= pivo) {
				ponteiroEsquerda++;
			}
			while (ponteiroDireita >= ponteiroEsquerda && vet[ponteiroDireita] > pivo) {
				ponteiroDireita--;
			}
			if (ponteiroEsquerda < ponteiroDireita) {
				trocar(vet, ponteiroEsquerda, ponteiroDireita);
			}
		}
		trocar(vet, inicio, ponteiroDireita);
		return ponteiroDireita;
	}
	
	private void trocar(int[] vet, int i, int j) {
		int aux = vet[i];
		vet[i] = vet[j];
		vet[j] = aux;
	}

}
