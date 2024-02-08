package Practice;

public class Revers_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Aniket";
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Revers String is :"+rev);

	}

}
