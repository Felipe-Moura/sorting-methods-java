package methods;

import java.util.ArrayList;

public class MergeSort {
	
	public MergeSort() {}
	
	public ArrayList<Integer> sort(ArrayList<Integer> list){
		
		if(list.size() == 1) {
			return list;
		}
		
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		
		//Divide list in half
		for(int i = 0; i < list.size(); i++) {
			if(i < list.size()/2) {
				array1.add(list.get(i));
			}
			else {
				array2.add(list.get(i));
			}
		}
		
		//Call itself recursively
		array1 = this.sort(array1);
		array2 = this.sort(array2);
		
		//Merge the sorted arrays
		return merge(array1, array2);
	}
	
	
	public ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2){
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		//Sort the elements of the lists in output until one list gets empty
		while(!(list1.isEmpty() || list2.isEmpty())) {
			if(list1.get(0) < list2.get(0)) {
				output.add(list1.get(0));
				list1.remove(0);
			}
			else {
				output.add(list2.get(0));
				list2.remove(0);
			}
		}
		
		//Put the remaining elements of the non empty list in output
		while(!list1.isEmpty()) {
			output.add(list1.get(0));
			list1.remove(0);
		}
		
		
		while(!list2.isEmpty()) {
			output.add(list2.get(0));
			list2.remove(0);
		}
		
		return output;
	}

}
