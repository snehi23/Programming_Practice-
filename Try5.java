import java.util.Scanner;


//test cases 
//    I/p :12:40:22AM
//    O/p : 00:40:22
//	  I/p :12:45:54PM
//    O/p : 12:45:54

public class Try5 {
	
	public static void main(String[] args){
	   
		int i, hours = 0;
		
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		
		StringBuilder input = new StringBuilder("");
		
		input.append(in);
		
		if (Integer.parseInt(input.substring(0, 2)) <= 12) {
			if(in.contains("PM")) {
				if (Integer.parseInt(input.substring(0, 2)) != 12)	{	
					hours = 12 + Integer.parseInt(input.substring(0, 2));	
					input.replace(0, 2, String.valueOf(hours));
				}	
				input.replace(8, 10,""); 
			}	
			else if (in.contains("AM"))
				if (Integer.parseInt(input.substring(0, 2)) == 12)
					input.replace(0, 2, "00");
				input.replace(8, 10,""); 
		
			System.out.println(input);

		} else {
			System.out.println("Invalid Time Format");
		}	
		
	 } 
}
