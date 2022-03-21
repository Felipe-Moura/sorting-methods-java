package methods;

import java.util.ArrayList;

public class InsertionSort {
	
	public InsertionSort() {}
	
	public ArrayList<Integer> sort(ArrayList<Integer> list){
		
		ArrayList<Integer> sorted = new ArrayList<Integer>(list);
		int aux;
		
		for(int i = 1; i < sorted.size(); i++) {
			for(int j = i; j > 0; j--) {
				if(sorted.get(j) < sorted.get(j - 1)) {
					aux = sorted.get(j - 1);
					sorted.set(j - 1, sorted.get(j));
					sorted.set(j, aux);
				}
			}
		}
		
		return sorted;
	}

}
