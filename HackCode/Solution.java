import java.util.Scanner;
public class Solution {
	
	
	
    static int sockMerchant(int n, int[] ar) {
    	int ard[][] = new int[n][2];
    	int pares = 0;
    	int rep = 0;
    	
    	for( int c = ar.length-1 ; c >= 0 ; c-- ) {
           	ard[c][0] = ar[c];
           	for( int t = ar.length-1 ; t >= 0 ; t-- ){
           		for (int l = ard.length-1; l >=0 ; l--) {
	           		if(ard[l][0] != ar[t]) {
	           			rep = 0; 
	           		}
	           		else { 
	           			rep = 1;
	           		}
           		}
           		if(rep == 0) {
	           		if(ard[c][0] == ar[t]) {
	           			ard[t][1] = (ard[t][1]+1);
	           		}
           		}
           	}
        	
        }
    	for(int c = ard.length-1; c >= 0 ; c--) {
    		pares = pares + ard[c][1];
    	}
    	
		return pares/8;
	}

    public static void main(String[] args) {

        int n = 9;
        int ar[] = new int[n];
        
        for( int c = 8 ; c >= 0 ; c-- ) {
        	
        	System.out.println("Insira um valor");
        	Scanner i = new Scanner(System.in);
        	ar[c] = i.nextInt();
        }

       int result = sockMerchant(n, ar);
       System.out.println(result);
    }
}