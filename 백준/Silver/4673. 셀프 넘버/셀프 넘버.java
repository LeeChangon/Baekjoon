public class Main {
	public static void main(String[] args) {
		int[] arr = new int[9995];
		for(int i=1; i<arr.length; i++) {
			int a = i;
			int b = i;
	    	   
			while(b != 0) {
				a += b % 10;
				b /= 10;
			}
			arr[a] = 1;	
			if(a >= arr.length-1) break;
			
		}
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == 0) System.out.println(i); 
		}
	}	
}