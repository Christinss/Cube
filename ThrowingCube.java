package predavanje8;
import java.util.*;



public class ThrowingCube {

	public static void main(String[] args) {
		int[] cube = new int[6];
		for (int i = 0; i < 1000; i++) {
			int x = (int)(Math.random()*6)+1;
			cube[x-1] = cube[x-1]+1;
		}
		for(int i = 0; i < cube.length; i++){
			System.out.println(i+1+" " + cube[i]/1000.0);
		}
		// Sorting
		ArrayList<Integer> cubeLine = new ArrayList();
		ArrayList<Integer> cubeMember = new ArrayList();
		
		for(int i = 0; i < cube.length; i++){
			int max = 0;
			int counter = 0;
			
			
			for (int n = 0; n < cube.length; n++) {
				if(cube[n] > max)
				{
					max = cube[n];
					counter = n;
				}
					
			}
			cubeLine.add(brojac+1);
			cubeMember.add(cube[counter]);
			cube[counter] = 0;
		}
		for (int i = 0; i < cubeLine.size(); i++) {
			System.out.println(cubeLine.get(i)+" " + cubeMember.get(i));
		}
	
	}

}
