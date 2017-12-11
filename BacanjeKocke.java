package predavanje8;
import java.util.*;



public class BacanjeKocke {

	public static void main(String[] args) {
		int[] kocka = new int[6];
		for (int i = 0; i < 1000; i++) {
			int x = (int)(Math.random()*6)+1;
			kocka[x-1] = kocka[x-1]+1;
		}
		for(int i = 0; i < kocka.length; i++){
			System.out.println(i+1+" " + kocka[i]/1000.0);
		}
		// Sortiranje
		ArrayList<Integer> kockaRed = new ArrayList();
		ArrayList<Integer> kockaClan = new ArrayList();
		
		for(int i = 0; i < kocka.length; i++){
			int max = 0;
			int brojac = 0;
			
			
			for (int n = 0; n < kocka.length; n++) {
				if(kocka[n] > max)
				{
					max = kocka[n];
					brojac = n;
				}
					
			}
			kockaRed.add(brojac+1);
			kockaClan.add(kocka[brojac]);
			kocka[brojac] = 0;
		}
		for (int i = 0; i < kockaRed.size(); i++) {
			System.out.println(kockaRed.get(i)+" " + kockaClan.get(i));
		}
	
	}

}
