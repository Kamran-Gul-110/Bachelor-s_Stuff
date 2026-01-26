import java.util.Scanner;

class second{

static int conditionalCalculator(int a, int b){
		if(a>b){
			return a-b;
		}
		else if(a==b){
			return 0;
		}
		else{
			return b-a;
		}
	}

public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	int a = in.nextInt();
	int b = in.nextInt();

	int result = conditionalCalculator(a,b);

	System.out.print(result);
}

}