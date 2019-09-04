package com.desafio.hackcode;

import java.util.Scanner;

public class Solution {
	static int sockMerchant(int n, int[] meias) {

		int logContador1 = 0;
		int pares = 0;
		int paresMeias[][] = new int[n-1][2];

		for (int contador1 = meias.length - 1; contador1 >= 0; contador1--) {

			for (int contadorInterno1 = logContador1; contadorInterno1 >= 0; contadorInterno1--) {
				
				if (paresMeias[contador1 + contadorInterno1][0] != meias[contador1]) {
					paresMeias[contador1][0] = meias[contador1];

				} else {
					paresMeias[contador1][1] += 1;
				}
			}

			logContador1++;
		}

		for (int contador2 = paresMeias.length - 1; contador2 >= 0; contador2--) {
			pares = pares++;
		}

		if (pares % 2 == 0) {
			return pares;
		} else {
			return pares - 1;
		}

	}

	public static void main(String[] args) {

		int n = 9;
		int meias[] = new int[n];
		Scanner i = new Scanner(System.in);

		for (int c = meias.length - 1; c >= 0; c--) {

			System.out.println("Meias:");
			meias[c] = i.nextInt();

		}

		int result = sockMerchant(n, meias);
		System.out.println("Resultado:"+ result);

		i.close();
	}
}