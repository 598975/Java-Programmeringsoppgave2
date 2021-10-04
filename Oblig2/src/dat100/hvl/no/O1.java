package dat100.hvl.no;

public class O1 {

	public static void main(String[] args) {
		int[] tab = {1,7,4,2};
		int[] tab2 = {2,3,12,1};
		
		skrivUt(tab);
		
		System.out.println(tilStreng(tab));
		
		System.out.println(summer(tab));
		
		System.out.println(finnesTall(tab, 8));
		
		System.out.println(posisjonTall(tab, 2));
		
		skrivUt(reverser(tab));
		
		System.out.println(erSortert(tab));
		
		skrivUt(settSammen(tab, tab2));
	}
	
	public static void skrivUt (int[] tabell) {
		String print = "";
		
		for(int i = 0; i < tabell.length; i++){
			print += tabell[i] + " ";
		}
		
		System.out.println(print);
	}
	
	public static String tilStreng (int[] tabell) {
		String print = "[";
		
		for(int i = 0; i < tabell.length; i++){
			print += tabell[i];
			if(i != tabell.length-1) {
				print += ",";
			}
		}
		
		print += "]";
		return print;
	}
	
	public static int summer (int[] tabell) {
		int sum = 0;
		
		//for(int i = 0; i < tabell.length; i++) {
		//	sum += tabell[i];
		//}
		
		//int i = 0;
		//while(i < tabell.length) {
		//	sum += tabell[i];
		//	i++;
		//}
			
		for(int i : tabell) {
			sum += i;
		}
		
		return sum;
	}
	
	public static boolean finnesTall (int[] tabell, int tall) {
		boolean finnes = false;
		
		for(int i : tabell) {
			if(i == tall) {
				finnes = true;
			}
		}
		
		return finnes;
	}
	
	public static int posisjonTall (int[] tabell, int tall) {
		int posisjon = -1;
		
		for(int i = 0; i < tabell.length; i++) {
			if(tabell[i] == tall) {
				posisjon = i;
			}
		}
		
		return posisjon;
	}
	
	public static int[] reverser(int[] tabell) {
		int[] revers = new int[tabell.length];
		
		for(int i = 0; i < tabell.length; i++) {
			int x = tabell[tabell.length-1-i];
			revers[i] = x;
			
		}
		
		return revers;
	}
	
	public static boolean erSortert (int[] tabell) {
		boolean sortert = true;
		
		for(int i = 1; i < tabell.length; i++) {
			if(tabell[i] < tabell[i-1]) {
				sortert = false;
			}
		}
		
		return sortert;
	}
	
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		int[] sammen = new int[tabell1.length + tabell2.length];
		
		for(int i = 0; i < tabell1.length + tabell2.length; i++) {
			if(i < tabell1.length) {
				sammen[i] = tabell1[i];
			}else {
				sammen[i] = tabell2[i-tabell1.length];
			}
		}
		
		return sammen;
	}
	
	
}
