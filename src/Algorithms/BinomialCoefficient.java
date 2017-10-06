/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Algorithms;

public class BinomialCoefficient {

	public static void main(String[] args) {
		BinomialCoefficient solver = new BinomialCoefficient ( );
		System.out.println ( solver.solve ( 10, 5 ) );
	}

	// Part of Cosmos by OpenGenus Foundation
	public long solve(int n, int k) {
		long bc[][] = new long[n + 1][n + 1];

		for (int i = 0; i <= n; i++) {
			bc[i][0] = 1;
		}

		for (int j = 0; j <= n; j++) {
			bc[j][j] = 1;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				bc[i][j] = bc[i - 1][j - 1] + bc[i - 1][j];
			}
		}

		return bc[n][k];
	}
}
