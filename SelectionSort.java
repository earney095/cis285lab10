

public class SelectionSort {
 
/** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }
    
    /* A simple SelectionSort algorithm
     * pre-condition: 
     * post-condition:
     * inputs:
     * outputs:
     * special conditions:
     */    
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length; i++) {
            int min = i;
        	for (int j= i+1; j < x.length; j++) {
                if ( x[j] < x[min]) {
                    min = j;
                }
            } // end of inner for loop
        	int swap = x[i];
        	x[i] = x[min];
        	x[min] = swap;
        	
        } // end of outer for loop
        return x;
    } // end of basicSelectionSort method
}
