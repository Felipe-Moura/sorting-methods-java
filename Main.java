
import java.util.ArrayList;
import java.util.Random;

import metods.BubbleSort;

public class Main {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> output = null;
		int length = 10;
		
		for(int i = 0; i < length; i++) {
			list.add(rnd.nextInt(100));
		}
		
		output = new ArrayList<>(list);
		
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(output);
		
		System.out.println(list);
		System.out.println(output);

	}

}
