class ten{
	static String miniDecisionEngine(int num){
		int res=0;
		String r="";
		if(num <=1){
			res = 1;
		}
		else if(num == 2){
			res = 2;
		}
		else{
			for(int i=2;i<num;i++){
				if(num%i==0){
					res = 3;
					break;
				}
				else{
					res = 4;
				}
			}
		}
		switch(res){
		case 1:
			r = "Invalid";
			break;
		case 2:
			r = "Even Prime";
			break;
		case 3:
			r = "Composite";
			break;
		case 4:
			r = "Odd Prime";
			break;
		}
		return r;
	}


	public static void main(String[] args){
		String result = miniDecisionEngine(4);

		System.out.print(result);

	}
}