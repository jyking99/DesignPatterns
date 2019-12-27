package ch10.strategy.E4;

public class BubbleSorter implements Sorter {
	public void sort(Comparable[] data) {
		boolean complete = false;
		
		while (!complete) {
			complete = true;
			for (int i=0; i<data.length-1; i++) {
				if (data[i].compareTo(data[i+1]) > 0) {
					complete = false;
					Comparable temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp; 
				}
			}
		}
		
	}
}
