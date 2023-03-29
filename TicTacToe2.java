package TicTacToe;

import java.lang.management.ThreadInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe2 {
	
	static List<List>winning=new ArrayList();

	public static void main(String[] args) {
		
		System.out.println("Welcome!!!");
		System.out.println();
		//Scanner sc = new Scanner(System.in);
		char [][]ch= {{' ','|',' ','|',' '},
					  {'-','+','-','+','-'},
					  {' ','|',' ','|',' '},
					  {'-','+','-','+','-'},
					  {' ','|',' ','|',' '}};
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Position: ");
			int playerPosition=sc.nextInt();
			
			playerPosition(ch, playerPosition, "player");
			
			Random r=new Random();
			int cpuPos=r.nextInt(9)+1;
			playerPosition(ch, cpuPos, "cpu");
			
			printBoard(ch);
		}
		
		
 	}
	
	public static void printBoard(char [][]ch) {
		
		for(char []ch1: ch) {
			for( char ch2:ch1) {
				System.out.print(ch2);
			}
			System.out.println();
		}
	}
	
	public static void playerPosition(char[][]ch, int playerPosition, String user) {
		
		char symbol=' ';
		
		if(user.equals("player")) {
			symbol='X';
		}
		else if(user.equals("cpu")) {
			symbol='O';
		}
		
		switch(playerPosition) {
		
			case 1:{
				ch[0][0]=symbol;
				break;
			}
			
			case 2:{
				ch[0][2]=symbol;
				break;
			}
			
			case 3:{
				ch[0][4]=symbol;
				break;
			}
			
			case 4:{
				ch[2][0]=symbol;
				break;
			}
			
			case 5:{
				ch[2][2]=symbol;
				break;
			}
			
			case 6:{
				ch[2][4]=symbol;
				break;
			}
			
			case 7:{
				ch[4][0]=symbol;
				break;
			}
			
			case 8:{
				ch[4][2]=symbol;
				break;
			}
			
			case 9:{
				ch[4][4]=symbol;
				break;
			}
		
		}
	}

	public static void checkWinner() {
		
		List topRow=Arrays.asList(1,2,3);
		List midRow=Arrays.asList(4,5,6);
		List botRow=Arrays.asList(7,8,9);
		List firstCol=Arrays.asList(1,4,7);
		List secondCol=Arrays.asList(2,5,8);
		List thirdCol=Arrays.asList(3,6,9);
		List cross1=Arrays.asList(1,5,9);
		List cross2=Arrays.asList(3,5,7);
		
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(firstCol);
		winning.add(secondCol);
		winning.add(thirdCol);
		winning.add(cross1);
		winning.add(cross2);
		
		for(List l: winning) {
			
			if(playerPosition.)
		}
	}
}
