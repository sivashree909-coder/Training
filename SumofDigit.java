public class SumofDigit{
	public static void main(String args[]){
		int a=4567;
		int sum=0;
		sum=sum+a%10;
		a=a/10;
		sum=sum+a%10;
		a=a/10;
		sum=sum+a%10;
		a=a/10;
		sum=sum+a%10;
	        System.out.println(sum);
	}
}