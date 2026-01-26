class fourth{

	static String gradingSystem(int marks){
	String result="";
			switch(marks){
			case 10:
				result = "Distinction";
				break;
			case 9:
				result = "Excellent";
				break;
			
			case 8:
				result = "Very Good";
				break;
			
			default:
				result = "Fail";
				break;
			}
		return result;
		}


	public static void main(String[] args){
		String a = gradingSystem(8);
		System.out.print(a);
	}
}