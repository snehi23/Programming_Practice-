import java.util.Arrays;
import java.util.Stack;

/* 
 * 	Given N ropes of lengths L1, L2, L3, L4, …, LN. I had to join every rope to get a final rope of length L1 + L2 + … + LN.
	However, I can join only two ropes at a time and the cost of joining the two ropes is L1 + L2. 
	I was supposed to join ropes in such a way that the cost is minimum.	
 * 
 */

//Connect n ropes with minimum cost
public class ConnectNRopes {
	
	public static void main(String args[]) {
		
		Integer[] list = {1,2,3,4,5};
		
		System.out.println(connectNRopes(list));
		
		
	}
	public static Integer connectNRopes(Integer[] list) {
        
        Arrays.sort(list);
        
        Integer cummulativeSum = list[0] + list[1];
        
        Integer mincost = cummulativeSum;
        
        Stack<Integer> st = new Stack<>();
        
        st.push(cummulativeSum);
        
        for(int i =2; i< list.length; i++) {
        			
        	cummulativeSum = st.pop() + list[i];
        	st.push(cummulativeSum);
        	mincost += cummulativeSum;
        	
        }
        
        return mincost;
		
        
    }
	
}	