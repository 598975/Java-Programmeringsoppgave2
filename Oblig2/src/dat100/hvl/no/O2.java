package dat100.hvl.no;

public class O2 {

	public static void main(String[] args) {
		int[][] matrise = {{1,6,3},{8,4,2}};
		int[][] matrise2 = {{1,6,3},{8,4,2}};
		int[][] matrise3 = {{7,2,5},{1,7,3}};
		int tall = 2;
		
		skrivUtv1(matrise);
		
		System.out.println(tilStreng(matrise));
		
		skrivUtv1(skaler(tall, matrise3));
		
		System.out.println(erLik(matrise, matrise2));
	}
	
	public static void skrivUtv1(int[][] matrise) {
		
		for(int[] i : matrise) {
			String print = "";
			for(int o : i) {
				print += o + " ";
			}
			System.out.println(print);
		}
		
	}
	
	public static String tilStreng(int[][] matrise) {
		String print = "";
		
		for(int[] i : matrise) {
			for(int o : i) {
				print += o + " ";
			}
			print += "\n";
		}
		
		return print;
	}
	
	public static int[][] skaler(int tall, int[][] skalMatrise){
		
		for(int i = 0; i < skalMatrise.length; i++) {
			for(int o = 0; o < skalMatrise[i].length; o++) {
				skalMatrise[i][o] *= tall;
			}
		}
		
		return skalMatrise;
	}
	
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		boolean like = true;
		
		for(int i = 0; i < mat1.length; i++) {
			for(int o = 0; o < mat1[i].length; o++) {
				System.out.println(mat1[i][o] + " " + mat2[i][o]);
				if(mat1[i][o] != mat2[i][o]) {
					like = false;
				}
			}
		}
		
		return like;
	}

	
}
