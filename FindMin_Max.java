package arrayproblems;

class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

public class FindMin_Max {
    static Pair getMinMax(long a[], long n)  
    {
        Long min_value = min(a,n);
        Long max_value = max(a,n);
        Pair p = new Pair(max_value,min_value);
        return p;
     
    }

	public static void main(String[] args) {
		long[] a = {10,12,166,177,134,13,17};
		long n = a.length;
		/*long max_value = max(a,n);
		long min_value = min(a,n);
		System.out.println("max_value: "+max_value);
		System.out.println("min_value: "+min_value);*/
		//System.out.println(p);
	
		FindMin_Max fm = new FindMin_Max();
		Pair product = fm.getMinMax(a, n);
		System.out.println(product.second+" "+product.first);

	}
	
	public static long max(long a[], long n) {
		long max = a[0];
		 for (int i=1;i<n;i++) {
			 if(a[i] > max) {
				 max = a[i];
			 }
			 
		 }
		 return max;
	}
	public static long min(long a[], long n) {
		long min = a[0];
		 for (int i=1;i<n;i++) {
			 if(a[i] < min) {
				 min = a[i];
			 }
			 
			 
		 }
		 return min;
	}
}
