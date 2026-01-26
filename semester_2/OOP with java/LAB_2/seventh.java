class seventh{
	static String decisionMaker(int a, int b){
		int res = Math.abs(a-b);
		
		double r = Math.sqrt(res);
		if(r*r == res){
			return "Perfect Square Difference";
		}
		else
		return "Not Perfect Square";
	}

	public static void main(String[] args){

		String result = decisionMaker(25,9);
		System.out.print(result);

	}
}