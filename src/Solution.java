import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>(){
        	public int compare(int[] a, int[] b){
        		if(a[0] != b[0])
        			return -a[0] + b[0];
        		else
        			return a[1] - b[1];
        	}
        });
        
        List<int []> res = new LinkedList<>();
        
        for(int i = 0; i < people.length; i++){
        	int[] peo = people[i];
        	res.add(peo[1], people);
        }
        
        return res.toArray(new int[people.length][]);
    }
}
