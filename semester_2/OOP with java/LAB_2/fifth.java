class fifth{

	static boolean patternValidator(String str){
			if(
				(str.length() >=6 ) &&
				(((int)str.charAt(0) >=65) && ((int)str.charAt(0) < 96 ))
				&&
				((int)str.charAt(str.length()-1) <58) 
			)
			{
				return true;
			}
			
			else 
				return false;
	}


	public static void main(String[] args){
		String str = "HelloWorld9";

		boolean res = patternValidator(str);
		System.out.print(res);
	}
}