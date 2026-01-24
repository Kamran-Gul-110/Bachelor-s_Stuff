import java.util.Scanner;
class First{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int arr[] = {2,45,3,44,67};
		int largest = arr[0];

		for(int i=1; i<5;i++){
			if(arr[i]>largest){
				largest = arr[i];
			}
		}

	//Task 1
	System.out.println("\n\tTask 1");
	System.out.println("The largest number is: " + largest);
	boolean found = false;
	int evenCount = 0, oddCount = 0;

	//Task 2
	System.out.println("\n\tTask 2");
	System.out.print("Enter your number to search: ");
	int num = input.nextInt();
	for(int i=0; i<5;i++){
			if(arr[i]==num){
				found = true;
			}
			if(arr[i] % 2 == 0){
				evenCount++;
			}
			else{
				oddCount++;
			}
		}
	if(found){
		System.out.println("Number found");
	}
	else {
		System.out.println("Number Not found");
	}

	//Task 3
	System.out.println("\n\tTask 3");
	System.out.println("The array has " + evenCount + " even numbers");
	System.out.println("The array has " + oddCount + " odd numbers");


	//Task 4
	System.out.println("\n\tTask 4");
for(int i=1; i<=5;i++){
				System.out.print(arr[arr.length - i] + ", ");
		}

}
}