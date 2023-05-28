package day0529;

import java.util.Scanner;

public class chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int king = 1, queen = 1, rook = 2, bishop = 2, knight = 2, pawn = 8;
		Scanner sc = new Scanner(System.in);
		
		int lose = sc.nextInt();
		king = king - lose;
		
		lose = sc.nextInt();
		queen = queen - lose;
		
		lose = sc.nextInt();
		rook = rook - lose;
		
		lose = sc.nextInt();
		bishop = bishop - lose;
		
		lose = sc.nextInt();
		knight = knight - lose;
		
		lose = sc.nextInt();
		pawn = pawn - lose;
		
		System.out.println(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
	}
}
