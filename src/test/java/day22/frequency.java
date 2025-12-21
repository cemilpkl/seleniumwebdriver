package day22;

public class frequency {

	public static void main(String[] args) {
		
		String str = "picture perfect";
		char ch = ' ';
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			count = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == ch) {
					count++;
				
				}
				
			}
			break;
			
			
		}
		
		System.out.println(ch + " : " + count);
		
	}

}
