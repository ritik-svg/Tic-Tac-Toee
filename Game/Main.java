package Engine;

import java.util.*;

public class Main extends game_logic{
	static String mainBoard[][];
	Main(String updatedBoard[][]) {
		super(updatedBoard);
		mainBoard=updatedBoard;
	}
	public void print() {
	    for(int i = 0; i < 3; i++) {
	        for(int j = 0; j < 3; j++) {
	            System.out.print(mainBoard[i][j]);
	            if (j < 2) {
	                System.out.print(" | ");
	            }
	        }
	        System.out.println();
	    }
	}
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		String x[][]=new String[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				x[i][j]=" ";
			}
		}
		Main ob = new Main(x);
		int count=1;
		boolean Win=false;
		do {
			if(count%2!=0) {
				count++;
				System.out.println(" Player I's turn ");
				System.out.println(" Enter the coordinates of the square where you want to play ");
				System.out.println(" 00 | 01 | 02 ");
				System.out.println(" 10 | 11 | 12 ");
				System.out.println(" 20 | 21 | 22 ");
				while(true) {
					int i=in.nextInt();
					int j=in.nextInt();
					if(i >= 0 && i < 3 && j >= 0 && j < 3 && mainBoard[i][j].equals(" ")) {
						mainBoard[i][j]="X";
						break;
					}
					else {
						System.out.println("The space is already filled. Please enter a suitable empty place: ");
						continue;
					}
				}
			}
			else {
				count++;
				System.out.println(" Player II's turn ");
				System.out.println(" Enter the coordinates of the square where you want to play ");
				System.out.println(" 00 | 01 | 02 ");
				System.out.println(" 10 | 11 | 12 ");
				System.out.println(" 20 | 21 | 22 ");
				while(true) {
					int i=in.nextInt();
					int j=in.nextInt();
					if(i >= 0 && i < 3 && j >= 0 && j < 3 && mainBoard[i][j].equals(" ")) {
						mainBoard[i][j]="O";
						break;
					}
					else {
						System.out.println("The space is already filled. Please enter a suitable empty place: ");
						continue;
					}
				}
			}
			
			ob.print();
			
			System.out.println();
			System.out.println();
			
			game_logic ob2 = new game_logic(mainBoard);
			
			Win = ob2.isWin();
			
			
			
		}while(Win==false&&count<=9);
		
		if(count == 10)
			System.out.println("Game is a draw");
		else 
			System.out.println((count-1)%2==0?"player II wins":"player I wins");
		in.close();
	}
}
