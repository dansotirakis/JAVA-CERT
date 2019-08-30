import java.util.Scanner;

public class Solution {
    static int sockMerchant(int n, int[] ar) {

    	int pares = 0;
    	int rep = 0;
		int ard[][] = new int[n][2];

    	for( int c = ar.length-1 ; c >= 0 ; c-- ) {

    		for(int cont = ar.length-1 ; cont >= 0 ; cont --) {
				if (ard[c][0] != ar[c]) {
					ard[c][0] = ar[c];
				}
			}

			for(int cont1 = ar.length-1 ; cont1 >= 0 ; cont1 --) {
				if (ard[cont1][0] == ar[cont1]) {
					ard[cont1][1] = (ard[cont1][1] + 1);
				}
			}
        	
        }
    	for(int cont3 =  ard.length-1; cont3 >= 0 ; cont3--) {
    		pares = pares + ard[cont3][1];
    	}

		if(pares % 2 == 0){
			return pares;
		}else{
			return pares;
		}
	}

    public static void main(String[] args) {

        int n = 9;
        int ar[] = new int[n];
        
        for( int c = ar.length-1 ; c >= 0 ; c-- ) {
        	
        	System.out.println("Insira um valor");
        	Scanner i = new Scanner(System.in);
        	ar[c] = i.nextInt();
        }

       int result = sockMerchant(n, ar);
       System.out.println(result);
    }
}