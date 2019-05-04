public class Power {
	public static void main(String[] args) {
		System.out.println("power :::: "+power(2.0,-2.0));
		
	}
	
	private static double power(double x , double n){
	    
	    
	    if(n==0.0) {  // exit condition
	        return 1.0; 
	    } else if(n > 0.0) { // positive power
	        return (n== 1.0) ? x : x * power (x,n-1);
	    } else { // negative power
	        return (n== -1.0) ? (1/x) : (1/x) * power(x,n+1); // tricky part is figuring out n+1
	    }
	}
}