public class Ternary1{
	public static void main(String args[]){
		int a=450;
		int b=45;
		int c=25;
		int islarge=a>b?a>c?a:c>b?c:b:b>c?b:c;
		System.out.println(islarge);
	}
}
