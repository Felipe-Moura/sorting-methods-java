package methods;

import java.util.ArrayList;

public class SelectionSort {
	
	public SelectionSort() {}
	
	public ArrayList<Integer> sort(ArrayList<Integer> list){
		
		ArrayList<Integer> output = new ArrayList<Integer>(list);
		int min, aux;
		
		for(int i = 0; i < output.size() - 1; i++) {
			
			min = i;
			
			for(int j = i + 1; j < output.size(); j++) {
				if(output.get(j) < output.get(min)) {
					min = j;
				}
			}
			
			if(min != i) {
				aux = output.get(i);
				output.set(i, output.get(min));
				output.set(min, aux);
			}
		}
		
		return output;
	}

}
