import java.util.ArrayList;

public class testing {

	public static void main(String[] args) {
		
		String [] arr1 = {"Selenium", "Automation", "Java"};

		String [] arr2 = {"Automation", "Selenium", "Java"};
		
		
		ArrayList<String> sarr1 = new  ArrayList<>();
		ArrayList<String> sarr2 = new  ArrayList<>();
		
		sarr1.toArray(arr1);
		sarr2.toArray(arr2);
		
		
		boolean isEqual = sarr1.equals(sarr2);
		
		System.out.println(isEqual);
		
		//String  duplicate="";
		
		
		/*for(int i=0; i<=arr1.length-1; i++) {
			
			for(int j=0; j<=arr2.length-1; j++) {
				
				
				if(arr1[i].equals(arr2[j])) {
					
					
					System.out.println(arr1[i]);
					
				}
			}
			
		
		}
		*/
		
		
		
	}

}
