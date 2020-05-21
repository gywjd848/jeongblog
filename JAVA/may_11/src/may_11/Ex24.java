package may_11;

public class Ex24 {
	public static void main(String[] args) {
		int val = 10;
		int nextX;
		
		nextX = ++val;
		System.out.printf("nextX:%d, val:%d\n", nextX, val);
		                
		nextX = val++;  
		System.out.printf("nextX:%d, val:%d\n", nextX, val);
		                
		nextX = --val;  
		System.out.printf("nextX:%d, val:%d\n", nextX, val);
		                
		nextX = val--;  
		System.out.printf("nextX:%d, val:%d\n", nextX, val);
	}                   

}
