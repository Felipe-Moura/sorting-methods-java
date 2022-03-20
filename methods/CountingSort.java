package methods;

import java.util.ArrayList;

public class CountingSort {
	
	public CountingSort() {}
	
	public ArrayList<Integer> sort(ArrayList<Integer> list){
		
		ArrayList<Integer> counter = new ArrayList<Integer>();
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		int maxValue = 0;
		
		//Find the max value of list
		maxValue = findMaxValue(list);
		
		//Fill counter with maxValue elements 
		fillArray(counter, maxValue);
		
		//Fill sorted with list.size()-1 elements
		fillArray(sorted, list.size()-1);
		
		//Stores the number of occurrences of elements from list
		for(int i = 0; i < list.size(); i++) {
			counter.set(list.get(i), counter.get(list.get(i)) + 1);
		}
		
		//Find the correct position of the elements from list
		for(int i = 1; i < counter.size(); i++) {
			counter.set(i, counter.get(i) + counter.get(i - 1));
		}
		
		//Store the values of list in the correct position of sorted
		for(int i = 0; i < list.size(); i++) {
			counter.set(list.get(i), counter.get(list.get(i)) - 1);
			sorted.set(counter.get(list.get(i)), list.get(i));
			
		}
		
		return sorted;
		
	}
	
	//Given a list of positive integers, find the biggest one
	public int findMaxValue(ArrayList<Integer> list) {
		
		int maxValue = 0;
		
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
		
		return maxValue;
	}
	
	//Fill a array with the given size
	public void fillArray(ArrayList<Integer> list, int size) {
		
		for(int i = 0; i <= size; i++) {
			list.add(0);
		}
		
	}

}
