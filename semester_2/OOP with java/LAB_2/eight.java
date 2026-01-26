class eight{
	public static void main(String[] args){
		int largest = Integer.parseInt(args[0]);
		int smallest = Integer.parseInt(args[0]);

		for(int i=1; i< args.length; i++){
		if(Integer.parseInt(args[i]) > largest){
			largest = Integer.parseInt(args[i]);
		}

		if(Integer.parseInt(args[i]) < smallest){
			smallest = Integer.parseInt(args[i]);
		}
	}

	System.out.println("Largest: " + largest);
	System.out.println("Smallest: " + smallest);
	System.out.print("Difference: " + (largest-smallest));
}
}