package Practice;

public class Maximum_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {50,30,20,10};
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>max) {
				
				max=a[i];
			}
			
			System.out.println(max);
		}

	}

}
