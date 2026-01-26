import java.util.Scanner;

class first{
	
	public static String smartNumberAnalyzer(int num){
		if(num==0){
			return ("Zero");
		}
		else if(num>0){
			if(num%2==0){
				return ("Positive Even");
			}
			else{
				return ("Positive Odd");
			}
		}
		else{
			return ("Negative");
		}}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		String output = smartNumberAnalyzer(num);

		System.out.print(output);

	}
	}
