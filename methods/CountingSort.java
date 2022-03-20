package methods;

import java.util.ArrayList;

public class CountingSort {
	
	public CountingSort() {}
	
	public ArrayList<Integer> sort(ArrayList<Integer> list){
		
		ArrayList<Integer> counter = new ArrayList<Integer>();
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		int maxValue = 0;
		
		//Acha o maior valor
		for(int i = 0; i < list.size(); i++) {
			if(i == 0) {
				maxValue = list.get(i);
			}
			else {
				if(list.get(i) > maxValue) {
					maxValue = list.get(i);
				}
			}
		}
		
		//faz o counter ter o número de casas equivalente ao maior valor
		for(int i = 0; i <= maxValue; i++) {
			counter.add(0);
		}
		
		//soma um ao valor da casa equivalente ao valor da posição de list
		for(int i = 0; i < list.size(); i++) {
			counter.set(list.get(i), counter.get(list.get(i)) + 1);
		}
		
		//Soma os valores das casas do counter para achar as posições corretas dos elementos 
		for(int i = 1; i < counter.size(); i++) {
			counter.set(i, counter.get(i) + counter.get(i - 1));
		}
		
		//faz o sorted ter o número de casas do list
		for(int i = 0; i < list.size(); i++) {
			sorted.add(0);
		}
		
		//Coloca os valores nas posições corretas
		for(int i = 0; i < list.size(); i++) {
			counter.set(list.get(i), counter.get(list.get(i)) - 1);
			sorted.set(counter.get(list.get(i)), list.get(i));
			
		}
		
		//System.out.println(counter);
		//System.out.println(sorted);
		
		return sorted;
		
	}

}
