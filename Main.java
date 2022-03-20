
import java.util.ArrayList;
import java.util.Random;

import methods.BubbleSort;
import methods.CountingSort;

public class Main {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> output = null;
		int length = 10;
		
		for(int i = 0; i < length; i++) {
			list.add(rnd.nextInt(100));
		}
		
		
		//BubbleSort bubbleSort = new BubbleSort();
		//output = new ArrayList<>(bubbleSort.sort(list));
		
		
		CountingSort countingSort = new CountingSort();
		output = new ArrayList<>(countingSort.sort(list));
		
		
		System.out.println(list);
		System.out.println(output);

	}

}
