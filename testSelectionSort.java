import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
	private SelectionSort temp1 = new SelectionSort();
@Test
public void test() {
	
testPositive();

}

@Test
public void test2() {
	testNegative();
}

@Test
public void test3() {
	testMixed();
}

@Test
public void test4() {
	testDuplicates();
}




    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        for(int i = 0; i < 5; i++) {
        	System.out.println(arr[i]);
        }
        
        arr = temp1.basicSelectionSort(arr);
        
        for(int i = 0; i < 5; i++) {
        	System.out.println(arr[i]);
        }
        
        for(int i = 0; i < arr.length; i++) {
        	assertTrue(arr[i] == Sortedarr[i]);
        }
    }
    
    public void testNegative(){
        
    	 int[] arr = new int[5];
         arr[0] = -4;
         arr[1] = -13;
         arr[2] = -27;
         arr[3] = -10;
         arr[4] = -2;
         
         int[] Sortedarr = new int[5];
         Sortedarr[0] = -27;
         Sortedarr[1] = -13;
         Sortedarr[2] = -10;
         Sortedarr[3] = -4;
         Sortedarr[4] = -2;
         
         for(int i = 0; i < arr.length; i++) {
         	assertTrue(arr[i] == Sortedarr[i]);
         }
         
    }
    
    public void testMixed(){
        
    	int[] arr = new int[5];
        arr[0] = -4;
        arr[1] = 5;
        arr[2] = 9;
        arr[3] = -7;
        arr[4] = 22;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -7;
        Sortedarr[1] = -4;
        Sortedarr[2] = 5;
        Sortedarr[3] = 9;
        Sortedarr[4] =  22;
        
        for(int i = 0; i < arr.length; i++) {
        	assertTrue(arr[i] == Sortedarr[i]);
        }
    }
    
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 5;
        arr[2] = 12;
        arr[3] = 2;
        arr[4] = 1;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 1;
        Sortedarr[1] = 2;
        Sortedarr[2] = 5;
        Sortedarr[3] = 12;
        Sortedarr[4] =  12;
        
        for(int i = 0; i < arr.length; i++) {
        	assertTrue(arr[i] == Sortedarr[i]);
        }
    }
}


