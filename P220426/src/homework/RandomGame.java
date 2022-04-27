package homework;

import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		int randomValue = (int)(Math.random() * 2);
		
//		switch (randomValue) {
//		case 0:
//			RPGgame rpg = new RPGgame();
//			
//			break;
//			
//		case 1:
//			ArcadeGame arcade = new ArcadeGame();
//			break;
//		}
		
		if(randomValue == 0) {
			RPGgame rpg = new RPGgame();
		   while(true) {
			
			System.out.println("===========================================");
			System.out.println("<< 1.LeftUp | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT>>");
			System.out.print("choice>>");
			choice = sc.nextInt();
			
			if(choice == 1) {
				rpg.leftUpButton();
			}else if(choice ==2) {
				rpg.leftDownButton();
			}else if(choice == 3) {
				rpg.rightUpButton();
			}else if (choice == 4) {
				rpg.rightDownButton();
			}else if (choice == 5) {
				rpg.changeMode();
			}else if (choice == 0) {
				
			}else if (choice == 9) {
				System.out.println("EXIT");
				break;
			}
			
		}
		
		} else {
			ArcadeGame arcade = new ArcadeGame();
			while(true) {
				
				System.out.println("===========================================");
				System.out.println("<< 1.LeftUp | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT>>");
				System.out.print("choice>>");
				choice = sc.nextInt();
				
				if(choice == 1) {
					arcade.leftUpButton();
				}else if(choice ==2) {
					arcade.leftDownButton();
				}else if(choice == 3) {
					arcade.rightUpButton();
				}else if (choice == 4) {
					arcade.rightDownButton();
				}else if (choice == 5) {
					arcade.changeMode();
				}else if (choice == 0) {
					
				}else if (choice == 9) {
					System.out.println("EXIT");
					break;
				}
				
			}
		}
		
		
		
	}

}
