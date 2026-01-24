class nine{
	static String arrayTrendDetector(int[] arr){
		boolean inc = true;
		boolean dec = true;
		for(int i=1; i<arr.length; i++){
			if(arr[i] <= arr[i-1]){
				inc = false;
			}
			if(arr[i] >= arr[i-1]){
				dec = false;
			}

		}

		if(inc){
			return "increasing";
		}
		else if(dec){
			return "decreasing";
		}
		else{
			return "mixed";
		}
	}

	public static void main(String[] args){
		int[] array = {5,4,3,2,1};
		String result = arrayTrendDetector(array);
		System.out.print(result);
	}
}