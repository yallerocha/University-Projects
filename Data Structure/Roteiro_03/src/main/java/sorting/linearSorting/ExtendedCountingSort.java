package sorting.linearSorting;

import sorting.AbstractSorting;

/**
 * Classe que implementa do Counting Sort vista em sala. Desta vez este
 * algoritmo deve satisfazer os seguitnes requisitos:
 * - Alocar o tamanho minimo possivel para o array de contadores (C)
 * - Ser capaz de ordenar arrays contendo numeros negativos
 */
public class ExtendedCountingSort extends AbstractSorting<Integer> {

	@Override
	public void sort(Integer[] A, int leftIndex, int rightIndex) {
		
		if(leftIndex < rightIndex) {
			for(int i = 0; i < A.length; i++) {
				A[i] = A[i] + 1;
			}
			int max = 0;                            
			int min = 0;                            
			                                        
			for(int num: A) {                       
				if(num > max) {
					max = num;
				}
				if(num < min) {
					min = num;
				}
			}
			int k = max - min + 1;  
			
			Integer[] C = new Integer[k];
			Integer[] B = new Integer[A.length];
			
			for(int i = 0; i < k; i++) {               
				C[i] = 0;                              
			} 
			for(int j = 0; j < A.length; j++) {       
				C[A[j] - min] = C[A[j] - min] + 1;         
			}
			for(int i = 1; i < k; i++) {                 
				C[i] = C[i] + C[i - 1];                
			} 
			for(int j = A.length - 1; j >= 0; j--) {  
				B[C[A[j] - min] - 1] = A[j];				   
				C[A[j] - min] = C[A[j] - min] - 1;
			}
			for(int i = 0; i < A.length; i++) {         
				A[i] = B[i] - 1;
			}
		}  
	}
}
