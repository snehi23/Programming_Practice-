import java.util.Scanner;
import java.util.regex.Pattern;

// Day 1: Data Types!

public class Try11 {

	/*public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String x = null,y = "Primitive";
		if (in.hasNextByte())
			x = "byte";
		else if (in.hasNextShort())
			x = "short";
		else if (in.hasNextInt())
			x = "int";
		else if (in.hasNextLong())
			x = "long";
		else if (in.hasNextFloat())
			x = "float";
		else if (in.hasNextDouble())
			x = "double";
		else if (in.hasNextBoolean())
			x = "boolean";
		else if (in.hasNext(Pattern.compile("'.'")))
			x = "char";
		else if (in.hasNext(Pattern.compile("\"(.*?)\"",Pattern.DOTALL))) {
			x = "string";
			y = "Reference";
		}	
			
        System.out.println(y+" : "+x); 
	}	*/
	
	public static void main(String[] args){
		
		String x = null,y = "Primitive";
		
		Object[] objects = new Object[9];
		objects[0] = 5.35;
		objects[1] = 'a';
		objects[2] = false;
		objects[3] = 100;
		objects[4] = "I am a code monkey";
		objects[5] = true;
		objects[6] = 17.3;
		objects[7] = 'c';
		objects[8] = "derp";
		
		for (Object obj : objects) {
			
			if (obj instanceof Byte)
				x = "byte";
			else if (obj instanceof Short)
				x = "short";
			else if (obj instanceof Integer)
				x = "int";
			else if (obj instanceof Long)
				x = "long";
			else if (obj instanceof Float)
				x = "float";
			else if (obj instanceof Double)
				x = "double";
			else if (obj instanceof Boolean)
				x = "boolean";
			else if (obj instanceof Character)
				x = "char";
			else if (obj instanceof String) {
				x = "String";
				y = "Referenced";
			}
			System.out.println(y+" : "+x); 
			y = "Primitive";
		}
		
        
	}
	
}
