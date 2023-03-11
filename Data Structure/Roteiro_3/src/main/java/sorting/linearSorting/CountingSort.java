package sorting.linearSorting;

import sorting.AbstractSorting;

/**
 * Classe que implementa a estratégia de Counting Sort vista em sala.
 *
 * Procure evitar desperdício de memória: AO INVÉS de alocar o array de contadores
 * com um tamanho arbitrariamente grande (por exemplo, com o maior valor de entrada possível),
 * aloque este array com o tamanho sendo o máximo inteiro presente no array a ser ordenado.
 *
 * Seu algoritmo deve assumir que o array de entrada nao possui numeros negativos,
 * ou seja, possui apenas numeros inteiros positivos e o zero.
 *
 */
public class CountingSort extends AbstractSorting<Integer> {

	@Override
	public void sort(Integer[] A, int leftIndex, int rightIndex) {
		
		if(A.length <= 1) {
			return;
		}
		for(int i = 0; i < A.length; i++) {
			A[i] = A[i] + 1;
		}
		int k = A[0];
		for(int num: A) {
			if(num > k) {
				k = num;
			}
		}                                          
		Integer[] C = new Integer[k + 1];
		Integer[] B = new Integer[A.length];
		
		for(int i = 0; i < k; i++) {               
			C[i] = 0;                              
		} 
		for(int j = 0; j < A.length; j++) {       
			C[A[j] - 1] = C[A[j] - 1] + 1;         
		}
		for(int i = 1; i < k; i++) {                 
			C[i] = C[i] + C[i - 1];                
		}
		for(int j = A.length - 1; j >= 0; j--) {  
			B[C[A[j] - 1] - 1] = A[j];				   
			C[A[j] - 1] = C[A[j] - 1] - 1;
		}
		for(int i = 0; i < A.length; i++) {         
			A[i] = B[i] - 1;
		}
	}
}