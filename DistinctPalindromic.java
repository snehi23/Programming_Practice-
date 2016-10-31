import java.util.HashSet;

import java.util.Set;

public class DistinctPalindromic {

public static void main(String[] args) {

DistinctPalindromic.findDistinctPalidromes("snehallahens");

}

public static void findDistinctPalidromes(String s1) {

	Set<String> distinctPalindromSet = new HashSet<String>();
	char stringToCharArray[] = s1.toCharArray();

		int i = 0;

		while (i < stringToCharArray.length) {

				DistinctPalindromic.fetchDistinct(i, distinctPalindromSet, stringToCharArray, s1);
				i++;
		}

		System.out.println(distinctPalindromSet);

}

public static void fetchDistinct( int pivot, Set<String> distinctPalindromSet , char stringToCharArray[] , String s1){

	StringBuilder str = new StringBuilder();
	str.append(s1);
	int j = pivot;

	while (j < stringToCharArray.length) {

		StringBuilder partialString = new StringBuilder();
		StringBuilder partialReverseString = new StringBuilder();
		partialString.append(str.substring(pivot, j+1));
		partialReverseString.append(str.substring(pivot, j+1)).reverse();
		if(partialString.toString().equals(partialReverseString.toString())) {
			distinctPalindromSet.add(str.substring(pivot, j+1));
		}	
		j++;
	}
}

}