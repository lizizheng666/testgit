package a;

public class B1 {

	public static void main(String[] args) {
		
		int ar[] = {-2,1,-3,4,-1,2,1,-5,4};
		
	    int a = Maxa(ar);
	    System.out.println(a);
	    
	}
    public static int Maxa(int arr[]){
    	int sum = 0;
    	int max = Integer.MIN_VALUE;
    	for(int nu:arr) {
    		if(sum < 0) {
    			sum  =  0;
    		}
    		sum += nu;
    		max = Math.max(sum, max);
    	}
    	max = Math.max(sum, max);
    	return max;
    }
    

 }
