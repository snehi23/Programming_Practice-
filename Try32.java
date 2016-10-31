
public class Try32 {

	public static void main(String []argh) {	
		
		String s = "abccc";
		
		System.out.println(shortPalin(s));
	}
	
	
	static int shortPalin(String s) {

		char[] charArray = s.toCharArray();
			
		int size = charArray.length;
		
		int[][] table = new int[size][size];
		
		int row, col, space;

		for (space = 1; space < size; space++)
			for (row = 0, col = space; col < size; row++, col++)
				table[row][col] = (charArray[row] == charArray[col])? table[row+1][col-1] :
							(findMininum(table[row][col-1], table[row+1][col]) + 1);
				
		return table[0][size-1];		
		
    }
	
	static int findMininum(int a, int b)
	{ return a < b ? a : b; }

}
