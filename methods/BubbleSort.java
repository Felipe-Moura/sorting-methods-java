package methods;

import java.util.ArrayList;

public class BubbleSort {
	
	public BubbleSort(){}
	
	public ArrayList<Integer> sort(ArrayList<Integer> list){
		
		Integer aux = 0;
		ArrayList<Integer> myList = new ArrayList<>(list);
		
		//Sort the elements verifying if the element is bigger than its successor
		for(int i = 1; i < myList.size(); i++) {
			for(int j = 0; j < myList.size()-1; j++) {
				if(myList.get(j) > myList.get(j + 1)) {
					aux = myList.get(j);
					myList.set(j, myList.get(j+1));
					myList.set(j+1, aux);
				}
			}
		}
		
		return myList;
	}

}
